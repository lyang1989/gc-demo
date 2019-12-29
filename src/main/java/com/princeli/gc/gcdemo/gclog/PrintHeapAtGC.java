package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className PrintHeapAtGC
 * @date 2019/12/21 11:28 下午
 * @description: 每次CG后都打印堆栈信息
 *
 * -XX:+PrintHeapAtGC
 */
public class PrintHeapAtGC {
    public static void main(String[] args) {
        Common.gcTest(args);
    }


    /**

     {Heap before GC invocations=1 (full 0):
     PSYoungGen      total 153088K, used 131217K [0x0000000715580000, 0x0000000720000000, 0x00000007c0000000)
     eden space 131584K, 99% used [0x0000000715580000,0x000000071d5a4548,0x000000071d600000)
     from space 21504K, 0% used [0x000000071eb00000,0x000000071eb00000,0x0000000720000000)
     to   space 21504K, 0% used [0x000000071d600000,0x000000071d600000,0x000000071eb00000)
     ParOldGen       total 349696K, used 0K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0000000,0x00000005d5580000)
     Metaspace       used 3127K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     Heap after GC invocations=1 (full 0):
     PSYoungGen      total 153088K, used 1776K [0x0000000715580000, 0x0000000720000000, 0x00000007c0000000)
     eden space 131584K, 0% used [0x0000000715580000,0x0000000715580000,0x000000071d600000)
     from space 21504K, 8% used [0x000000071d600000,0x000000071d7bc020,0x000000071eb00000)
     to   space 21504K, 0% used [0x000000071eb00000,0x000000071eb00000,0x0000000720000000)
     ParOldGen       total 349696K, used 8K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0002000,0x00000005d5580000)
     Metaspace       used 3127K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     }
     {Heap before GC invocations=2 (full 0):
     PSYoungGen      total 153088K, used 132356K [0x0000000715580000, 0x0000000720000000, 0x00000007c0000000)
     eden space 131584K, 99% used [0x0000000715580000,0x000000071d505368,0x000000071d600000)
     from space 21504K, 8% used [0x000000071d600000,0x000000071d7bc020,0x000000071eb00000)
     to   space 21504K, 0% used [0x000000071eb00000,0x000000071eb00000,0x0000000720000000)
     ParOldGen       total 349696K, used 8K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0002000,0x00000005d5580000)
     Metaspace       used 3129K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     Heap after GC invocations=2 (full 0):
     PSYoungGen      total 153088K, used 1728K [0x0000000715580000, 0x0000000728080000, 0x00000007c0000000)
     eden space 131584K, 0% used [0x0000000715580000,0x0000000715580000,0x000000071d600000)
     from space 21504K, 8% used [0x000000071eb00000,0x000000071ecb0010,0x0000000720000000)
     to   space 21504K, 0% used [0x000000071d600000,0x000000071d600000,0x000000071eb00000)
     ParOldGen       total 349696K, used 16K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0004000,0x00000005d5580000)
     Metaspace       used 3129K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     }
     {Heap before GC invocations=3 (full 0):
     PSYoungGen      total 153088K, used 132898K [0x0000000715580000, 0x0000000728080000, 0x00000007c0000000)
     eden space 131584K, 99% used [0x0000000715580000,0x000000071d598a80,0x000000071d600000)
     from space 21504K, 8% used [0x000000071eb00000,0x000000071ecb0010,0x0000000720000000)
     to   space 21504K, 0% used [0x000000071d600000,0x000000071d600000,0x000000071eb00000)
     ParOldGen       total 349696K, used 16K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0004000,0x00000005d5580000)
     Metaspace       used 3130K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     Heap after GC invocations=3 (full 0):
     PSYoungGen      total 153088K, used 1648K [0x0000000715580000, 0x0000000728080000, 0x00000007c0000000)
     eden space 131584K, 0% used [0x0000000715580000,0x0000000715580000,0x000000071d600000)
     from space 21504K, 7% used [0x000000071d600000,0x000000071d79c020,0x000000071eb00000)
     to   space 21504K, 0% used [0x0000000726b80000,0x0000000726b80000,0x0000000728080000)
     ParOldGen       total 349696K, used 16K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0004000,0x00000005d5580000)
     Metaspace       used 3130K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 345K, capacity 388K, committed 512K, reserved 1048576K
     }


     *
     */
}
