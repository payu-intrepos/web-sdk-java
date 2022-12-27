package com.payu;

import okhttp3.*;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Payment {



    public static String comp(String str1,String val1) {
        return "<input hidden type='text' name='" + str1 + "' value='" + val1 + "'/>";
    }


    public static String form(HashMap map){
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        System.out.println("<form name=\"payment_post\" id=\"payment_post\" action=\"https://test.payu.in/_payment\" method=\"post\">");
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(comp(entry.getKey().toString(),entry.getValue().toString()));
        }
        System.out.println("</form><script type='text/javascript'>\n" +
            "                            window.onload=function(){\n" +
            "                                document.forms['payment_post'].submit();\n" +
            "                            }\n" +
            "                        </script>");
        return "sdfs";
    }

}
