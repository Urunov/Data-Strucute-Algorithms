package com.stackimp.pro;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StackSample}
 * @Date: {2022/03/09 && 7:39 PM}
 */
public class Stack {
    //
    static final int MAX = 1000;
    int top;
    int [] massive = new int[MAX]; // maximum size of stack

    boolean isEmpty(){
        return (top<0);
    }

    public Stack() {
        top = -1;
    }

    boolean push (int x){

        if (top>=(MAX-1)){
            System.out.println("Stack over flow");
            return false;
        }else{
            massive[++top] = x;
            System.out.println(x + "  " + "pushed into stack ");
            return true;
        }
    }

    int pop(){
        if (top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = massive[top--];
            return x;
        }
    }

    int peek(){
        if (top<0){
            System.out.println("Stack underflow");
            return 0;
        } else{
            int x = massive[top];
            return x;
        }
    }
}
