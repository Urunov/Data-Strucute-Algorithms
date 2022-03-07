/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {StackSample}
 * @Date: {2022/02/10 && 12:22 AM}
 */
public class TestStack {
    public static void main(String[] args) {
        StackSample mystack = new StackSample();
        StackSample mystack1 = new StackSample();

        // push some numbers onto the stack
        for (int i=0; i<10; i++){
            mystack.push(i);
        }
        for (int k=0; k<20; k++)
            mystack1.push(k);

        // pop those numbers off the stack
        System.out.println("Stack in mystack: ");
        for (int i=0; i<10; i++)
            System.out.println(mystack.pop());

        System.out.println("Stack in mystack1");
        for (int i=0; i<10; i++){
            System.out.println(mystack1.pop());
        }
    }
}
