package com.tencent.mm.protocal.c;

import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class pn extends bdf {
    public int kZx;
    public LinkedList<aqw> vGF = new LinkedList();
    public bdo vGG;
    public bdn vHb;
    public String vUU;
    public String vUV;
    public bdo vYu;
    public bdo vYw;
    public bdo vYx;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wJr == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.vYu == null) {
                throw new b("Not all required fields were included: Topic");
            } else if (this.vYw == null) {
                throw new b("Not all required fields were included: PYInitial");
            } else if (this.vYx == null) {
                throw new b("Not all required fields were included: QuanPin");
            } else if (this.vGG == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            } else if (this.vHb == null) {
                throw new b("Not all required fields were included: ImgBuf");
            } else {
                if (this.wJr != null) {
                    aVar.fW(1, this.wJr.bke());
                    this.wJr.a(aVar);
                }
                if (this.vYu != null) {
                    aVar.fW(2, this.vYu.bke());
                    this.vYu.a(aVar);
                }
                if (this.vYw != null) {
                    aVar.fW(3, this.vYw.bke());
                    this.vYw.a(aVar);
                }
                if (this.vYx != null) {
                    aVar.fW(4, this.vYx.bke());
                    this.vYx.a(aVar);
                }
                aVar.fU(5, this.kZx);
                aVar.d(6, 8, this.vGF);
                if (this.vGG != null) {
                    aVar.fW(7, this.vGG.bke());
                    this.vGG.a(aVar);
                }
                if (this.vHb != null) {
                    aVar.fW(8, this.vHb.bke());
                    this.vHb.a(aVar);
                }
                if (this.vUU != null) {
                    aVar.g(9, this.vUU);
                }
                if (this.vUV == null) {
                    return 0;
                }
                aVar.g(10, this.vUV);
                return 0;
            }
        } else if (i == 1) {
            if (this.wJr != null) {
                r0 = e.a.a.a.fT(1, this.wJr.bke()) + 0;
            } else {
                r0 = 0;
            }
            if (this.vYu != null) {
                r0 += e.a.a.a.fT(2, this.vYu.bke());
            }
            if (this.vYw != null) {
                r0 += e.a.a.a.fT(3, this.vYw.bke());
            }
            if (this.vYx != null) {
                r0 += e.a.a.a.fT(4, this.vYx.bke());
            }
            r0 = (r0 + e.a.a.a.fR(5, this.kZx)) + e.a.a.a.c(6, 8, this.vGF);
            if (this.vGG != null) {
                r0 += e.a.a.a.fT(7, this.vGG.bke());
            }
            if (this.vHb != null) {
                r0 += e.a.a.a.fT(8, this.vHb.bke());
            }
            if (this.vUU != null) {
                r0 += e.a.a.b.b.a.h(9, this.vUU);
            }
            if (this.vUV != null) {
                r0 += e.a.a.b.b.a.h(10, this.vUV);
            }
            return r0;
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.vGF.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(r0, unknownTagHandler);
            for (r0 = bdf.a(aVar2); r0 > 0; r0 = bdf.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.wJr == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.vYu == null) {
                throw new b("Not all required fields were included: Topic");
            } else if (this.vYw == null) {
                throw new b("Not all required fields were included: PYInitial");
            } else if (this.vYx == null) {
                throw new b("Not all required fields were included: QuanPin");
            } else if (this.vGG == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            } else if (this.vHb != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: ImgBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            pn pnVar = (pn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Jl;
            int size;
            com.tencent.mm.bq.a feVar;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new fe();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.wJr = feVar;
                    }
                    return 0;
                case 2:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new bdo();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vYu = feVar;
                    }
                    return 0;
                case 3:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new bdo();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vYw = feVar;
                    }
                    return 0;
                case 4:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new bdo();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vYx = feVar;
                    }
                    return 0;
                case 5:
                    pnVar.kZx = aVar3.Avy.ry();
                    return 0;
                case 6:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new aqw();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vGF.add(feVar);
                    }
                    return 0;
                case 7:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new bdo();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vGG = feVar;
                    }
                    return 0;
                case 8:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new bdn();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        pnVar.vHb = feVar;
                    }
                    return 0;
                case 9:
                    pnVar.vUU = aVar3.Avy.readString();
                    return 0;
                case 10:
                    pnVar.vUV = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
