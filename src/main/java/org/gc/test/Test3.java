package org.gc.test;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: guochang3
 * @DateTime: 2021/10/11 15:06
 * @Description: TODO
 */
public class Test3
{
    public static void main(String[] args)
    {
        String intfid = "TF_B_TRADE_SVC,TF_B_TRADE_PLATSVC,TF_B_TRADE,TF_B_TRADE_OFFER_REL,TF_B_TRADE_SMS,";
        String re_intfid = getChangeProductStandardUndoTable(intfid);
        System.out.println(re_intfid);

    }


    private static String getChangeProductStandardUndoTable(String intfId)
    {

        String[] tableNames = intfId.split(",");
        String standardTables = "";
        for (int i = 0, size = tableNames.length; i < size; i++)
        {
            String tableName = tableNames[i];
            if (StringUtils.isNotEmpty(tableName))
            {
                if ("TF_B_TRADE_SVC".equals(tableName) || "TF_B_TRADE_DISCNT".equals(tableName) || "TF_B_TRADE_ATTR".equals(tableName) || "TF_B_TRADE_OFFER_REL".equals(tableName) || "TF_B_TRADE_PRICE_PLAN".equals(tableName))
                {
                    continue;
                }
                standardTables += tableName + ",";
            }
        }
        return standardTables;
    }
}