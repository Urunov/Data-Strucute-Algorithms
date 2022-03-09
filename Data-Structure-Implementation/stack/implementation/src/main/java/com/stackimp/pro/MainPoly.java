package com.stackimp.pro;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StackSample}
 * @Date: {2022/03/09 && 7:51 PM}
 */
public class MainPoly {
    public static void main(String[] args) {
        //
        Stack stack = new Stack();
        stack.push(10);
        stack.push(29);
        stack.push(33);
        stack.push(101);
        stack.push(-101);

        System.out.println("Total " + stack.count());
        System.out.println("POP: " + stack.pop());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("is peek:"+stack.peek());
        System.out.println("count: " + stack.count());
       // System.out.println("change: " + stack.change());
        stack.display();





    }
}
