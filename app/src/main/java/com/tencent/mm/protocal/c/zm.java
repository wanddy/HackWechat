package com.tencent.mm.protocal.c;

import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class zm extends bdf {
    public bah vNw;
    public hr wjh;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.wJr == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.vNw == null) {
                throw new b("Not all required fields were included: qy_base_resp");
            } else if (this.wjh == null) {
                throw new b("Not all required fields were included: attr");
            } else {
                if (this.wJr != null) {
                    aVar.fW(1, this.wJr.bke());
                    this.wJr.a(aVar);
                }
                if (this.vNw != null) {
                    aVar.fW(2, this.vNw.bke());
                    this.vNw.a(aVar);
                }
                if (this.wjh == null) {
                    return 0;
                }
                aVar.fW(3, this.wjh.bke());
                this.wjh.a(aVar);
                return 0;
            }
        } else if (i == 1) {
            if (this.wJr != null) {
                r0 = e.a.a.a.fT(1, this.wJr.bke()) + 0;
            } else {
                r0 = 0;
            }
            if (this.vNw != null) {
                r0 += e.a.a.a.fT(2, this.vNw.bke());
            }
            if (this.wjh != null) {
                r0 += e.a.a.a.fT(3, this.wjh.bke());
            }
            return r0;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = bdf.a(aVar2); r0 > 0; r0 = bdf.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.cJE();
                }
            }
            if (this.wJr == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.vNw == null) {
                throw new b("Not all required fields were included: qy_base_resp");
            } else if (this.wjh != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: attr");
            }
        } else if (i != 3) {
            return -1;
        } else {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            zm zmVar = (zm) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Jl;
            int size;
            byte[] bArr;
            com.tencent.mm.bq.a feVar;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new fe();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        zmVar.wJr = feVar;
                    }
                    return 0;
                case 2:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new bah();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        zmVar.vNw = feVar;
                    }
                    return 0;
                case 3:
                    Jl = aVar3.Jl(intValue);
                    size = Jl.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Jl.get(intValue);
                        feVar = new hr();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = feVar.a(aVar4, feVar, bdf.a(aVar4))) {
                        }
                        zmVar.wjh = feVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
