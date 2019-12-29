package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className OldSize
 * @date 2019/12/29 7:51 下午
 * @description: 设置老年代大小
 * -XX:OldSize
 *
 */
public class OldSize {
    public static void main(String[] args) {
        byte[] b;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }

    /**
     * -XX:OldSize=20m -XX:+PrintGCDetails
     * 新生代  170.5m   老年代 20m
     *
     Heap
     PSYoungGen      total 153088K, used 18135K [0x0000000715580000, 0x0000000720000000, 0x00000007c0000000)
     eden space 131584K, 13% used [0x0000000715580000,0x0000000716735e68,0x000000071d600000)
     from space 21504K, 0% used [0x000000071eb00000,0x000000071eb00000,0x0000000720000000)
     to   space 21504K, 0% used [0x000000071d600000,0x000000071d600000,0x000000071eb00000)
     ParOldGen       total 20480K, used 0K [0x00000005c0000000, 0x00000005c1400000, 0x0000000715580000)
     object space 20480K, 0% used [0x00000005c0000000,0x00000005c0000000,0x00000005c1400000)
     Metaspace       used 3022K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     * -XX:OldSize=20m -Xms40m -Xmx100m -XX:+PrintGCDetails
     * 新生代 13m   老年代 20m
     *
     Heap
     PSYoungGen      total 11776K, used 4309K [0x00000007bdf00000, 0x00000007bf600000, 0x00000007c0000000)
     eden space 10240K, 33% used [0x00000007bdf00000,0x00000007be265600,0x00000007be900000)
     from space 1536K, 54% used [0x00000007be900000,0x00000007be9d0000,0x00000007bea80000)
     to   space 1536K, 0% used [0x00000007bf480000,0x00000007bf480000,0x00000007bf600000)
     ParOldGen       total 20480K, used 8K [0x00000007b9c00000, 0x00000007bb000000, 0x00000007bdf00000)
     object space 20480K, 0% used [0x00000007b9c00000,0x00000007b9c02000,0x00000007bb000000)
     Metaspace       used 3029K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     */

}
