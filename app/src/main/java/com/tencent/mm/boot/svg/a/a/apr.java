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

public final class apr extends c {
    private final int height = 45;
    private final int width = 33;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 33;
            case 1:
                return 45;
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
                Paint a = c.a(i3, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 0.785714f, 0.0f, 1.0f, 1.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 0.053569f, 0.0f, 1.0f, 0.421829f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                Path j = c.j(looper);
                j.moveTo(8.589289f, 33.00416f);
                j.cubicTo(8.589289f, 32.768894f, 8.780011f, 32.57817f, 9.015279f, 32.57817f);
                j.lineTo(21.159014f, 32.57817f);
                j.cubicTo(21.394281f, 32.57817f, 21.585003f, 32.768894f, 21.585003f, 33.00416f);
                j.lineTo(21.585003f, 34.509323f);
                j.cubicTo(21.585003f, 34.74459f, 21.394281f, 34.935314f, 21.159014f, 34.935314f);
                j.lineTo(9.015279f, 34.935314f);
                j.cubicTo(8.780011f, 34.935314f, 8.589289f, 34.74459f, 8.589289f, 34.509323f);
                j.lineTo(8.589289f, 33.00416f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                a2.setColor(-7829368);
                a2.setStrokeWidth(2.357143f);
                a2.setStrokeCap(Cap.ROUND);
                j = c.j(looper);
                j.moveTo(22.859083f, 30.466698f);
                j.cubicTo(25.697063f, 28.206388f, 27.516407f, 24.719078f, 27.516407f, 20.806364f);
                j.cubicTo(27.516407f, 13.992444f, 21.998783f, 8.468672f, 15.192449f, 8.468672f);
                j.cubicTo(8.386114f, 8.468672f, 2.8684905f, 13.992444f, 2.8684905f, 20.806364f);
                j.cubicTo(2.8684905f, 24.744936f, 4.7119603f, 28.252464f, 7.582215f, 30.511353f);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                j = c.j(looper);
                j.moveTo(11.901223f, 38.671078f);
                j.cubicTo(12.822826f, 38.835445f, 13.754634f, 38.918335f, 14.693224f, 38.918335f);
                j.cubicTo(15.647946f, 38.918335f, 16.595642f, 38.832573f, 17.53271f, 38.662533f);
                j.cubicTo(17.970507f, 38.58309f, 18.281555f, 37.99753f, 18.227455f, 37.354652f);
                j.cubicTo(18.173357f, 36.71177f, 17.774595f, 36.25501f, 17.3368f, 36.33445f);
                j.cubicTo(16.46469f, 36.492702f, 15.582418f, 36.572544f, 14.693224f, 36.572544f);
                j.cubicTo(13.819049f, 36.572544f, 12.95156f, 36.495377f, 12.093828f, 36.3424f);
                j.cubicTo(11.65592f, 36.264297f, 11.257809f, 36.722275f, 11.204622f, 37.365322f);
                j.cubicTo(11.151436f, 38.00837f, 11.463314f, 38.592976f, 11.901223f, 38.671078f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                a3.setColor(-7829368);
                a3.setStrokeWidth(2.357143f);
                a3.setStrokeCap(Cap.ROUND);
                a3.setStrokeJoin(Join.MITER);
                Path j2 = c.j(looper);
                j2.moveTo(8.922117f, 18.676264f);
                j2.lineTo(12.898021f, 23.514427f);
                j2.lineTo(16.873924f, 18.674042f);
                j2.lineTo(20.849829f, 23.525074f);
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                canvas.drawPath(j2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                j = c.j(looper);
                j.moveTo(14.303575f, 1.9358877f);
                j.lineTo(14.303575f, 3.5349169f);
                j.cubicTo(14.303575f, 4.185824f, 14.831239f, 4.7134886f, 15.482145f, 4.7134886f);
                j.cubicTo(16.133053f, 4.7134886f, 16.660717f, 4.185824f, 16.660717f, 3.5349169f);
                j.lineTo(16.660717f, 1.9358877f);
                j.cubicTo(16.660717f, 1.2849807f, 16.133053f, 0.7573163f, 15.482145f, 0.7573163f);
                j.cubicTo(14.831239f, 0.7573163f, 14.303575f, 1.2849807f, 14.303575f, 1.9358877f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                j = c.j(looper);
                j.moveTo(29.17959f, 7.334117f);
                j.lineTo(27.93691f, 8.340419f);
                j.cubicTo(27.43106f, 8.750048f, 27.35306f, 9.49219f, 27.762688f, 9.99804f);
                j.cubicTo(28.172318f, 10.503889f, 28.91446f, 10.581892f, 29.42031f, 10.172263f);
                j.lineTo(30.662989f, 9.165961f);
                j.cubicTo(31.168839f, 8.756332f, 31.246841f, 8.01419f, 30.837212f, 7.50834f);
                j.cubicTo(30.427582f, 7.00249f, 29.68544f, 6.924488f, 29.17959f, 7.334117f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-7829368);
                j = c.j(looper);
                j.moveTo(0.43691143f, 9.165961f);
                j.lineTo(1.6795906f, 10.172263f);
                j.cubicTo(2.1854403f, 10.581892f, 2.9275825f, 10.503889f, 3.3372116f, 9.99804f);
                j.cubicTo(3.7468407f, 9.49219f, 3.6688383f, 8.750048f, 3.1629887f, 8.340419f);
                j.lineTo(1.9203095f, 7.334117f);
                j.cubicTo(1.4144597f, 6.924488f, 0.6723175f, 7.00249f, 0.26268846f, 7.50834f);
                j.cubicTo(-0.14694062f, 8.01419f, -0.06893833f, 8.756332f, 0.43691143f, 9.165961f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}