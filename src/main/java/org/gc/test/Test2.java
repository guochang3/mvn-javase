package org.gc.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: guochang3
 * @DateTime: 2021/9/23 16:48
 * @Description: TODO
 */
public class Test2
{
    public static Map<String,Boolean> tradeCancelTradeTypeCodeMap = new HashMap<String,Boolean>();

    public static void main(String[] args)
    {
        tradeCancelTradeTypeCodeMap.put("600",true);
        System.out.println(tradeCancelTradeTypeCodeMap.get("600"));
        System.out.println(true && tradeCancelTradeTypeCodeMap.get("600"));
        System.out.println(true && tradeCancelTradeTypeCodeMap.get("900"));
    }
}