package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className PrintGCDetails
 * @date 2019/12/21 11:17 下午
 * @description: 打印GC的详细信息
 *
 * jdk1.8 -XX:+PrintGCDetails
 * jdk11 -Xlog:gc*
 */
public class PrintGCDetails {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**
     jdk1.8

     [GC (Allocation Failure) [PSYoungGen: 131217K->1824K(153088K)] 131217K->1832K(502784K), 0.0010588 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     [GC (Allocation Failure) [PSYoungGen: 132404K->1760K(153088K)] 132412K->1776K(502784K), 0.0011542 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     [GC (Allocation Failure) [PSYoungGen: 132930K->1680K(153088K)] 132946K->1696K(502784K), 0.0005565 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     Heap
     PSYoungGen      total 153088K, used 29127K [0x0000000715580000, 0x0000000728080000, 0x00000007c0000000)
     eden space 131584K, 20% used [0x0000000715580000,0x000000071704dea0,0x000000071d600000)
     from space 21504K, 7% used [0x000000071d600000,0x000000071d7a4020,0x000000071eb00000)
     to   space 21504K, 0% used [0x0000000726b80000,0x0000000726b80000,0x0000000728080000)
     ParOldGen       total 349696K, used 16K [0x00000005c0000000, 0x00000005d5580000, 0x0000000715580000)
     object space 349696K, 0% used [0x00000005c0000000,0x00000005c0004000,0x00000005d5580000)
     Metaspace       used 3136K, capacity 4500K, committed 4864K, reserved 1056768K
     class space    used 346K, capacity 388K, committed 512K, reserved 1048576K

     */

    /**
     jdk11

     [0.010s][info][gc,heap] Heap region size: 2M
     [0.013s][info][gc     ] Using G1
     [0.013s][info][gc,heap,coops] Heap address: 0x0000000600000000, size: 8192 MB, Compressed Oops mode: Zero based, Oop shift amount: 3
     [0.203s][info][gc,start     ] GC(0) Pause Young (Concurrent Start) (G1 Humongous Allocation)
     [0.204s][info][gc,task      ] GC(0) Using 10 workers of 10 for evacuation
     [0.208s][info][gc,phases    ] GC(0)   Pre Evacuate Collection Set: 0.0ms
     [0.208s][info][gc,phases    ] GC(0)   Evacuate Collection Set: 3.0ms
     [0.208s][info][gc,phases    ] GC(0)   Post Evacuate Collection Set: 0.7ms
     [0.208s][info][gc,phases    ] GC(0)   Other: 0.6ms
     [0.208s][info][gc,heap      ] GC(0) Eden regions: 3->0(151)
     [0.208s][info][gc,heap      ] GC(0) Survivor regions: 0->2(2)
     [0.208s][info][gc,heap      ] GC(0) Old regions: 0->0
     [0.208s][info][gc,heap      ] GC(0) Humongous regions: 115->1
     [0.208s][info][gc,metaspace ] GC(0) Metaspace: 6496K->6496K(1056768K)
     [0.208s][info][gc           ] GC(0) Pause Young (Concurrent Start) (G1 Humongous Allocation) 235M->4M(512M) 4.427ms
     [0.208s][info][gc,cpu       ] GC(0) User=0.01s Sys=0.01s Real=0.01s
     [0.208s][info][gc           ] GC(1) Concurrent Cycle
     [0.208s][info][gc,marking   ] GC(1) Concurrent Clear Claimed Marks
     [0.208s][info][gc,marking   ] GC(1) Concurrent Clear Claimed Marks 0.007ms
     [0.208s][info][gc,marking   ] GC(1) Concurrent Scan Root Regions
     [0.209s][info][gc,marking   ] GC(1) Concurrent Scan Root Regions 0.579ms
     [0.209s][info][gc,marking   ] GC(1) Concurrent Mark (0.209s)
     [0.209s][info][gc,marking   ] GC(1) Concurrent Mark From Roots
     [0.209s][info][gc,task      ] GC(1) Using 3 workers of 3 for marking
     [0.209s][info][gc,marking   ] GC(1) Concurrent Mark From Roots 0.457ms
     [0.209s][info][gc,marking   ] GC(1) Concurrent Preclean
     [0.209s][info][gc,marking   ] GC(1) Concurrent Preclean 0.022ms
     [0.209s][info][gc,marking   ] GC(1) Concurrent Mark (0.209s, 0.209s) 0.502ms
     [0.209s][info][gc,start     ] GC(1) Pause Remark
     [0.210s][info][gc,stringtable] GC(1) Cleaned string and symbol table, strings: 2686 processed, 0 removed, symbols: 26539 processed, 0 removed
     [0.210s][info][gc            ] GC(1) Pause Remark 43M->43M(512M) 0.510ms
     [0.210s][info][gc,cpu        ] GC(1) User=0.00s Sys=0.00s Real=0.00s
     [0.210s][info][gc,marking    ] GC(1) Concurrent Rebuild Remembered Sets
     [0.210s][info][gc,marking    ] GC(1) Concurrent Rebuild Remembered Sets 0.040ms
     [0.210s][info][gc,start      ] GC(1) Pause Cleanup
     [0.210s][info][gc            ] GC(1) Pause Cleanup 45M->45M(512M) 0.065ms
     [0.210s][info][gc,cpu        ] GC(1) User=0.00s Sys=0.00s Real=0.00s
     [0.210s][info][gc,marking    ] GC(1) Concurrent Cleanup for Next Mark
     [0.213s][info][gc,marking    ] GC(1) Concurrent Cleanup for Next Mark 2.543ms
     [0.213s][info][gc            ] GC(1) Concurrent Cycle 4.586ms
     [0.217s][info][gc,start      ] GC(2) Pause Young (Concurrent Start) (G1 Humongous Allocation)
     [0.217s][info][gc,task       ] GC(2) Using 10 workers of 10 for evacuation
     [0.219s][info][gc,phases     ] GC(2)   Pre Evacuate Collection Set: 0.0ms
     [0.220s][info][gc,phases     ] GC(2)   Evacuate Collection Set: 1.9ms
     [0.220s][info][gc,phases     ] GC(2)   Post Evacuate Collection Set: 0.2ms
     [0.220s][info][gc,phases     ] GC(2)   Other: 0.1ms
     [0.220s][info][gc,heap       ] GC(2) Eden regions: 1->0(101)
     [0.220s][info][gc,heap       ] GC(2) Survivor regions: 2->2(20)
     [0.220s][info][gc,heap       ] GC(2) Old regions: 0->0
     [0.220s][info][gc,heap       ] GC(2) Humongous regions: 115->1
     [0.220s][info][gc,metaspace  ] GC(2) Metaspace: 6496K->6496K(1056768K)
     [0.220s][info][gc            ] GC(2) Pause Young (Concurrent Start) (G1 Humongous Allocation) 233M->4M(512M) 2.297ms
     [0.220s][info][gc,cpu        ] GC(2) User=0.00s Sys=0.00s Real=0.01s
     [0.220s][info][gc            ] GC(3) Concurrent Cycle
     [0.220s][info][gc,marking    ] GC(3) Concurrent Clear Claimed Marks
     [0.220s][info][gc,marking    ] GC(3) Concurrent Clear Claimed Marks 0.005ms
     [0.220s][info][gc,marking    ] GC(3) Concurrent Scan Root Regions
     [0.220s][info][gc,marking    ] GC(3) Concurrent Scan Root Regions 0.448ms
     [0.220s][info][gc,marking    ] GC(3) Concurrent Mark (0.220s)
     [0.220s][info][gc,marking    ] GC(3) Concurrent Mark From Roots
     [0.220s][info][gc,task       ] GC(3) Using 3 workers of 3 for marking
     [0.220s][info][gc,marking    ] GC(3) Concurrent Mark From Roots 0.313ms
     [0.220s][info][gc,marking    ] GC(3) Concurrent Preclean
     [0.220s][info][gc,marking    ] GC(3) Concurrent Preclean 0.031ms
     [0.220s][info][gc,marking    ] GC(3) Concurrent Mark (0.220s, 0.220s) 0.372ms
     [0.221s][info][gc,start      ] GC(3) Pause Remark
     [0.221s][info][gc,stringtable] GC(3) Cleaned string and symbol table, strings: 2686 processed, 0 removed, symbols: 26539 processed, 0 removed
     [0.221s][info][gc            ] GC(3) Pause Remark 37M->37M(512M) 0.716ms
     [0.221s][info][gc,cpu        ] GC(3) User=0.01s Sys=0.00s Real=0.00s
     [0.221s][info][gc,marking    ] GC(3) Concurrent Rebuild Remembered Sets
     [0.221s][info][gc,marking    ] GC(3) Concurrent Rebuild Remembered Sets 0.047ms
     [0.221s][info][gc,start      ] GC(3) Pause Cleanup
     [0.222s][info][gc            ] GC(3) Pause Cleanup 39M->39M(512M) 0.055ms
     [0.222s][info][gc,cpu        ] GC(3) User=0.00s Sys=0.00s Real=0.00s
     [0.222s][info][gc,marking    ] GC(3) Concurrent Cleanup for Next Mark
     [0.225s][info][gc,marking    ] GC(3) Concurrent Cleanup for Next Mark 3.094ms
     [0.225s][info][gc            ] GC(3) Concurrent Cycle 5.106ms
     [0.227s][info][gc,start      ] GC(4) Pause Young (Concurrent Start) (G1 Humongous Allocation)
     [0.228s][info][gc,task       ] GC(4) Using 10 workers of 10 for evacuation
     [0.230s][info][gc,phases     ] GC(4)   Pre Evacuate Collection Set: 0.0ms
     [0.230s][info][gc,phases     ] GC(4)   Evacuate Collection Set: 2.1ms
     [0.230s][info][gc,phases     ] GC(4)   Post Evacuate Collection Set: 0.2ms
     [0.230s][info][gc,phases     ] GC(4)   Other: 0.1ms
     [0.230s][info][gc,heap       ] GC(4) Eden regions: 1->0(87)
     [0.230s][info][gc,heap       ] GC(4) Survivor regions: 2->2(13)
     [0.230s][info][gc,heap       ] GC(4) Old regions: 0->0
     [0.230s][info][gc,heap       ] GC(4) Humongous regions: 115->1
     [0.230s][info][gc,metaspace  ] GC(4) Metaspace: 6497K->6497K(1056768K)
     [0.230s][info][gc            ] GC(4) Pause Young (Concurrent Start) (G1 Humongous Allocation) 233M->4M(512M) 2.419ms
     [0.230s][info][gc,cpu        ] GC(4) User=0.00s Sys=0.00s Real=0.01s
     [0.230s][info][gc            ] GC(5) Concurrent Cycle
     [0.230s][info][gc,marking    ] GC(5) Concurrent Clear Claimed Marks
     [0.230s][info][gc,marking    ] GC(5) Concurrent Clear Claimed Marks 0.003ms
     [0.230s][info][gc,marking    ] GC(5) Concurrent Scan Root Regions
     [0.230s][info][gc,marking    ] GC(5) Concurrent Scan Root Regions 0.473ms
     [0.230s][info][gc,marking    ] GC(5) Concurrent Mark (0.230s)
     [0.230s][info][gc,marking    ] GC(5) Concurrent Mark From Roots
     [0.230s][info][gc,task       ] GC(5) Using 3 workers of 3 for marking
     [0.231s][info][gc,marking    ] GC(5) Concurrent Mark From Roots 0.368ms
     [0.231s][info][gc,marking    ] GC(5) Concurrent Preclean
     [0.231s][info][gc,marking    ] GC(5) Concurrent Preclean 0.023ms
     [0.231s][info][gc,marking    ] GC(5) Concurrent Mark (0.230s, 0.231s) 0.414ms
     [0.231s][info][gc,start      ] GC(5) Pause Remark
     [0.231s][info][gc,stringtable] GC(5) Cleaned string and symbol table, strings: 2686 processed, 0 removed, symbols: 26539 processed, 0 removed
     [0.231s][info][gc            ] GC(5) Pause Remark 40M->40M(512M) 0.491ms
     [0.231s][info][gc,cpu        ] GC(5) User=0.00s Sys=0.00s Real=0.00s
     [0.231s][info][gc,marking    ] GC(5) Concurrent Rebuild Remembered Sets
     [0.232s][info][gc,marking    ] GC(5) Concurrent Rebuild Remembered Sets 0.038ms
     [0.232s][info][gc,start      ] GC(5) Pause Cleanup
     [0.232s][info][gc            ] GC(5) Pause Cleanup 43M->43M(512M) 0.062ms
     [0.232s][info][gc,cpu        ] GC(5) User=0.00s Sys=0.00s Real=0.00s
     [0.232s][info][gc,marking    ] GC(5) Concurrent Cleanup for Next Mark
     [0.233s][info][gc,marking    ] GC(5) Concurrent Cleanup for Next Mark 0.780ms
     [0.233s][info][gc            ] GC(5) Concurrent Cycle 2.604ms
     [0.235s][info][gc,heap,exit  ] Heap
     [0.235s][info][gc,heap,exit  ]  garbage-first heap   total 524288K, used 121368K [0x0000000600000000, 0x0000000800000000)
     [0.235s][info][gc,heap,exit  ]   region size 2048K, 3 young (6144K), 2 survivors (4096K)
     [0.235s][info][gc,heap,exit  ]  Metaspace       used 6512K, capacity 6610K, committed 6784K, reserved 1056768K
     [0.235s][info][gc,heap,exit  ]   class space    used 576K, capacity 603K, committed 640K, reserved 1048576K



     *
     */

}
