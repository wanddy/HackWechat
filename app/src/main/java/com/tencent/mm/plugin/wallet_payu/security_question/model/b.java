package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.samsung.android.sdk.look.airbutton.SlookAirButtonFrequentContactAdapter;
import com.tencent.mm.wallet_core.e.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a {
    public String fzP;
    public String id;
    public boolean mfl;
    public String ocF;
    public String tdG;

    public b(String str, String str2, String str3) {
        this.id = str2;
        this.ocF = str3;
        this.fzP = str;
        Map hashMap = new HashMap();
        hashMap.put(SlookAirButtonFrequentContactAdapter.ID, str2);
        hashMap.put("answer", str3);
        hashMap.put("payu_reference", str);
        D(hashMap);
    }

    public final int bKL() {
        return 18;
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        this.mfl = jSONObject.optBoolean("verified");
        this.tdG = jSONObject.optString("payu_reference");
    }
}
