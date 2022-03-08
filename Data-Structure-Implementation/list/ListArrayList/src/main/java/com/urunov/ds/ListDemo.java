package com.urunov.ds;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ListArrayList}
 * @Date: {2022/03/07 && 7:27 PM}
 */
public class ListDemo {
    public static void main(String[] args) {

        // 1. List: list1 can only store String Object
        ArrayList<String> list1 = new ArrayList<String>();

        // 2. List: list2 can store any type of Object
        ArrayList list2 = new ArrayList<>();

        // 1. Add Data in List
        list1.add("John"); // 0 - index
        list1.add("Jennies");
        list1.add("Jim");
        list1.add("Jack");
        list1.add("John");
        list1.add("Joe"); // 5 - index

          // Methods: add, remove, size, contains, set, indexOf,

        // list1.add(10); // error

        list2.add("Urunov");
        list2.add(100);
        list2.add(2.54);
        list2.add(54.3);

        Student student = new Student();
        student.role = 101;
        student.name ="Mike";

        Student student1 = new Student();
        student1.role = 200;
        student1.name = "Sherzod";

        list2.add(student);
        list2.add(student1);

        // set value to list2
        list1.set(5, "Dudu"); // index, value

        // Print reference to list
        System.out.println("list1 is : " + list1);
        System.out.println("list2 is : " + list2);


        // 2. Get the element from list
        String name = list1.get(2);
        System.out.println("name is : " + name);

        Object obj = list2.get(1);
        System.out.println("object: " + obj);

        // 3. Update Element in List
        list1.add(4, "Hamdamboy");
        list1.add(5, "Urunov");
        list1.add(6, "Anna");
        System.out.println("list1 now is : " + list1);

        // 4. Remove Element from List
        list1.remove(2);
        System.out.println("list1 after remove is : " + list1);

        System.out.println("------------------");
        ArrayList test = new ArrayList();
        test = list2;
        System.out.println(" Test before: " + test);
        test.clear();

        System.out.println(" Test after:  " + test);
        // list.clear()--> remove all
        System.out.println("------------------");


        // Find element
        if (list1.contains("Sherzod")){
            System.out.println("Urunov is in the list");
        } else {
            System.out.println("Sorry could not find.");
        }

        // 5. Iterator in ArrayList
        System.out.println("-- Iterating with Enhanced for loop ----");
        for (String str: list1){
            System.out.println(str);
        }

        System.out.println("------------------------");

        System.out.println("--- Iterating with Enhanced for Loop --- ");
        for (int i=0; i<list1.size(); i++){
            // array.length --> arraylist.size

            System.out.println(list1.get(i));
        }

        list1.add(6, "Kuku");


        System.out.println("--- Iterating with Iterator ----- ");
        Iterator<String> iterator = list1.iterator();
        System.out.println(iterator.next()); // similar get
        System.out.println(iterator.next());

        System.out.println("-------------------------");

        System.out.println("Iterating with while Iteration ");


        while (iterator.hasNext()){
            // hasNext() --> null
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("------------------------");
    }


}
