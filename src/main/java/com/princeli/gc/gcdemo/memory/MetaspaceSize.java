package com.princeli.gc.gcdemo.memory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

/**
 * @author : princeli
 * @version 1.0
 * @className MetaspaceSizeMaxMetaspaceSize
 * @date 2019/12/29 7:11 下午
 * @description: 设置元空间的初始大小和最大大小（共享内存的非堆区域，JDK1.8新增）
 *
 *
 */
public class MetaspaceSize {

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(PermSize.class);
            enhancer.setCallback((InvocationHandler) (o, method, objects) -> method.invoke(o,objects));
            enhancer.create();
        }
    }
}
