package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseG1GC
 * @date 2019/12/29 8:49 下午
 * @description: G1垃圾回收器
 *  -XX:+UseG1GC
 */
public class UseG1GC {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**
     *
     *  -Xms30m -Xmx30m -Xmn10m -XX:+UseG1GC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     Heap
     garbage-first heap   total 30720K, used 6997K [0x00000007be200000, 0x00000007be3000f0, 0x00000007c0000000)
     region size 1024K, 2 young (2048K), 1 survivors (1024K)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     */
}
