package com.project.collect;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:58 PM}
 */
public class LinkedListToArray {
    public static void main(String[] args) {

        List<String> courseList = new LinkedList<>();
        courseList.add("Java");
        courseList.add("Phyton");
        courseList.add("DevOps");
        courseList.add("Hadoop");
        courseList.add("AWS");

        System.out.println("LinkedList  " + courseList);
        int size = courseList.size();
        System.out.println("Size of linked list =  " + size);
        String[] numbers = new String[size];

        numbers = courseList.toArray(numbers);
        System.out.println("Elements of array are : ");
        System.out.println(Arrays.toString(numbers));
    }
}
