package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.account.DisasterUI;
import com.tencent.wcdb.database.SQLiteDatabase;

class MobileLoginOrForceReg$12 extends c<iy> {
    final /* synthetic */ MobileLoginOrForceReg xUx;

    MobileLoginOrForceReg$12(MobileLoginOrForceReg mobileLoginOrForceReg) {
        this.xUx = mobileLoginOrForceReg;
        this.xen = iy.class.getName().hashCode();
    }

    public final /* synthetic */ boolean a(b bVar) {
        iy iyVar = (iy) bVar;
        if (iyVar == null || iyVar.fzB == null) {
            return false;
        }
        x.i("MicorMsg.MobileLoginOrForceReg", "summerdiz loginDisasterListener callback content[%s], url[%s]", new Object[]{iyVar.fzB.content, iyVar.fzB.url});
        Intent intent = new Intent();
        intent.putExtra("key_disaster_content", iyVar.fzB.content);
        intent.putExtra("key_disaster_url", iyVar.fzB.url);
        intent.setClass(ac.getContext(), DisasterUI.class).addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        ac.getContext().startActivity(intent);
        return true;
    }
}