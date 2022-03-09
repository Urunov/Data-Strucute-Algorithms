package com.stackimp.pro;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StackSample}
 * @Date: {2022/03/09 && 7:39 PM}
 */
public class Stack {
    //
    static final int MAX = 10;
    int top;
    int [] massive = new int[MAX]; // maximum size of stack

    boolean isEmpty() {
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

    int count(){
       return top+1;
    }

    boolean isFull(){
        return (top>=MAX);
    }

    void display(){
        for (int i=0; i<top; i++){
            System.out.print("Display: " + massive[i]);
        }
    }


}

/**
     push(): When we insert an element in a stack then the operation is known as a push.
             If the stack is full then the overflow condition occurs.
     pop(): When we delete an element from the stack, the operation is known as a pop.
              If the stack is empty means that no element exists in the stack,
              this state is known as an underflow state.
     isEmpty(): It determines whether the stack is empty or not.
     isFull(): It determines whether the stack is full or not.'
     peek(): It returns the element at the given position.
     count(): It returns the total number of elements available in a stack.
     change(): It changes the element at the given position.
     display(): It prints all the elements available in the stack.
 * */