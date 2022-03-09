package com.urunov.ds;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ListArrayList}
 * @Date: {2022/03/08 && 5:57 PM}
 */
public class IteratorDemo {
    public static void main(String[] args) {

        // 1. List: list1 can only store String Object
        ArrayList<String> list1 = new ArrayList<String>();
        // 1. Add Data in List
        list1.add("John"); // 0 - index
        list1.add("Jennies");
        list1.add("Jim");
        list1.add("Jack");
        list1.add("John");
        list1.add("Joe"); // 5 - index

        for (String ads: list1){
            System.out.print(" " + ads); // index, value
        }

        System.out.println();
        System.out.println("-----------------");

        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()){
            // hasNext() --> null
            String str = iterator.next();
            System.out.print(" " +str);
        }
        System.out.println();
        System.out.println("------------------------");


        ArrayList <String> universal = new ArrayList<>();

        Student student = new Student();
        student.name = "Putin";
        student.role = 7;

       // universal.add(student);
        universal.add("Chehov");
        universal.add("Pushkin");
        universal.add("Lamanasov");
        universal.add("Lermatov");
        universal.add("Durov");

        Iterator<String> univ = universal.iterator();
        while (univ.hasNext()){
            System.out.print("  " + univ.next());
        }

    }
}
