package com.princeli.gc.gcdemo.memory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

/**
 * @author : princeli
 * @version 1.0
 * @className PermSize
 * @date 2019/12/29 5:33 下午
 * @description: 设置永久区的初始大小和最大大小（共享内存的非堆区域）
 * -XX:PermSize -XX:MaxPermSize
 * jdk1.8过期
 */
public class PermSize {

    public static void main(String[] args) {
        for(int i=0;i<10000;i++){
            Enhancer enhancer=new Enhancer();
            enhancer.setSuperclass(PermSize.class);
            enhancer.setCallback((InvocationHandler) (o, method, objects) -> method.invoke(o,objects));
            enhancer.create();
        }
    }


    /**
     * -XX:PermSize=2M -XX:MaxPermSize=2M
     Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=2M; support was removed in 8.0
     Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=2M; support was removed in 8.0
     *
     */
}
