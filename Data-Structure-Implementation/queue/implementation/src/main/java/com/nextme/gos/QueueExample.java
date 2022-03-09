package com.nextme.gos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/09 && 10:20 PM}
 */
public class QueueExample {
    public static void main(String[] args) {
        //
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("2");
        queue.add("three");
        queue.add("4");
        System.out.println(queue);
    }
}
