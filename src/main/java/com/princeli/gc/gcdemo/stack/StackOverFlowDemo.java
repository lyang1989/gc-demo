package com.princeli.gc.gcdemo.stack;

/**
 * @author : princeli
 * @version 1.0
 * @className StackOverFlowDemo
 * @date 2019/12/21 7:14 下午
 * @description: TODO
 */
public class StackOverFlowDemo {
    public static long count=0;

    public static void method(long i){
        System.out.println(count++);
        method(i);
    }

    public static void main(String[] args) {
        method(1);
    }
}
