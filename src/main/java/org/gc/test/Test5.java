package org.gc.test;

/**
 * @Author: guochang3
 * @DateTime: 2021/12/6 15:04
 * @Description: TODO
 */
public class Test5
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("1##2##3##4##5##");
        System.out.println(sb.substring(0,sb.lastIndexOf("##")));
    }
}