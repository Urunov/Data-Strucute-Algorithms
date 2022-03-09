package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:37 PM}
 */
public class IndexOfLink {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("using");
        list.add("index");
        list.add("of");
        list.add("method");

        System.out.println("LinkedList: " + list);

        System.out.println("The first occurrence of using is at index =" + list.indexOf("using"));
        System.out.println("The first occurrence of using is at index =" + list.indexOf("Method"));
        System.out.println("The first occurrence of using is at index =" + list.indexOf("method"));


    }
}
