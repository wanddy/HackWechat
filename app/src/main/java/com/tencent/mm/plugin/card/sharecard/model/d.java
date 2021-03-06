package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ae.b;
import com.tencent.mm.ae.b.a;
import com.tencent.mm.ae.e;
import com.tencent.mm.ae.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afv;
import com.tencent.mm.protocal.c.afw;
import com.tencent.mm.sdk.platformtools.x;

public final class d extends k implements com.tencent.mm.network.k {
    private final b gJQ;
    private e gJT;
    public String kLN;
    public int kLO;
    public String kLP;

    public d(String str, String str2, String str3) {
        a aVar = new a();
        aVar.hmj = new afv();
        aVar.hmk = new afw();
        aVar.uri = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
        aVar.hmi = 910;
        aVar.hml = 0;
        aVar.hmm = 0;
        this.gJQ = aVar.JZ();
        afv com_tencent_mm_protocal_c_afv = (afv) this.gJQ.hmg.hmo;
        com_tencent_mm_protocal_c_afv.fGU = str;
        com_tencent_mm_protocal_c_afv.scene = 20;
        com_tencent_mm_protocal_c_afv.kJN = str2;
        com_tencent_mm_protocal_c_afv.code = str3;
    }

    public final void a(int i, int i2, int i3, String str, q qVar, byte[] bArr) {
        x.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[]{Integer.valueOf(910), Integer.valueOf(i2), Integer.valueOf(i3)});
        if (i2 == 0 && i3 == 0) {
            afw com_tencent_mm_protocal_c_afw = (afw) this.gJQ.hmh.hmo;
            x.v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + com_tencent_mm_protocal_c_afw.kLN);
            this.kLN = com_tencent_mm_protocal_c_afw.kLN;
            this.kLP = com_tencent_mm_protocal_c_afw.kLP;
        }
        this.gJT.a(i2, i3, str, this);
    }

    public final int getType() {
        return 910;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.gJT = eVar2;
        return a(eVar, this.gJQ, this);
    }
}
