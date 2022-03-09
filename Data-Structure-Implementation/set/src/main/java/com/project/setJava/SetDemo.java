package com.project.setJava;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {SetJava}
 * @Date: {2022/03/08 && 1:07 AM}
 */
public class SetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        set.add("Hotamboy");
        set.add("Urunov");
        set.add("Isob");
        set.add("Jack");
        set.add("John");
        set.add("Ali");

        // 1. Data is unique, no redundancy
        // 2. Data is unordered in output due to hashing.
        System.out.println("set is "+ set);

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        System.out.println("--------------------");
        set.remove("Isob");
        if (set.contains("Urunov")){
            System.out.println("Yes it is");
        } else{
            System.out.println("NO it is not");
        }
    }
}
