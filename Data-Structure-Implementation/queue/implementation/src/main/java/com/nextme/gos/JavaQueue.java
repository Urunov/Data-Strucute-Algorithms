package com.nextme.gos;

import java.util.PriorityQueue;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/07 && 9:37 PM}
 */
public class JavaQueue {
    public static void main(String[] args) {
        //
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i=10; i>0; i--){
            queue.add(i);
        }
        // Queue:  (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        /*** PriorityQueue sorts the data for us
         *   (Front) 1 2 3 4 5 6 7 8 9 10 (Rear) | Sorted Queue
         */
        /** Peaking --> Obtaining the head of Queue
         Polling --> Remove the head of Queue
         **/

        System.out.println("Queue size is : " + queue.size());
        System.out.println("Head of Queue is (peek) : " + queue.peek()); // head of queue : 1

        queue.poll(); // Removing the head 1
        System.out.println("Queue size after (poll)  : " + queue.size());

        System.out.println("Head of Queue is : " + queue.peek()); // New head of Queue : 2


    }
}
