package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import e.a.a.b;

public final class bxz extends a {
    public int ktN;
    public String vZU;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.vZU == null) {
                throw new b("Not all required fields were included: MD5");
            }
            aVar.fU(1, this.ktN);
            if (this.vZU != null) {
                aVar.g(2, this.vZU);
            }
            return 0;
        } else if (i == 1) {
            r0 = e.a.a.a.fR(1, this.ktN) + 0;
            if (this.vZU != null) {
                return r0 + e.a.a.b.b.a.h(2, this.vZU);
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.vZU != null) {
                return 0;
            }
            throw new b("Not all required fields were included: MD5");
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bxz com_tencent_mm_protocal_c_bxz = (bxz) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_bxz.ktN = aVar3.Avy.ry();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bxz.vZU = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
