package com.implementation.fromMe;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaQueueDemo}
 * @Date: {2022/03/10 && 9:59 PM}
 */
public interface QueueInterface<E> {
    //
    boolean add(E e);
    E peek();
    E element();
    E remove();
    E poll();
    boolean offer(E e);
    int size();

}
