import static java.lang.System.exit;

public class Stack_LinkList {

    private class Node {

        int data; // integer data
        Node link;
    }

    // create global top reference variable global
    Node top; // top element declaration

    // constructor
    public Stack_LinkList() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(int value) {

        // create new node temp and allocate memory
        Node temp = new Node();

        /**
         *  Check if stack (heap) is full. Then inserting an element would lead to stack overflow.
         * */

        if (temp == null) {
            System.out.println("\n Heap overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = value;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;

    }


    // Utility function to check if the stack is empty or not

    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack

    public int peek() {

        // check for empty stack
        if (isEmpty()) {
            return top.data;
        } else {
            System.out.print("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() {
        // check for stack underflow
        if (top == null) {
            System.out.print("\n Stack Underflow");
            return;
        }

        // update the top pointer to point to the next node;
        top = (top).link;
    }

    public void display() {

        // check for stack underflow
        if (top == null) {
            System.out.print("\n Stack underflow");
            exit(1);
        } else {
            Node temp = top;

            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }

}

