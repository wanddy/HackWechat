package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.webkit.ValueCallback;
import com.tencent.mm.sdk.platformtools.x;

class d$55 implements ValueCallback<String> {
    final /* synthetic */ d tHd;

    d$55(d dVar) {
        this.tHd = dVar;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        x.i("MicroMsg.JsApiHandler", "sys:attach_runOn3rd_apis back %s\t", new Object[]{(String) obj});
    }
}
