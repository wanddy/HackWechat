package com.tencent.mm.protocal.c;

import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aet extends bdf {
    public int vQP;
    public String vQQ;
    public String wmJ;
    public String wmK;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wJr == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.wJr != null) {
                aVar.fW(1, this.wJr.bke());
                this.wJr.a(aVar);
            }
            if (this.wmJ != null) {
                aVar.g(2, this.wmJ);
            }
            aVar.fU(3, this.vQP);
            if (this.vQQ != null) {
                aVar.g(4, this.vQQ);
            }
            if (this.wmK == null) {
                return 0;
            }
            aVar.g(5, this.wmK);
            return 0;
        } else if (i == 1) {
            if (this.wJr != null) {
                r0 = e.a.a.a.fT(1, this.wJr.bke()) + 0;
            } else {
                r0 = 0;
            }
            if (this.wmJ != null) {
                r0 += e.a.a.b.b.a.h(2, this.wmJ);
            }
            r0 += e.a.a.a.fR(3, this.vQP);
            if (this.vQQ != null) {
                r0 += e.a.a.b.b.a.h(4, this.vQQ);
            }
            if (this.wmK != null) {
                r0 += e.a.a.b.b.a.h(5, this.wmK);
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = bdf.a(aVar2); r0 > 0; r0 = bdf.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.wJr != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aet com_tencent_mm_protocal_c_aet = (aet) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Jl = aVar3.Jl(intValue);
                    int size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Jl.get(intValue);
                        com.tencent.mm.bq.a feVar = new fe();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aet.wJr = feVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_aet.wmJ = aVar3.Avy.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_aet.vQP = aVar3.Avy.ry();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_aet.vQQ = aVar3.Avy.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_aet.wmK = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
