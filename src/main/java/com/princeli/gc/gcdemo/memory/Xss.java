package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className Xss
 * @date 2019/12/29 7:06 下午
 * @description: 设置虚拟机线程堆栈大小
 * -Xss
 *
 */
public class Xss {

    private static int count = 0;

    public static void main(String[] args) {
        try {
            recursion(0L, 0L, 0L);

        } catch (Throwable e) {
            System.out.println("deep of calling = " + count);
            e.printStackTrace();
        }
    }

    public static void recursion(long a, long b, long c) {
        long e = 1, f = 2, g = 3, h = 4, i = 5, k = 7, q = 7, x = 8, y = 9, z = 10;
        count++;
        recursion(a, b, c);
    }

    /**
     *
     * -Xss256K
     deep of calling = 577
     java.lang.StackOverflowError
     at com.princeli.gc.gcdemo.memory.Xss.recursion(Xss.java:28)
     ......
     *
     *
     * -Xss512K
     deep of calling = 1487
     java.lang.StackOverflowError
     at com.princeli.gc.gcdemo.memory.Xss.recursion(Xss.java:28)
     ......
     *
     */

}
