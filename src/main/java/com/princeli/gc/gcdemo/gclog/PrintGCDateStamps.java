package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className PrintGCDateStamps
 * @date 2019/12/22 11:04 上午
 * @description: 输出GC的时间戳（以日期的形式，如 2013-05-04T21:53:59.234+0800）
 *
 * -XX:+PrintGCDateStamps -XX:+PrintGCDetails
 *
 */
public class PrintGCDateStamps {
    public static void main(String[] args) {
        Common.gcTest(args);
    }
}
