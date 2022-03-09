package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:51 PM}
 */
public class RemoveLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("pineApple");
        System.out.println("LinkedList:   " + list);
        list.remove();
        System.out.println("Final list " + list);
    }
}
