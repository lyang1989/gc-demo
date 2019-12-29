package com.princeli.gc.gcdemo.controller;

import com.princeli.gc.gcdemo.domain.Person;
import com.princeli.gc.gcdemo.utils.MetaspaceUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : princeli
 * @version 1.0
 * @className JvmController
 * @date 2019/12/21 7:09 下午
 * @description: TODO
 */
@RestController
public class JvmController {
    List<Person> list1=new ArrayList<Person>();
    @GetMapping("/heap")
    public String heap() throws Exception{
        while(true){
            list1.add(new Person());
//            Thread.sleep(1);
        }
    }

    List<Class<?>> list2=new ArrayList<Class<?>>();
    @GetMapping("/nonheap")
    public String nonheap() throws Exception{
        while(true){
            list2.addAll(MetaspaceUtil.createClasses());
            Thread.sleep(5);
        }
    }
}
