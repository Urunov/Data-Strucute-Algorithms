package com.urunov.ds;

import java.util.*;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ListArrayList}
 * @Date: {2022/03/12 && 6:07 PM}
 */
public class Doctors {
    public static void main(String[] args) {
        // Array
        // List
        // Array List

        // 1. List - inteface
        List<String> doctorSpisk = new ArrayList<String>();
        doctorSpisk.add("Madina");
        doctorSpisk.add("Gunshtayen");
        doctorSpisk.add("Generh");

        System.out.println(doctorSpisk);
        System.out.println("------------");
        doctorSpisk.add(2,"Tula");
        System.out.println(doctorSpisk);

        // 2. ArrayList
        ArrayList<Integer> age  = new ArrayList<>();
        age.add(34);
        age.add(45);
        age.add(29);
        age.add(56);
        System.out.println(age);

        if (age.contains(45)){ // poisk
            System.out.println("Yes");
        } else{
            System.out.println("no");
        }

        ArrayList address = new ArrayList(); // universalniy tip
        address.add("Germany, Berlin");
        address.add("Welhan Shtayzen");
        address.add(14); // int

        System.out.println(address);

        // ARRAY
        int [] massive = new int[11];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = 2* i + 1;
            System.out.print(" " + massive[i]);

        }
        System.out.println();

        ArrayList<String> listUlitsa = new ArrayList<>();
        listUlitsa.add("Hero");
        listUlitsa.add("Guul");
        listUlitsa.add("A.Navoi");
        listUlitsa.add("Ruzvello");
        listUlitsa.add("H.Abdullayev");
        listUlitsa.add("M.Ulugbek");
        listUlitsa.add("N.Masharipov");

        // ITERATOR --> KAK SIKL tolka peryod
        Iterator<String> iterator = listUlitsa.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());
        /*
        *  next --> (index = 0)
        *  next --> (index = 1)
        *  next --> (index = 2)
        *  next --> (index = 3)
        *
        * */

        while (iterator.hasNext()){ // sikl
            String str = iterator.next(); // sledushiy elemet
            System.out.print("  " + str);
        }

    }
}
