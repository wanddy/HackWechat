package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public final class a extends b {
    private final Bitmap bitmap;
    private final float oeM;
    private final float oeN;

    public a(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.oeM = ((float) bitmap.getWidth()) / 2.0f;
        this.oeN = ((float) bitmap.getHeight()) / 2.0f;
    }

    public final int getWidth() {
        return this.bitmap.getWidth();
    }

    public final int getHeight() {
        return this.bitmap.getHeight();
    }

    protected final void a(Canvas canvas, Matrix matrix, Paint paint, float f, float f2, float f3) {
        matrix.preTranslate(f, f2);
        matrix.preRotate(f3, this.oeM, this.oeN);
        canvas.drawBitmap(this.bitmap, matrix, paint);
    }
}
