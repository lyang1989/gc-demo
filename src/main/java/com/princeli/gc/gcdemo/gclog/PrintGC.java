package com.princeli.gc.gcdemo.gclog;

import java.io.IOException;

/**
 * @author : princeli
 * @version 1.0
 * @className PrintGC
 * @date 2019/12/21 11:08 下午
 * @description: 打印GC的概要信息
 *
 * jdk1.8 -XX:+PrintGC
 * jdk11 -Xlog:gc
 */
public class PrintGC {

    public static void main(String[] args) throws IOException {
        Common.gcTest(args);
    }

    /**
     jdk1.8
     [GC (Allocation Failure)  131217K->1832K(502784K), 0.0011040 secs]
     [GC (Allocation Failure)  132412K->1696K(502784K), 0.0009708 secs]
     [GC (Allocation Failure)  132866K->1688K(502784K), 0.0005406 secs]
     */



    /**
     jdk11
     [0.011s][info][gc] Using G1
     [0.182s][info][gc] GC(0) Pause Young (Concurrent Start) (G1 Humongous Allocation) 235M->4M(512M) 3.894ms
     [0.183s][info][gc] GC(1) Concurrent Cycle
     [0.184s][info][gc] GC(1) Pause Remark 33M->33M(512M) 0.402ms
     [0.184s][info][gc] GC(1) Pause Cleanup 35M->35M(512M) 0.042ms
     [0.186s][info][gc] GC(1) Concurrent Cycle 3.802ms
     [0.192s][info][gc] GC(2) Pause Young (Concurrent Start) (G1 Humongous Allocation) 233M->4M(512M) 1.468ms
     [0.192s][info][gc] GC(3) Concurrent Cycle
     [0.194s][info][gc] GC(3) Pause Remark 31M->31M(512M) 0.901ms
     [0.194s][info][gc] GC(3) Pause Cleanup 33M->33M(512M) 0.037ms
     [0.196s][info][gc] GC(3) Concurrent Cycle 4.310ms
     [0.201s][info][gc] GC(4) Pause Young (Concurrent Start) (G1 Humongous Allocation) 233M->4M(512M) 1.796ms
     [0.201s][info][gc] GC(5) Concurrent Cycle
     [0.202s][info][gc] GC(5) Pause Remark 40M->40M(512M) 0.462ms
     [0.202s][info][gc] GC(5) Pause Cleanup 43M->43M(512M) 0.058ms
     [0.203s][info][gc] GC(5) Concurrent Cycle 2.354ms
     */

}
