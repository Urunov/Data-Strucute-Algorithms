/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StackSample}
 * @Date: {2022/02/10 && 12:16 AM}
 */
public class StackSample {
    //
    int stackCollection[] = new int[10];
    int tos;

    // Initialize top-of-stack
    StackSample(){
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item){
        if (tos == 9){
            System.out.println("Stack is full.");
        } else{
            stackCollection[++tos] = item;
        }
    }

    // Pop an item from the stack
    int pop() {
        if (tos<0){
            System.out.println("Stack underflow");
            return 0;
        } else
            return stackCollection[tos--];
    }

}
