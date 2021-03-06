package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class m {
    private static final Object aOw = new Object();
    private static m aOx;

    public static m H(Context context) {
        synchronized (aOw) {
            if (aOx == null) {
                aOx = new n(context.getApplicationContext());
            }
        }
        return aOx;
    }

    public abstract boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract boolean a(String str, String str2, ServiceConnection serviceConnection, String str3);

    public abstract void b(ComponentName componentName, ServiceConnection serviceConnection, String str);

    public abstract void b(String str, String str2, ServiceConnection serviceConnection, String str3);
}
