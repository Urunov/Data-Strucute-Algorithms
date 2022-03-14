package com.existing.command;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/07 && 9:54 PM}
 */
public class JustQueue {
    public static void main(String[] args) {
        Queue<String> just = new PriorityQueue<>();

        just.add("Urunov");
        just.add("Kuku");
        just.add("Sadullyevich");

        System.out.println(just);
        System.out.println(" razmer : " + just.size());
        just.clear();
        System.out.println("Posle clear:  " + just);
    }
}
