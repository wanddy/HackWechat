package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.mm.aq.a.c.g;
import com.tencent.mm.aq.a.d.b;
import com.tencent.mm.ui.chatting.ChattingUI.a;
import com.tencent.mm.ui.chatting.viewitems.c.d;

class c$d$3 implements g {
    final /* synthetic */ a yII;
    final /* synthetic */ c$c yJE;
    final /* synthetic */ d yJF;

    c$d$3(d dVar, c$c com_tencent_mm_ui_chatting_viewitems_c_c, a aVar) {
        this.yJF = dVar;
        this.yJE = com_tencent_mm_ui_chatting_viewitems_c_c;
        this.yII = aVar;
    }

    public final void lC(String str) {
    }

    public final Bitmap a(String str, b bVar) {
        return null;
    }

    public final void a(String str, View view, b bVar) {
        if (bVar.bitmap != null) {
            this.yJE.yJf.getViewTreeObserver().addOnPreDrawListener(new 1(this, bVar.bitmap));
        }
    }
}
