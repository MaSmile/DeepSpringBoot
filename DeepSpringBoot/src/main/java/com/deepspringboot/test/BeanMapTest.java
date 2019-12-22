package com.deepspringboot.test;

import com.deepspringboot.beans.Person;
import com.deepspringboot.utils.BeanMapUtils;

import java.util.HashMap;
import java.util.Map;

public class BeanMapTest {
    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        Person person1 = new Person();
        person1.setAge(1);
        person1.setName("张无忌");
        person1.setAge(35);
        map = BeanMapUtils.objectToMap(person1);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
        Person person2 = new Person();
        person2 = (Person) BeanMapUtils.mapToBean(map, person2.getClass());
        System.out.println(person2);
    }
}
