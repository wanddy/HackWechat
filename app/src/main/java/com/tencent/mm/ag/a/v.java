package com.tencent.mm.ag.a;

import com.tencent.mm.ae.b;
import com.tencent.mm.ae.b.a;
import com.tencent.mm.ae.e;
import com.tencent.mm.ae.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bai;
import com.tencent.mm.protocal.c.baj;
import com.tencent.mm.sdk.platformtools.x;

public final class v extends k implements com.tencent.mm.network.k {
    public b gJQ;
    private e gJT;

    public v(String str, String str2, int i) {
        a aVar = new a();
        aVar.hmj = new bai();
        aVar.hmk = new baj();
        aVar.uri = "/cgi-bin/mmocbiz-bin/qymsgstatenotify";
        aVar.hmi = 1361;
        aVar.hml = 0;
        aVar.hmm = 0;
        this.gJQ = aVar.JZ();
        bai com_tencent_mm_protocal_c_bai = (bai) this.gJQ.hmg.hmo;
        com_tencent_mm_protocal_c_bai.vNq = str;
        com_tencent_mm_protocal_c_bai.vNk = str2;
        com_tencent_mm_protocal_c_bai.time_stamp = i;
    }

    public final void a(int i, int i2, int i3, String str, q qVar, byte[] bArr) {
        x.d("MicroMsg.NetSceneQyMsgStateNotify", "onGYNetEnd code(%d, %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        if (this.gJT != null) {
            this.gJT.a(i2, i3, str, this);
        }
    }

    public final int getType() {
        return 1361;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.gJT = eVar2;
        x.i("MicroMsg.NetSceneQyMsgStateNotify", "do scene");
        return a(eVar, this.gJQ, this);
    }
}
