package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className Xloggc
 * @date 2019/12/21 11:39 下午
 * @description: 输出GC文件
 *
 * jdk1.8 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -Xloggc:gc1.8.log
 * jdk11 -Xlog:gc* -Xlog:gc:gc11.log
 *
 */
public class Xloggc {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

}
