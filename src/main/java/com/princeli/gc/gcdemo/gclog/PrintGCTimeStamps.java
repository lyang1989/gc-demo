package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className PrintGCTimeStamps
 * @date 2019/12/21 11:22 下午
 * @description: 输出GC的时间戳（以基准时间的形式）
 *
 * -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
 */
public class PrintGCTimeStamps {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**

     0.149: [GC (Allocation Failure) [PSYoungGen: 131217K->1792K(153088K)] 131217K->1800K(502784K), 0.0011020 secs] [Times: user=0.00 sys=0.01, real=0.00 secs]
     0.169: [GC (Allocation Failure) [PSYoungGen: 132372K->1712K(153088K)] 132380K->1728K(502784K), 0.0013094 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
     0.181: [GC (Allocation Failure) [PSYoungGen: 132882K->1664K(153088K)] 132898K->1680K(502784K), 0.0012008 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     Heap
     PSYoungGen      total 153088K, used 29111K [0x0000000715580000, 0x0000000728080000, 0x00000007c0000000)
     eden space 131584K, 20% used [0x0000000715580000,0x000000071704dea8,0x000000071d600000)
     from space 21504K, 7% used [0x000000071d600000,0x000000071d7a0010,0x000000071eb00000)
     to   space 21504K, 0% used [0x0000000726b80000,0x0000000726b80000,0x0000000728080000)
     ParOldGen       total 349696K, used 16K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0004000,0x00000005d5580000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K

     *
     */

}
