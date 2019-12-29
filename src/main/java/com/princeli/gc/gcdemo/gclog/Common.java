package com.princeli.gc.gcdemo.gclog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : princeli
 * @version 1.0
 * @className Common
 * @date 2019/12/21 11:08 下午
 * @description: TODO
 */
public class Common {
    public static Map<Integer, byte[]> map = new HashMap<>();

    public static void gcTest(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                map.put(i, new byte[1 * 1024 * 1024]);
            }
            map.clear();
        }
        map.clear();
    }
}
