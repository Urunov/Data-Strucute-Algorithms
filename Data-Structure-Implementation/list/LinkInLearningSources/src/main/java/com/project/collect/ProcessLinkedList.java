package com.project.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:10 PM}
 */
public class ProcessLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("Welcome");
        list.add("Again");

        Collection<String> collection = new ArrayList<>();
        collection.add("to");
        collection.add("The");
        collection.add("Most");
        collection.add("popular");
        collection.add("online");
        collection.add("technology");
        collection.add("training");
        collection.add("Center");

        System.out.println("The LinkedList is " + list);

        list.addAll(1, collection);
        System.out.println("new linked list is  " + list);

    }
}
