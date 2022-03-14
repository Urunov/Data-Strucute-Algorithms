package com.collection.singlyList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LinkedListSingly}
 * @Date: {2022/03/14 && 8:00 PM}
 */
public interface LinkedMethods<E> {

    int size();
    boolean isEmpty();
    boolean contains(Object object);
    MyIterator<E> iterator();
    void add(E element);
    void add(int index, E element);
    E get(int index);
    void remove(Object object);
    void remove(int index);
    void addAll(LinkedMethods<? extends E> collection);
    void clear();
    <T> T[] toArray(T[] some);
}
