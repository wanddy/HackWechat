package com.tencent.mm.protocal.c;

import e.a.a.c.a;
import java.util.LinkedList;

public final class agj extends bcv {
    public int nfC;
    public String nhF;
    public int niD;
    public int niE;
    public LinkedList<bdo> nic = new LinkedList();
    public int wnP;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wIV != null) {
                aVar.fW(1, this.wIV.bke());
                this.wIV.a(aVar);
            }
            aVar.fU(2, this.nfC);
            aVar.fU(3, this.niD);
            aVar.fU(4, this.niE);
            if (this.nhF != null) {
                aVar.g(5, this.nhF);
            }
            aVar.fU(6, this.wnP);
            aVar.d(7, 8, this.nic);
            return 0;
        } else if (i == 1) {
            if (this.wIV != null) {
                r0 = e.a.a.a.fT(1, this.wIV.bke()) + 0;
            } else {
                r0 = 0;
            }
            r0 = ((r0 + e.a.a.a.fR(2, this.nfC)) + e.a.a.a.fR(3, this.niD)) + e.a.a.a.fR(4, this.niE);
            if (this.nhF != null) {
                r0 += e.a.a.b.b.a.h(5, this.nhF);
            }
            return (r0 + e.a.a.a.fR(6, this.wnP)) + e.a.a.a.c(7, 8, this.nic);
        } else if (i == 2) {
            r0 = (byte[]) objArr[0];
            this.nic.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(r0, unknownTagHandler);
            for (r0 = bcv.a(aVar2); r0 > 0; r0 = bcv.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            agj com_tencent_mm_protocal_c_agj = (agj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Jl;
            int size;
            com.tencent.mm.bq.a fdVar;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        fdVar = new fd();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agj.wIV = fdVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_agj.nfC = aVar3.Avy.ry();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_agj.niD = aVar3.Avy.ry();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_agj.niE = aVar3.Avy.ry();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_agj.nhF = aVar3.Avy.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_agj.wnP = aVar3.Avy.ry();
                    return 0;
                case 7:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        r0 = (byte[]) Jl.get(intValue);
                        fdVar = new bdo();
                        aVar4 = new e.a.a.a.a(r0, unknownTagHandler);
                        for (z = true; z; z = fdVar.a(aVar4, fdVar, bcv.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_agj.nic.add(fdVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
