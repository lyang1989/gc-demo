package com.princeli.gc.gcdemo.memory;

/**
 * @author : princeli
 * @version 1.0
 * @className NewRatio
 * @date 2019/12/29 7:18 下午
 * @description: 设置老年代新生代比例,默认2:1
 * -XX:NewRatio
 *
 */
public class NewRatio {

    public static void main(String[] args) {
        byte[] b;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }

    /**
     *
     * 默认2:1
     * -Xms30m -Xmx30m -XX:+PrintGCDetails
     Heap
     PSYoungGen      total 9216K, used 6196K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 8192K, 66% used [0x00000007bf600000,0x00000007bfb510b8,0x00000007bfe00000)
     from space 1024K, 73% used [0x00000007bfe00000,0x00000007bfebc010,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 20480K, used 8K [0x00000007be200000, 0x00000007bf600000, 0x00000007bf600000)
     object space 20480K, 0% used [0x00000007be200000,0x00000007be202000,0x00000007bf600000)
     Metaspace       used 3082K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 336K, capacity 388K, committed 512K, reserved 1048576K
     *
     *
     *
     * 设置4:1
     * -XX:NewRatio=4 -Xms50m -Xmx50m -XX:+PrintGCDetails
     Heap
     PSYoungGen      total 9216K, used 6180K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
     eden space 8192K, 66% used [0x00000007bf600000,0x00000007bfb51170,0x00000007bfe00000)
     from space 1024K, 71% used [0x00000007bfe00000,0x00000007bfeb8000,0x00000007bff00000)
     to   space 1024K, 0% used [0x00000007bff00000,0x00000007bff00000,0x00000007c0000000)
     ParOldGen       total 40960K, used 8K [0x00000007bce00000, 0x00000007bf600000, 0x00000007bf600000)
     object space 40960K, 0% used [0x00000007bce00000,0x00000007bce02000,0x00000007bf600000)
     Metaspace       used 3018K, capacity 4496K, committed 4864K, reserved 1056768K
     class space    used 334K, capacity 388K, committed 512K, reserved 1048576K
     *
     */

}
