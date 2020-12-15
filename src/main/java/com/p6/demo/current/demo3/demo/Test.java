package com.p6.demo.current.demo3.demo;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 徐恩晗 xshlxx@126.com
 * @since 2020/12/3
 */
public class Test {


    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        int maxSize = 5;

        Product product = new Product(queue,maxSize);

        Consumer consumer = new Consumer(queue,maxSize);

        Thread t1 = new Thread(product);

        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}