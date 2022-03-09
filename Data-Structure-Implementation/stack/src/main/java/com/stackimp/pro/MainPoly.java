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

        System.out.println(stack.pop() + " Popped from stack ");
    }
}
