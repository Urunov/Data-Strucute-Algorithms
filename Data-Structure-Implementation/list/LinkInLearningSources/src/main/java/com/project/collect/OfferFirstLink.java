package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:41 PM}
 */
public class OfferFirstLink {
    public static void main(String[] args) {
        //
        LinkedList<Comparable> list = new LinkedList<Comparable>();

        list.add("BWM");
        list.add("MERCE");
        list.add("Lada");

        System.out.println("Linked list before insertion using offerLast(): " + list);
        list.offerLast("Jaguar");
        list.offerFirst("Volga");
        System.out.println("LinkedList after insertion using offerLast(): " + list);


    }
}
