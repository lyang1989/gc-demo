package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className XmsXmx
 * @date 2019/12/29 5:29 下午
 * @description: 设置最小堆和最大堆大小
 * -Xms -Xmx
 */
public class XmsXmx {

    public static void main(String[] args) {
        logMemory(Runtime.getRuntime().maxMemory());
        logMemory(Runtime.getRuntime().freeMemory());
        logMemory(Runtime.getRuntime().totalMemory());
    }

    public static void logMemory(long memory){
        System.out.println(memory/1024.0/1024+"M");
    }

    /**
     *
     *-Xms5m -Xmx20m -XX:+PrintGCDetails
     *
     18.0M
     4.704231262207031M
     5.5M
     Heap
     PSYoungGen      total 1536K, used 640K [0x00000007bf980000, 0x00000007bfc80000, 0x00000007c0000000)
     eden space 1024K, 12% used [0x00000007bf980000,0x00000007bf9a0158,0x00000007bfa80000)
     from space 512K, 100% used [0x00000007bfb00000,0x00000007bfb80000,0x00000007bfb80000)
     to   space 512K, 0% used [0x00000007bfa80000,0x00000007bfa80000,0x00000007bfb00000)
     ParOldGen       total 4096K, used 195K [0x00000007bec00000, 0x00000007bf000000, 0x00000007bf980000)
     object space 4096K, 4% used [0x00000007bec00000,0x00000007bec30d80,0x00000007bf000000)
     Metaspace       used 3103K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 340K, capacity 388K, committed 512K, reserved 1048576K
     *
     */
}
