package com.nextme.gos;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/07 && 10:06 PM}
 */
public class IteratingExample {
    public static void main(String[] args) {
        //
        int size = 5;

        // create object of PriorityBlockingQueue
        PriorityBlockingQueue<String> names = new PriorityBlockingQueue<>(size);

        names.add("Geeks");
        names.add("forGeeks");
        names.add("A");
        names.add("Computer");
        names.add("Portal");

        Iterator iteratorV = names.iterator();

        System.out.println("The names are: ");
        while (iteratorV.hasNext()){
            System.out.println(iteratorV.next());
        }
    }
}
