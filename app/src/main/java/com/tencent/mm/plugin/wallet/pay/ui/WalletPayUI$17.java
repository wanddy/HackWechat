package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class WalletPayUI$17 implements OnClickListener {
    final /* synthetic */ WalletPayUI sGh;

    WalletPayUI$17(WalletPayUI walletPayUI) {
        this.sGh = walletPayUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.sGh.finish();
    }
}
