package com.princeli.gc.gcdemo.gclog;

/**
 * @author : princeli
 * @version 1.0
 * @className TraceClassLoading
 * @date 2019/12/21 11:33 下午
 * @description: 监控类的加载
 *
 * jdk1.8 -XX:+TraceClassLoading
 * jdk11 -Xlog:class+load=info
 */
public class TraceClassLoading {

    public static void main(String[] args) {
        Common.gcTest(args);
    }

    /**
     jdk1.8

     [Opened /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     [Loaded java.lang.Object from /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     [Loaded java.io.Serializable from /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     [Loaded java.lang.Comparable from /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     [Loaded java.lang.CharSequence from /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     [Loaded java.lang.String from /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar]
     ........
     */


    /**
     jdk11

     [0.007s][info][class,load] opened: /Library/Java/JavaVirtualMachines/jdk11.0.5.jdk/Contents/Home/lib/modules
     [0.014s][info][class,load] java.lang.Object source: jrt:/java.base
     [0.014s][info][class,load] java.io.Serializable source: jrt:/java.base
     [0.014s][info][class,load] java.lang.Comparable source: jrt:/java.base
     [0.014s][info][class,load] java.lang.CharSequence source: jrt:/java.base
     [0.015s][info][class,load] java.lang.String source: jrt:/java.base
     ........

     */
}
