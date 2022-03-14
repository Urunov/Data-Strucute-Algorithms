package com.collection.singlyList;


import java.util.Iterator;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {LinkedListSingly}
 * @Date: {2022/03/14 && 7:26 PM}
 */
public class LinkedListSingly<E> implements LinkedMethods<E> {
  //
    private int size;
    private Node head;
    private Node tail;


    public LinkedListSingly() {
        //
        this.clear();
    }

    @Override
    public String toString() {
        //
        StringBuilder builder = new StringBuilder();
        builder.append("head: ").append(head);
        builder.append(" ,size: ").append(size);
        builder.append(", tail").append(tail);

        return builder.toString();
    }

    private class Node{
        //
        private E element;
        private Node next;

        public Node(E element) {
            this.element = element;
        }

        public String toString(){
            //
            StringBuilder builder = new StringBuilder();

            builder.append("Element: ").append(element);
            builder.append(", next").append((getNext()==null )? "null": getNext().getElement());

            return builder.toString();
        }

        public boolean isTail(){
            //
            if (next == null){
                return true;
            }
            return false;
        }


        public Node getNext(){
            return next;
        }

        public E getElement(){
            return element;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        //
        if(size == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        //
        boolean found = false;
        Node targetNode = head;

        while (targetNode != null){
            if (targetNode.getElement().equals(object)){
                found = true;
                break;
            }
            targetNode = targetNode.getNext();
        }
        return found;
    }


    public void addFirst(E element){
      //
      Node newNode = new Node(element);
      newNode.setNext(head);
      head = newNode;

      size++;
      if(head.isTail()){
          tail=head;
      }
    }

    public void addLast(E element){
        //
        if(size==0){
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        newNode.setNext(newNode);
        tail = newNode;
        size++;
    }


    @Override
    public MyIterator iterator() {
        return null;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public void add(int index, E element) {
        if (index !=size){
            checkArrayIndex(index);
        }

        if (index==0){
            addFirst(element);
        } else if (index==size){
            addLast(element);
        }else {
            Node previousNode = getNode(index -1);
            Node nextNode = previousNode.getNext();
            Node newNode = new Node(element);
            previousNode.setNext(newNode);
            newNode.setNext(nextNode);
            size++;
        }
    }

    private void checkArrayIndex(int index){
        //
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("index"+index);
        }
    }

    @Override
    public E get(int index) {
        //
        checkArrayIndex(index);

        Node targetNode = head;
        for (int i=0; i<index; i++){
            targetNode = targetNode.getNext();
        }

        return targetNode.getElement();
    }

    @Override
    public void remove(Object object) {
        //
        Node targetNode = head;
        boolean found = false;

        int index = 0;
        while (targetNode !=null){
            if(targetNode.getElement().equals(object)){
                found = true;
                break;
            }
            targetNode = targetNode.getNext();
            index++;
        }
    }

    @Override
    public void remove(int index) {
        //
        checkArrayIndex(index);

        if(index==0){
            removeFirst();
            return;
        }
    }

    @Override
    public void addAll(LinkedMethods collection) {
        //
        Iterator<E> iterator = (Iterator<E>) collection.iterator();
        while (iterator.hasNext()){
            E newElement = iterator.next();
            if(size==0){
                addFirst(newElement);
            } else{
                addLast(newElement);
            }
        }
    }

    @Override
    public void clear() {
        //
        size =0;
        head = null;
        tail = null;
    }

    @Override
    public Object[] toArray(Object[] some) {
        return new Object[0];
    }

    private Node getNode(int index){
        //
        this.checkArrayIndex(index);

        Node targetNode = head;
        for (int i=0; i<index; i++){
            targetNode = targetNode.getNext();

        }
        return targetNode;
    }


    public E removeFirst(){
        //
        if (size==0){
            return null;
        }

        Node removeNode = head;
        head = head.getNext();
        size--;

        if (size==0){
            clear();
        }

        return removeNode.getElement();
    }
}
