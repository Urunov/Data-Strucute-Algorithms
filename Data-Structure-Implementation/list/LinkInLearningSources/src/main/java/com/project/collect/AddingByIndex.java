package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:24 PM}
 */
public class AddingByIndex {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("how");
        list.add("are");
        list.add("?");
        list.add("to");
        list.add("Office");
        System.out.println("  > "+ list);
        list.add(2, "you");
        list.add(4, "welcome");
        System.out.println(" " + list);

        //list.clear();
    }
}
