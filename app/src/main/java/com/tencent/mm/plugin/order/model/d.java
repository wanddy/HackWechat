package com.tencent.mm.plugin.order.model;

import com.tencent.mm.bq.a;

public final class d extends a {
    public int month;
    public String pbc;
    public int year;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.fU(1, this.year);
            aVar.fU(2, this.month);
            if (this.pbc != null) {
                aVar.g(3, this.pbc);
            }
            return 0;
        } else if (i == 1) {
            r0 = (e.a.a.a.fR(1, this.year) + 0) + e.a.a.a.fR(2, this.month);
            if (this.pbc != null) {
                return r0 + e.a.a.b.b.a.h(3, this.pbc);
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
            d dVar = (d) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dVar.year = aVar3.Avy.ry();
                    return 0;
                case 2:
                    dVar.month = aVar3.Avy.ry();
                    return 0;
                case 3:
                    dVar.pbc = aVar3.Avy.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
