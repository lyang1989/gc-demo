package com.princeli.gc.gcdemo.gccollector;

import com.princeli.gc.gcdemo.gclog.Common;

/**
 * @author : princeli
 * @version 1.0
 * @className UseSerialGC
 * @date 2019/12/29 8:13 下午
 * @description:  串行收集器（新生代+老年代）
 * 新生代使用复制算法，老年代使用标记-整理算法
 *
 * -XX:+UseSerialGC
 */
public class UseSerialGC {

    public static void main(String[] args) {
        Common.gcTest(args);
    }


    /**
     *
     * -Xms30m -Xmx30m -Xmn10m -XX:+UseSerialGC  -XX:+PrintGCDateStamps -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
     *
     2019-12-29T20:48:01.761-0800: 0.181: [GC (Allocation Failure) 2019-12-29T20:48:01.761-0800: 0.181: [DefNew: 7328K->0K(9216K), 0.0002766 secs] 26257K->19953K(29696K), 0.0002971 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     Heap
     def new generation   total 9216K, used 3396K [0x00000007be200000, 0x00000007bec00000, 0x00000007bec00000)
     eden space 8192K,  41% used [0x00000007be200000, 0x00000007be551200, 0x00000007bea00000)
     from space 1024K,   0% used [0x00000007beb00000, 0x00000007beb00020, 0x00000007bec00000)
     to   space 1024K,   0% used [0x00000007bea00000, 0x00000007bea00000, 0x00000007beb00000)
     tenured generation   total 20480K, used 19953K [0x00000007bec00000, 0x00000007c0000000, 0x00000007c0000000)
     the space 20480K,  97% used [0x00000007bec00000, 0x00000007bff7c400, 0x00000007bff7c400, 0x00000007c0000000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     */
}
