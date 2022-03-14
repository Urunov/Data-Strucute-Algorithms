package com.existing.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/09 && 10:20 PM}
 */
public class QueueLinkedExample {
    public static void main(String[] args) {
        //
        Queue<String> queue = new LinkedList<>();

        queue.add("one");
        queue.add("2");
        queue.add("three");
        queue.add("4");
        System.out.println(queue);

        String element = queue.poll();
        String element1 = queue.peek();

        System.out.println("Poll: " + element);
        System.out.println("Peek: " + element1);

    }
}
