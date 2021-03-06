package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Mp4SeekTable implements SeekTable {
    private final Map<String, IMpeg4Box> essentialStblChunkMap = new HashMap();
    private final Mdhd mdhd;

    public Mp4SeekTable() {
        this.essentialStblChunkMap.put("stco", new Stco());
        this.essentialStblChunkMap.put("co64", new Co64());
        this.essentialStblChunkMap.put("stts", new Stts());
        this.essentialStblChunkMap.put("stsc", new Stsc());
        this.essentialStblChunkMap.put("stsz", new Stsz());
        this.mdhd = new Mdhd();
    }

    public void parse(InputStream inputStream) {
        Parsable parsableInputStreamWrapper = new ParsableInputStreamWrapper(inputStream);
        if (seekTo(parsableInputStreamWrapper, "moov.trak.mdia") == null) {
            throw new InvalidBoxException("invalid mp4: no [mdia] was found!");
        }
        Map hashMap = new HashMap(2);
        hashMap.put("mdhd", this.mdhd);
        hashMap.put("minf", new GhostBox());
        parseChunks(parsableInputStreamWrapper, hashMap, null);
        if (seekTo(parsableInputStreamWrapper, "stbl") == null) {
            throw new InvalidBoxException("invalid mp4: no [stbl] was found!");
        }
        parseChunks(parsableInputStreamWrapper, this.essentialStblChunkMap, new Function1<HashSet<String>, Boolean>() {
            public Boolean call(HashSet<String> hashSet) {
                return Boolean.valueOf(Mp4SeekTable.needMoreChunks(hashSet));
            }
        });
    }

    public long seek(long j) {
        return seekInternal((int) Math.round(((double) (((long) this.mdhd.getTimeScale()) * j)) / 1000.0d));
    }

    private long seekInternal(int i) {
        long offsetOfChunk;
        int[] iArr = new int[2];
        int sampleOfTime = sampleOfTime((Stts) this.essentialStblChunkMap.get("stts"), i);
        chunkOfSample((Stsc) this.essentialStblChunkMap.get("stsc"), sampleOfTime, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (((IMpeg4Box) this.essentialStblChunkMap.get("stco")).getSize() != 0) {
            offsetOfChunk = (long) offsetOfChunk((Stco) this.essentialStblChunkMap.get("stco"), i2);
        } else if (((IMpeg4Box) this.essentialStblChunkMap.get("co64")).getSize() != 0) {
            offsetOfChunk = offset64OfChunk((Co64) this.essentialStblChunkMap.get("co64"), i2);
        } else {
            throw new RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
        }
        return ((long) offsetOfSampleInChunk((Stsz) this.essentialStblChunkMap.get("stsz"), sampleOfTime, i3)) + offsetOfChunk;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void chunkOfSample(Stsc stsc, int i, int[] iArr) {
        int i2;
        int entryCount = stsc.getEntryCount();
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i2 = stsc.getFirstChunk()[i6];
            int i7 = (i2 - i4) * i3;
            if (i < i5 + i7) {
                break;
            }
            i3 = stsc.getSamplesPerChunk()[i6];
            if (i6 < entryCount) {
                i4 = i5 + i7;
                i5 = i6 + 1;
            } else {
                i4 = i5;
                i5 = i6;
            }
            if (i5 >= entryCount) {
                break;
            }
            i6 = i5;
            i5 = i4;
            i4 = i2;
            if (i2 != 0) {
                i3 = 1;
            } else if (i3 == 0) {
                i3 = ((i - i5) / i2) + i4;
            } else {
                i3 = i4;
            }
            i4 = ((i3 - i4) * i2) + i5;
            iArr[0] = i3;
            iArr[1] = i4;
        }
        i5 = i4;
        i4 = i2;
        i2 = i3;
        i3 = 0;
        if (i2 != 0) {
            i3 = 1;
        } else if (i3 == 0) {
            i3 = i4;
        } else {
            i3 = ((i - i5) / i2) + i4;
        }
        i4 = ((i3 - i4) * i2) + i5;
        iArr[0] = i3;
        iArr[1] = i4;
    }

    private static int offsetOfChunk(Stco stco, int i) {
        if (i > stco.getEntryCount()) {
            return stco.getChunkOffset()[stco.getEntryCount() - 1];
        }
        if (stco.getEntryCount() > 0) {
            return stco.getChunkOffset()[i - 1];
        }
        return 8;
    }

    private static long offset64OfChunk(Co64 co64, int i) {
        if (i > co64.getEntryCount()) {
            return co64.getChunkOffset()[co64.getEntryCount() - 1];
        }
        if (co64.getEntryCount() > 0) {
            return co64.getChunkOffset()[i - 1];
        }
        return 8;
    }

    private static int offsetOfSampleInChunk(Stsz stsz, int i, int i2) {
        if (stsz.getSampleSize() != 0) {
            return (i - i2) * stsz.getSampleSize();
        }
        int i3 = 0;
        while (i2 < Math.min(i, stsz.getSampleCount())) {
            i3 += stsz.getEntrySize()[i2];
            i2++;
        }
        return i3;
    }

    private static int sampleOfTime(Stts stts, int i) {
        Object obj = null;
        int entryCount = stts.getEntryCount();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < entryCount) {
            i4 = stts.getSampleDelta()[i2];
            int i5 = stts.getSampleCount()[i2];
            int i6 = i5 * i4;
            if (i < i6) {
                obj = 1;
                break;
            }
            i -= i6;
            i2++;
            i3 = i5 + i3;
        }
        if (obj != null) {
            return i3 + (i / i4);
        }
        return i3;
    }

    private static IMpeg4Box seekTo(Parsable parsable, String str) {
        GhostBox ghostBox = new GhostBox();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        IMpeg4Box iMpeg4Box = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            Object obj = null;
            while (obj == null && parsable.available() > 0) {
                ghostBox.parse(parsable, null);
                if (nextToken.equalsIgnoreCase(ghostBox.getType())) {
                    obj = 1;
                    if (!stringTokenizer.hasMoreTokens()) {
                        iMpeg4Box = ghostBox;
                        break;
                    }
                } else {
                    parsable.skip(ghostBox.getSize() - 8);
                }
            }
        }
        return iMpeg4Box;
    }

    private static void parseChunks(Parsable parsable, Map<String, IMpeg4Box> map, Function1<HashSet<String>, Boolean> function1) {
        Box ghostBox = new GhostBox();
        HashSet hashSet = new HashSet(map.keySet());
        while (true) {
            if ((function1 == null || ((Boolean) function1.call(hashSet)).booleanValue()) && hashSet.size() != 0 && parsable.available() > 0) {
                ghostBox.parse(parsable, null);
                String type = ghostBox.getType();
                IMpeg4Box iMpeg4Box = (IMpeg4Box) map.get(type);
                if (iMpeg4Box == null) {
                    parsable.skip(ghostBox.getSize() - 8);
                } else {
                    iMpeg4Box.parse(parsable, ghostBox);
                    hashSet.remove(type);
                }
            }
        }
        if (function1 != null && ((Boolean) function1.call(hashSet)).booleanValue()) {
            throw new InvalidBoxException("invalid box: critical box not found!");
        }
    }

    private static boolean needMoreChunks(HashSet<String> hashSet) {
        if (hashSet.size() > 2) {
            return true;
        }
        if (hashSet.contains("stco") && hashSet.contains("co64")) {
            return true;
        }
        return false;
    }
}
