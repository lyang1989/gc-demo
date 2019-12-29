package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseParallelOldGC
 * @date 2019/12/29 8:32 下午
 * @description: Parallel Old收集器（新生代+老年代）吞吐量
 * 新生代和老年代都使用并行收集器。打印出的GC会带PSYoungGen、ParOldGen关键字
 *  -XX:+UseParallelOldGC
 */
public class UseParallelOldGC {

    public static void main(String[] args) {
        Common.gcTest(args);
    }


    /**
     *
     * -Xms30m -Xmx30m -Xmn10m -XX:+UseParallelOldGC -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     2019-12-29T20:45:22.431-0800: 0.217: [GC (Allocation Failure) [PSYoungGen: 8404K->0K(9728K)] 19164K->11792K(30208K), 0.0005898 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     Heap
     PSYoungGen      total 9728K, used 8556K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 9216K, 92% used [0x00000007bf600000,0x00000007bfe5b3b0,0x00000007bff00000)
     from space 512K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007bff80000)
     to   space 512K, 0% used [0x00000007bff80000,0x00000007bff80000,0x00000007c0000000)
     ParOldGen       total 20480K, used 11792K [0x00000007be200000, 0x00000007bf600000, 0x00000007bf600000)
     object space 20480K, 57% used [0x00000007be200000,0x00000007bed840f8,0x00000007bf600000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     */
}
