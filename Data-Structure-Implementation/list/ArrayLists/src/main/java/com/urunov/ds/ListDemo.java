package com.urunov.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ListArrayList}
 * @Date: {2022/03/07 && 7:27 PM}
 */
public class ListDemo {
    public static void main(String[] args) {

        /*
     int [] mas = new int [4];

       massiv = [1, 2, 66, 5, 4]  razmer = 4
       index = 0, 1, 2, 3
        * */

        /***
         * Data Structure
         * -------------
         * Collection Framework
         *
         * Array,
         * List,
         * ArrayList
         * LinkedList (Singly, Doubly + Circle )
         *  Set
         *  Hash
         *  Queue
         *  DeQueue,
         *  Iterator - iteratsiya
         *
         * Kolleksiya framework
         *
         * */


        ArrayList listGermany = new ArrayList();
        // lyuboy tip i razmer mojno ispolzovat.
        listGermany.add("Madina");
        listGermany.add("Tiner");
        listGermany.add(290);
        listGermany.add(43.5);
        listGermany.add(83838f);
        listGermany.add('F');

        System.out.println("Guru:  " + listGermany);

        listGermany.add(1, "Mahmud");
        listGermany.add(5, "Diana");
        System.out.println("Guru list: " + listGermany);

        System.out.println("List Germany by index: " + listGermany.get(7));
        listGermany.set(4, "Berlin");

        System.out.println("List Germany with capital: " + listGermany);

        if (listGermany.contains("Berlin")){
            System.out.println("Yes na spiska: ");
        } else
        {
            System.out.println("Net informatsiya");
        }

        listGermany.remove(3);
        listGermany.remove("Tiner");
        System.out.println("posle udaleniya; " + listGermany);

        //listGermany.clear(); //
       // System.out.println("Udalit " + listGermany);

        System.out.println("--- Iterating with Iterator ----- ");

        ArrayList<String> turkishArqadash = new ArrayList<String>();
        turkishArqadash.add("Ankara");
        turkishArqadash.add("Istanbul");
        turkishArqadash.add("Margne");
        turkishArqadash.add("Kuru");

        Iterator <String > iterator = turkishArqadash.iterator();


        System.out.println(iterator.next()); // similar get
        System.out.println(turkishArqadash.get(1));

        System.out.println("-------------------------");

        System.out.println("Iterating with while Iteration ");
        System.out.println("------------------------");


        while (iterator.hasNext()){
            // hasNext() --> null
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println("------------------------");
    }
}