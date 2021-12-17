package org.gc.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @Author: guochang3
 * @DateTime: 2021/5/25 16:52
 * @Description: TODO
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        test1();
    }

    public static void test1() throws Exception {
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("redis.xml");
        BufferedReader bf = new BufferedReader(new InputStreamReader(resourceAsStream!=null?resourceAsStream:new InputStream() {
            @Override
            public int read() {
                return 0;
            }
        }));


        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(bf);
        System.out.println(document);
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
        String name = rootElement.getName();
        System.out.println(name);
        Object data = rootElement.getData();
        System.out.println(data);
        List attributes = rootElement.attributes();
        for (Object next : attributes) {
            System.out.println(next);
        }


        bf.close();
        resourceAsStream.close();
    }

}