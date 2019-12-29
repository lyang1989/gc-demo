package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseParallelGC
 * @date 2019/12/29 8:23 下午
 * @description: Parallel收集器（新生代）吞吐量
 * 新生代使用Parallel收集器，老年代使用串行收集器
 * 吞吐量=运行用户代码时间/（运行用户代码时间+垃圾收集时间）
 * -XX:+UseParallelGC
 */
public class UseParallelGC {

    public static void main(String[] args) {
        Common.gcTest(args);
    }


    /**
     *
     * -Xms30m -Xmx30m -Xmn10m -XX:+UseParallelGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     2019-12-29T20:44:16.300-0800: 0.185: [GC (Allocation Failure) [PSYoungGen: 8404K->0K(9728K)] 19164K->11792K(30208K), 0.0010608 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
     Heap
     PSYoungGen      total 9728K, used 8556K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 9216K, 92% used [0x00000007bf600000,0x00000007bfe5b3b0,0x00000007bff00000)
     from space 512K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007bff80000)
     to   space 512K, 0% used [0x00000007bff80000,0x00000007bff80000,0x00000007c0000000)
     ParOldGen       total 20480K, used 11792K [0x00000007be200000, 0x00000007bf600000, 0x00000007bf600000)
     object space 20480K, 57% used [0x00000007be200000,0x00000007bed841d0,0x00000007bf600000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     *
     */
}
