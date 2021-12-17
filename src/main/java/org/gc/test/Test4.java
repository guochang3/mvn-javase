package org.gc.test;

/**
 * @Author: guochang3
 * @DateTime: 2021/11/19 11:27
 * @Description: TODO
 */
public class Test4
{
    public static void main(String[] args)
    {
        StringBuilder str1 = new StringBuilder("[副卡][13807501860]~~[副卡][13876202086]~~");
        StringBuilder str2 = new StringBuilder("[宽带][KD_13518076789]:该号码订购以下商品:FTTH宽带产品500M套餐(2018)【FTTH宽带产品500M套餐(2018)】~~");
        StringBuilder str3 = new StringBuilder("[移动电视]:产品：未来电视【未来电视】~~基础包：魔百和-基础包月15元（未来电视）【魔百和-基础包月15元（未来电视）】~~");
        StringBuilder str4 = new StringBuilder();

        System.out.println(subStringBuilder(str1));
        System.out.println(subStringBuilder(str2));
        System.out.println(subStringBuilder(str3));
        System.out.println(subStringBuilder(str4));
    }

    public static String subStringBuilder(StringBuilder sb)
    {
        System.out.println();
        if(sb.lastIndexOf("~~") != -1){
            return sb.substring(0, sb.lastIndexOf("~~"));
        }
        return sb.toString();
    }
}
