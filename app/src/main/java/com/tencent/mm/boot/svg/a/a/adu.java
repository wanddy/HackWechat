package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.JsApiSetClipboardData;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class adu extends c {
    private final int height = JsApiSetClipboardData.CTRL_INDEX;
    private final int width = JsApiSetClipboardData.CTRL_INDEX;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return JsApiSetClipboardData.CTRL_INDEX;
            case 1:
                return JsApiSetClipboardData.CTRL_INDEX;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix f = c.f(looper);
                float[] e = c.e(looper);
                Paint i2 = c.i(looper);
                i2.setFlags(385);
                i2.setStyle(Style.FILL);
                Paint i3 = c.i(looper);
                i3.setFlags(385);
                i3.setStyle(Style.STROKE);
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                Paint a = c.a(i2, looper);
                a.setColor(-8617594);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 51.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(84.0f, 42.34183f);
                j.lineTo(84.0f, 6.0f);
                j.lineTo(6.0f, 6.0f);
                j.lineTo(6.0f, 40.335194f);
                j.lineTo(29.0f, 18.0f);
                j.lineTo(60.023453f, 46.799316f);
                j.lineTo(56.0f, 38.0f);
                j.lineTo(68.1287f, 27.99035f);
                j.lineTo(84.0f, 42.34183f);
                j.close();
                j.moveTo(2.994461f, 0.0f);
                j.cubicTo(1.3406659f, 0.0f, 0.0f, 1.3482827f, 0.0f, 3.007385f);
                j.lineTo(0.0f, 62.992615f);
                j.cubicTo(0.0f, 64.65355f, 1.3420956f, 66.0f, 2.994461f, 66.0f);
                j.lineTo(87.00554f, 66.0f);
                j.cubicTo(88.65933f, 66.0f, 90.0f, 64.65172f, 90.0f, 62.992615f);
                j.lineTo(90.0f, 3.007385f);
                j.cubicTo(90.0f, 1.3464521f, 88.657906f, 0.0f, 87.00554f, 0.0f);
                j.lineTo(2.994461f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
