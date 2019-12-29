package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className Xmn
 * @date 2019/12/29 6:04 下午
 * @description: 设置新生代大小
 *  -Xmn
 */
public class Xmn {

    public static void main(String[] args) {
        byte[] b;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }

    /**
     *
     *
     * -Xms30m -Xmx30m -Xmn10m -XX:+PrintGCDetails
     * 指定最小堆 最大堆 设置新生代大小 打印GC详细
     * 新生代 10m，老年代20m   新生代:老年代 = 1：2
     Heap
     PSYoungGen      total 9216K, used 6212K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 8192K, 66% used [0x00000007bf600000,0x00000007bfb51170,0x00000007bfe00000)
     from space 1024K, 75% used [0x00000007bfe00000,0x00000007bfec0000,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 20480K, used 8K [0x00000007be200000, 0x00000007bf600000, 0x00000007bf600000)
     object space 20480K, 0% used [0x00000007be200000,0x00000007be202000,0x00000007bf600000)
     Metaspace       used 3022K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     * -Xmn10m -XX:+PrintGCDetails
     * 新生代 10m，老年代502m
     Heap
     PSYoungGen      total 9216K, used 6148K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 8192K, 66% used [0x00000007bf600000,0x00000007bfb51170,0x00000007bfe00000)
     from space 1024K, 68% used [0x00000007bfe00000,0x00000007bfeb0000,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 514048K, used 8K [0x00000005c0000000, 0x00000005df600000, 0x00000007bf600000)
     object space 514048K, 0% used [0x00000005c0000000,0x00000005c0002000,0x00000005df600000)
     Metaspace       used 3004K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 328K, capacity 388K, committed 512K, reserved 1048576K

     */
}
