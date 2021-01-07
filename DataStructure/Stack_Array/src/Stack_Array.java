/**
 * User: hamdamboy
 * Project: Stack_Array
 * Github: @urunov
 */
public class Stack_Array {

    int top; // top element of stack -1 (starting)
    int capacity; // declare size of stack
    int[] stack; // declare array

    public Stack_Array() // default constructor
    {
        top = -1;
        capacity = 10;
        stack = new int[capacity];
    }

    // Implementation of Stack operations;

    public boolean isEmpty() {
        return top == -1; // == compare and return false / true
    }

    public boolean isFull() {
        return top == capacity - 1; // maximum value of capacity
    }

    public int push(int data) {
        if (isFull()) {
            System.out.println("Stack is already Full");
        }
        return stack[++top] = data;
    }

    public int pop() // remove the element from stack
    {
        if (isEmpty()) {
            System.out.println("Stack is already Empty");
        }
        return stack[top--];
    }

    public int peek() // just returntop element from stack
    {
        return stack[top];
    }

    public void display()
    {
        System.out.println("Display Elements: ");
        for(int i: stack)
        {
            System.out.println(i);
        }
    }



    public static void main(String[]args){

        Stack_Array stackArrayImplement = new Stack_Array();

        stackArrayImplement.push(4);
        stackArrayImplement.push(5);
        stackArrayImplement.push(44);
        stackArrayImplement.push(0);
        stackArrayImplement.push(484);
        stackArrayImplement.push(34);
        stackArrayImplement.push(6);
        stackArrayImplement.display();

        System.out.println(stackArrayImplement.isEmpty());
        System.out.println(stackArrayImplement.isFull());
        System.out.println(stackArrayImplement.capacity);
        System.out.println(stackArrayImplement.peek());
        System.out.println(stackArrayImplement.pop());
        System.out.println(stackArrayImplement.peek());
    }
}
