package com.tencent.mm.z;

import android.database.Cursor;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.as;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bk {
    private e gJP;
    private as hhz;

    public bk(e eVar, as asVar) {
        this.gJP = eVar;
        this.hhz = asVar;
    }

    public final Cursor a(String str, List<String> list, String str2) {
        String str3 = " ";
        String str4 = " ";
        if (str2 != null && str2.length() > 0) {
            str4 = " and rconversation." + "username = rcontact." + "username ";
        }
        String str5 = "select 1," + "unReadCount, status, " + "isSend, conversationTime, " + "rconversation.username, " + "content, rconversation." + "msgType, rconversation." + "flag, rcontact." + "nickname from rconversation," + "rcontact" + str3 + " where rconversation.username" + " = rcontact.username" + str4 + bh.ou(str);
        str4 = "";
        if (list != null && list.size() > 0) {
            str3 = str4;
            for (String str42 : list) {
                str3 = str3 + " and rconversation.username" + " != '" + str42 + "'";
            }
            str42 = str3;
        }
        str42 = str5 + str42;
        if (str2 != null && str2.length() > 0) {
            str42 = str42 + hX(str2);
        }
        x.v("Micro.SimpleSearchConversationModel", "convsql %s", new Object[]{((str42 + " order by ") + "rconversation.username like '%" + "@chatroom' asc, ") + "flag desc, conversationTime desc"});
        return this.gJP.rawQuery(((str42 + " order by ") + "rconversation.username like '%" + "@chatroom' asc, ") + "flag desc, conversationTime desc", null);
    }

    private String hX(String str) {
        String string;
        String str2;
        String str3 = "";
        ArrayList arrayList = new ArrayList();
        Cursor a = this.gJP.a("select username from rcontact where (username like '%" + str + "%' or nickname like '%" + str + "%' or alias like '%" + str + "%' or pyInitial like '%" + str + "%' or quanPin like '%" + str + "%' or conRemark like '%" + str + "%' )and username not like '%@%' and type" + " & " + a.AB() + "=0 ", null, 2);
        x.v("Micro.SimpleSearchConversationModel", "contactsql %s", new Object[]{string});
        while (a.moveToNext()) {
            string = a.getString(a.getColumnIndex("username"));
            if (!string.endsWith("@chatroom")) {
                arrayList.add(string);
            }
        }
        a.close();
        if (arrayList.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ( rconversation." + "username in ( select chatroomname from " + "chatroom where ");
            stringBuffer.append("memberlist like '%" + str + "%'");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(" or memberlist like '%" + ((String) it.next()) + "%'");
            }
            stringBuffer.append("))");
            str2 = str3 + stringBuffer.toString() + " or ";
        } else {
            str2 = str3;
        }
        return " and ( rconversation." + "username like '%" + str + "%' or " + str2 + "rconversation.content like '%" + str + "%' or rcontact.nickname" + " like '%" + str + "%' or rcontact.alias" + " like '%" + str + "%' or rcontact.pyInitial" + " like '%" + str + "%' or rcontact.quanPin" + " like '%" + str + "%' or rcontact.conRemark" + " like '%" + str + "%'  ) ";
    }
}
