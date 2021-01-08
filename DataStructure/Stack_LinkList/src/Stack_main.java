
public class Stack_main {

    public static void main(String[]args){

        Stack_LinkList stack_linkList = new Stack_LinkList();

        stack_linkList.push(2);
        stack_linkList.push(4);
        stack_linkList.push(5);

        // print Stack element
        stack_linkList.display();

        // print Top element of stack
        System.out.printf("\n Top element is %d\n", stack_linkList.peek());

        // Delete top element of stack
        stack_linkList.pop();
        stack_linkList.pop();

        // print again Stack element;
        stack_linkList.display();

        // print Top element of Stack
        System.out.printf("\n Top element is %d\n", stack_linkList.peek());
    }
}
/***
 *
 *  Implementing Stack with LinkedList"
 *  push (2)
 *  push (4)
 *  push (5)
 *
 *  display();
 *  peek();  // top most element in the stack without removing.
 *  pop(); // top most element in the stack with removing.
 *  display();
 *
 * */


