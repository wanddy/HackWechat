package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;

public final class apy extends a {
    public int rYW;
    public String vOe;
    public long wwF;
    public long wwG;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.fU(1, this.rYW);
            if (this.vOe != null) {
                aVar.g(2, this.vOe);
            }
            aVar.S(3, this.wwG);
            aVar.S(4, this.wwF);
            return 0;
        } else if (i == 1) {
            r0 = e.a.a.a.fR(1, this.rYW) + 0;
            if (this.vOe != null) {
                r0 += e.a.a.b.b.a.h(2, this.vOe);
            }
            return (r0 + e.a.a.a.R(3, this.wwG)) + e.a.a.a.R(4, this.wwF);
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            apy com_tencent_mm_protocal_c_apy = (apy) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_apy.rYW = aVar3.Avy.ry();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_apy.vOe = aVar3.Avy.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_apy.wwG = aVar3.Avy.rz();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_apy.wwF = aVar3.Avy.rz();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
