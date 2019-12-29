package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className SurvivorRatio
 * @date 2019/12/29 7:41 下午
 * @description: 设置Eden区与Survivor区比例，默认8:1:1
 * -XX:SurvivorRatio
 */
public class SurvivorRatio {

    public static void main(String[] args) {
        byte[] b;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }

    /**
     * 默认
     * -Xmn10m -XX:+PrintGCDetails
     * eden区:8m,s1区:1m,s2区:1m
     * eden:survivor = 8:1:1
     Heap
     PSYoungGen      total 9216K, used 6180K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 8192K, 66% used [0x00000007bf600000,0x00000007bfb511b8,0x00000007bfe00000)
     from space 1024K, 71% used [0x00000007bfe00000,0x00000007bfeb8000,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 514048K, used 8K [0x00000005c0000000, 0x00000005df600000, 0x00000007bf600000)
     object space 514048K, 0% used [0x00000005c0000000,0x00000005c0002000,0x00000005df600000)
     Metaspace       used 3021K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     * -Xmn11m -XX:SurvivorRatio=9 -XX:+PrintGCDetails
     * eden区:9m,s1区:1m,s2区:1m
     * eden:survivor = 9:1:1
     Heap
     PSYoungGen      total 10240K, used 5228K [0x00000007bf500000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 9216K, 48% used [0x00000007bf500000,0x00000007bf95b3a8,0x00000007bfe00000)
     from space 1024K, 75% used [0x00000007bfe00000,0x00000007bfec0000,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 513024K, used 8K [0x00000005c0000000, 0x00000005df500000, 0x00000007bf500000)
     object space 513024K, 0% used [0x00000005c0000000,0x00000005c0002000,0x00000005df500000)
     Metaspace       used 3011K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     *
     */

}
