package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseConcMarkSweepGC
 * @date 2019/12/29 8:35 下午
 * @description: CMS收集器（老年代）
 * 新生代使用ParNew收集器,老年代使用CMS收集器
 * -XX:+UseConcMarkSweepGC
 * -XX:ParallelCMSThreads 设置并行GC时进行内存回收的线程数量
 */
public class UseConcMarkSweepGC {


    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**
     *
     *  -Xms30m -Xmx30m -Xmn10m -XX:+UseConcMarkSweepGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     Heap
     par new generation   total 9216K, used 3396K [0x00000007be200000, 0x00000007bec00000, 0x00000007bec00000)
     eden space 8192K,  41% used [0x00000007be200000, 0x00000007be551200, 0x00000007bea00000)
     from space 1024K,   0% used [0x00000007beb00000, 0x00000007beb00000, 0x00000007bec00000)
     to   space 1024K,   0% used [0x00000007bea00000, 0x00000007bea00000, 0x00000007beb00000)
     concurrent mark-sweep generation total 20480K, used 1525K [0x00000007bec00000, 0x00000007c0000000, 0x00000007c0000000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     */
}
