package com.tencent.mm.protocal.c;

import com.tencent.mm.bq.a;
import com.tencent.mm.bq.b;

public final class bwy extends a {
    public b wXL;
    public b wXM;
    public b wXN;
    public b wXO;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wXL != null) {
                aVar.b(1, this.wXL);
            }
            if (this.wXM != null) {
                aVar.b(2, this.wXM);
            }
            if (this.wXN != null) {
                aVar.b(3, this.wXN);
            }
            if (this.wXO == null) {
                return 0;
            }
            aVar.b(4, this.wXO);
            return 0;
        } else if (i == 1) {
            if (this.wXL != null) {
                r0 = e.a.a.a.a(1, this.wXL) + 0;
            } else {
                r0 = 0;
            }
            if (this.wXM != null) {
                r0 += e.a.a.a.a(2, this.wXM);
            }
            if (this.wXN != null) {
                r0 += e.a.a.a.a(3, this.wXN);
            }
            if (this.wXO != null) {
                r0 += e.a.a.a.a(4, this.wXO);
            }
            return r0;
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
            bwy com_tencent_mm_protocal_c_bwy = (bwy) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_bwy.wXL = aVar3.cJD();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bwy.wXM = aVar3.cJD();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bwy.wXN = aVar3.cJD();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bwy.wXO = aVar3.cJD();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
