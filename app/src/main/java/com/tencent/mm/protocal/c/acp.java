package com.tencent.mm.protocal.c;

import e.a.a.c.a;
import java.util.LinkedList;

public final class acp extends bcv {
    public String ksU;
    public int vIB;
    public int vIC;
    public int wlk;
    public int wll;
    public String wlm;
    public int wln;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wIV != null) {
                aVar.fW(1, this.wIV.bke());
                this.wIV.a(aVar);
            }
            if (this.ksU != null) {
                aVar.g(2, this.ksU);
            }
            aVar.fU(3, this.wlk);
            aVar.fU(4, this.wll);
            if (this.wlm != null) {
                aVar.g(5, this.wlm);
            }
            aVar.fU(6, this.vIB);
            aVar.fU(7, this.vIC);
            aVar.fU(8, this.wln);
            return 0;
        } else if (i == 1) {
            if (this.wIV != null) {
                r0 = e.a.a.a.fT(1, this.wIV.bke()) + 0;
            } else {
                r0 = 0;
            }
            if (this.ksU != null) {
                r0 += e.a.a.b.b.a.h(2, this.ksU);
            }
            r0 = (r0 + e.a.a.a.fR(3, this.wlk)) + e.a.a.a.fR(4, this.wll);
            if (this.wlm != null) {
                r0 += e.a.a.b.b.a.h(5, this.wlm);
            }
            return ((r0 + e.a.a.a.fR(6, this.vIB)) + e.a.a.a.fR(7, this.vIC)) + e.a.a.a.fR(8, this.wln);
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.bq.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.bq.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            acp com_tencent_mm_protocal_c_acp = (acp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Jl.get(intValue);
                        com.tencent.mm.bq.a fdVar = new fd();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fdVar.a(aVar4, fdVar, com.tencent.mm.bq.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_acp.wIV = fdVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_acp.ksU = aVar3.Avy.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_acp.wlk = aVar3.Avy.ry();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_acp.wll = aVar3.Avy.ry();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_acp.wlm = aVar3.Avy.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_acp.vIB = aVar3.Avy.ry();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_acp.vIC = aVar3.Avy.ry();
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_acp.wln = aVar3.Avy.ry();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}