package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:53 PM}
 */
public class SetLinkedList {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("pineApple");

        System.out.println(" LinkedList: " + list);
        System.out.println(" object that is replace is " + list.set(2, "kiwi"));
        System.out.println(" object that is replace is " + list.set(3, "Orange"));
        System.out.println(" The new LinkedList is: " + list);

    }
}
