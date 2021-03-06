package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.x;

public class PictureView extends ImageView {
    private boolean DEBUG = false;
    private i hau = null;
    private boolean hav = false;
    private Runnable haw = new 1(this);

    static /* synthetic */ void a(PictureView pictureView) {
        aQ(pictureView.hau);
        pictureView.hau = null;
        super.setImageDrawable(null);
    }

    public PictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private static String aP(Object obj) {
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof a) {
            return obj + " hashcode " + obj.hashCode() + " " + ((a) obj).EH() + " " + ((a) obj).EH().hashCode();
        }
        return String.valueOf(obj);
    }

    public void setImageDrawable(Drawable drawable) {
        removeCallbacks(this.haw);
        if (drawable != null && !drawable.equals(this.hau)) {
            if (this.DEBUG) {
                x.i("MicroMsg.PictureView", "setImageDrawable " + hashCode() + " old: " + aP(this.hau) + " new:" + aP(drawable) + " " + bh.cgy().toString());
            }
            aQ(this.hau);
            if (drawable instanceof i) {
                this.hau = (i) drawable;
            } else {
                this.hau = null;
            }
            if (drawable != null && (drawable instanceof i)) {
                ((i) drawable).Ey();
            }
            super.setImageDrawable(drawable);
        }
    }

    private static void aQ(Object obj) {
        if (obj != null && (obj instanceof i)) {
            ((i) obj).Ez();
        }
    }

    private void EI() {
        removeCallbacks(this.haw);
        if (this.DEBUG) {
            x.i("MicroMsg.PictureView", "onAttach" + hashCode() + " " + bh.cgy().toString());
        }
        if (!this.hav) {
            this.hav = true;
        }
    }

    private void onDetach() {
        if (this.DEBUG) {
            x.i("MicroMsg.PictureView", "onDetach " + hashCode() + " " + bh.cgy().toString());
        }
        if (this.hav) {
            this.hav = false;
            removeCallbacks(this.haw);
            postDelayed(this.haw, 500);
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        EI();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDetach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        onDetach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        EI();
    }
}
