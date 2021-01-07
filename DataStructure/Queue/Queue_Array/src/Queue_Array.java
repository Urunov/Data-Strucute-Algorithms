

public class Queue_Array {

    int n = 6;
    int[] queue = new int[n];
    int front=-1;
    int rear = -1;

    public void enqueue(int value)
    {
        if(rear == n-1){
            System.out.println("Overflow, already full");
        } else if(front==-1 && rear==-1){ // no any data yet
            front=rear=0;
            queue[rear]=value;
        } else {
            rear++;
            queue[rear]=value;
        }
    }

    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Empty queue now. ");
        } else if(rear==front){
            front=rear=-1;
        } else{
            // when delete element
            System.out.println("delete element: " + queue[front]);
            front++;
        }
    }

    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
        } else {
            for(int i=front; i<rear+1; i++) {
                System.out.println("in queue = " + queue[i]);
            }
        }
    }

    public void peek(){

        if(front==-1 && rear==-1){
            System.out.println("Queue is empty now");
        } else {
            System.out.println(queue[front]);
        }
    }
    public static void main(String[]args){
        /** Queue is relying First Input First Out rule and
         *  we should represent enqueue and dequeue

         ----------------- Before --
         |  |  |  |  |  |  |
         _________________


         ----------------- After --
         | 3 | 2 | 3 | 0 | 333
         -----------------

         1. Enqueue -- insert the data to queue. Only use rear
         2. Dequeue -- delete the data to queue. Only use front
         3. Display -- represent all queue elements
         4. Peek  --   last insert element in the queue (using front var.)
         5. isFull --  total elements are equal to number of array/list elements
         6. isEmpty -- no any value of elements in queue


         */

        Queue_Array queue_array = new Queue_Array();
        queue_array.enqueue(3);//
        queue_array.enqueue(4);
        queue_array.enqueue(6);

        queue_array.dequeue();
        queue_array.display();
        queue_array.peek();
    }
}
