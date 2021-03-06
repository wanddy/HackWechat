package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.os.Bundle;
import com.tencent.mm.ae.k;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.model.c;
import com.tencent.mm.plugin.wallet_payu.bind.model.d;
import com.tencent.mm.ui.base.a;

@a(3)
public class WalletPayUBankcardManageUI extends WalletBankcardManageUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    protected final void jA(boolean z) {
        if (z) {
            b(new com.tencent.mm.plugin.wallet_core.c.b.a(), false);
        } else {
            r(new com.tencent.mm.plugin.wallet_core.c.b.a());
        }
    }

    protected final void bJH() {
        com.tencent.mm.wallet_core.a.a(this, c.class, null);
    }

    public final boolean d(int i, int i2, String str, k kVar) {
        if (!(kVar instanceof com.tencent.mm.plugin.wallet_core.c.b.a)) {
            return false;
        }
        bJI();
        return true;
    }

    protected final com.tencent.mm.plugin.wallet.bind.ui.a bJG() {
        return new a(this, this.sCs);
    }

    protected final void c(Bankcard bankcard) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_bankcard", bankcard);
        com.tencent.mm.wallet_core.a.a(this, d.class, bundle);
    }
}
