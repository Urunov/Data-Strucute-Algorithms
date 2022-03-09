package com.project.collect;

import java.util.LinkedList;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:55 PM}
 */
public class ArrayToLinkedList {
    public static void main(String[] args) {

        String[] cources = {"java", "php", "hadoop", "devOps", "phyton"};
        List<String> coursesList = new LinkedList<>();

        for (String s: cources){
            coursesList.add(s);
        }
        System.out.println("The array of courses: " + coursesList);
    }
}
