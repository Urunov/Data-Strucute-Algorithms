package com.project.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 7:49 PM}
 */
public class AddLinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Welcome");
        linkedList.add("to");
        linkedList.add("Uzbekistan");
        linkedList.add("from ");
        linkedList.add("Russia");

        System.out.print(" Linked list elements : " + linkedList);

        Collection<String> collection = new ArrayList<String>();

        collection.add("Anna");
        collection.add("please");
        collection.add("come");
        collection.add("to");
        collection.add("me");

        linkedList.addAll(collection);
        System.out.println();
        System.out.println("LinkedList before appending colleciton is: " + collection);
        System.out.println("LinkedList after appeding colleciton is: " + linkedList);
    }
}
