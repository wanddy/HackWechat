package com.tencent.mm.protocal.c;

import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class abt extends bdf {
    public int ksO;
    public LinkedList<si> ksP = new LinkedList();
    public int wkA;
    public String wkB;
    public int wkC;

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
            aVar.fU(2, this.ksO);
            aVar.d(3, 8, this.ksP);
            aVar.fU(4, this.wkA);
            if (this.wkB != null) {
                aVar.g(5, this.wkB);
            }
            aVar.fU(6, this.wkC);
            return 0;
        } else if (i == 1) {
            if (this.wJr != null) {
                r0 = e.a.a.a.fT(1, this.wJr.bke()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((r0 + e.a.a.a.fR(2, this.ksO)) + e.a.a.a.c(3, 8, this.ksP)) + e.a.a.a.fR(4, this.wkA);
            if (this.wkB != null) {
                r0 += e.a.a.b.b.a.h(5, this.wkB);
            }
            return r0 + e.a.a.a.fR(6, this.wkC);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.ksP.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(r0, unknownTagHandler);
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
            abt com_tencent_mm_protocal_c_abt = (abt) objArr[1];
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
                        com_tencent_mm_protocal_c_abt.wJr = feVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_abt.ksO = aVar3.Avy.ry();
                    return 0;
                case 3:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        feVar = new si();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_abt.ksP.add(feVar);
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_abt.wkA = aVar3.Avy.ry();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_abt.wkB = aVar3.Avy.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_abt.wkC = aVar3.Avy.ry();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
