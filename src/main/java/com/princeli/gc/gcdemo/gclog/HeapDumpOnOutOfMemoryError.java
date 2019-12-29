package com.princeli.gc.gcdemo.gclog;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className HeapDumpOnOutOfMemoryError
 * @date 2019/12/21 11:49 下午
 * @description: OOM时导出堆到文件
 */
public class HeapDumpOnOutOfMemoryError {


    /**
     * <pre>
     *  -XX:+HeapDumpOnOutOfMemoryError
     *   OOM时导出堆到文件
     *   -XX:+HeapDumpPath
     *   导出OOM的路径
     *   -Xms5m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=
     *
     * 此外，OnOutOfMemoryError参数允许用户指定当出现oom时，指定某个脚本来完成一些动作。
     * -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/usr/local/tomcat/ -XX:OnOutOfMemoryError="sh ~/test.sh"
     *
     * 1、配置方法
     *     在JAVA_OPTIONS变量中增加
     *     -XX:+HeapDumpOnOutOfMemoryError  -XX:HeapDumpPath=${目录}。
     * 2、参数说明
     *    （1）-XX:+HeapDumpOnOutOfMemoryError参数表示当JVM发生OOM时，自动生成DUMP文件。
     *    （2）-XX:HeapDumpPath=${目录}参数表示生成DUMP文件的路径，也可以指定文件名称，例如：-XX:HeapDumpPath=${目录}/java_heapdump.hprof。
     *    如果不指定文件名，默认为：java_<pid>_<date>_<time>_heapDump.hprof。
     *  </pre>
     */
    public static void main(String[] args) {
        List<byte[]> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add(new byte[1024*1024]);
        }
    }

    /**

     java.lang.OutOfMemoryError: Java heap space
     Dumping heap to java_pid5228.hprof ...
     Heap dump file created [11475984 bytes in 0.018 secs]
     Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
     at com.princeli.gc.gcdemo.gclog.HeapDumpOnOutOfMemoryError.main(HeapDumpOnOutOfMemoryError.java:39)


     *
     */
}
