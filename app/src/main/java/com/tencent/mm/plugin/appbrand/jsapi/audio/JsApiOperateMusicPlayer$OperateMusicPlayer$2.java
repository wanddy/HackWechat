package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer.OperateMusicPlayer;
import com.tencent.mm.sdk.platformtools.x;

class JsApiOperateMusicPlayer$OperateMusicPlayer$2 implements Runnable {
    final /* synthetic */ OperateMusicPlayer jfe;

    JsApiOperateMusicPlayer$OperateMusicPlayer$2(OperateMusicPlayer operateMusicPlayer) {
        this.jfe = operateMusicPlayer;
    }

    public final void run() {
        x.i("MicroMsg.JsApiOperateMusicPlayer", "resume ok");
        this.jfe.action = -1;
        this.jfe.errorMsg = "";
        this.jfe.jeA = false;
        OperateMusicPlayer.d(this.jfe);
    }
}
