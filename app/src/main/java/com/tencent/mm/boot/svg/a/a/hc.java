package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class hc extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                a.setColor(-8617851);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 8.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(53.00009f, 8.0f);
                j.lineTo(45.00009f, 0.0f);
                j.lineTo(20.00009f, 0.0f);
                j.lineTo(12.000091f, 8.0f);
                j.lineTo(9.0277776E-5f, 8.0f);
                j.lineTo(9.0277776E-5f, 16.0f);
                j.lineTo(65.00009f, 16.0f);
                j.lineTo(65.00009f, 8.0f);
                j.lineTo(53.00009f, 8.0f);
                j.close();
                j.moveTo(12.000091f, 67.0f);
                j.lineTo(20.00009f, 67.0f);
                j.lineTo(20.00009f, 31.0f);
                j.lineTo(12.000091f, 31.0f);
                j.lineTo(12.000091f, 67.0f);
                j.close();
                j.moveTo(28.00009f, 67.0f);
                j.lineTo(36.00009f, 67.0f);
                j.lineTo(36.00009f, 31.0f);
                j.lineTo(28.00009f, 31.0f);
                j.lineTo(28.00009f, 67.0f);
                j.close();
                j.moveTo(45.00009f, 67.0f);
                j.lineTo(53.00009f, 67.0f);
                j.lineTo(53.00009f, 31.0f);
                j.lineTo(45.00009f, 31.0f);
                j.lineTo(45.00009f, 67.0f);
                j.close();
                j.moveTo(4.00009f, 68.0f);
                j.cubicTo(4.00009f, 74.53162f, 9.468924f, 80.0f, 16.00009f, 80.0f);
                j.lineTo(49.00009f, 80.0f);
                j.cubicTo(55.531708f, 80.0f, 61.00009f, 74.53162f, 61.00009f, 68.0f);
                j.lineTo(61.00009f, 23.0f);
                j.lineTo(4.00009f, 23.0f);
                j.lineTo(4.00009f, 68.0f);
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