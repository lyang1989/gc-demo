package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseParNewGC
 * @date 2019/12/29 8:19 下午
 * @description: ParNew收集器（新生代）多线程收集器
 * 新生代并行，老年代串行
 * -XX:+UseParNewGC
 */
public class UseParNewGC {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**
     *
     * -Xms30m -Xmx30m -Xmn10m -XX:+UseParNewGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     Java HotSpot(TM) 64-Bit Server VM warning: Using the ParNew young collector with the Serial old collector is deprecated and will likely be removed in a future release
     2019-12-29T20:46:34.742-0800: 0.171: [GC (Allocation Failure) 2019-12-29T20:46:34.742-0800: 0.171: [ParNew: 7330K->2K(9216K), 0.0002700 secs] 26259K->19954K(29696K), 0.0002862 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
     Heap
     par new generation   total 9216K, used 3398K [0x00000007be200000, 0x00000007bec00000, 0x00000007bec00000)
     eden space 8192K,  41% used [0x00000007be200000, 0x00000007be551200, 0x00000007bea00000)
     from space 1024K,   0% used [0x00000007beb00000, 0x00000007beb00810, 0x00000007bec00000)
     to   space 1024K,   0% used [0x00000007bea00000, 0x00000007bea00000, 0x00000007beb00000)
     tenured generation   total 20480K, used 19952K [0x00000007bec00000, 0x00000007c0000000, 0x00000007c0000000)
     the space 20480K,  97% used [0x00000007bec00000, 0x00000007bff7c360, 0x00000007bff7c400, 0x00000007c0000000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     */

}
