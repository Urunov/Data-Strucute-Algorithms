## Data-Strucute: Collection Framework


 * Java List is an interface that extends the Collection and contains ordered collection of elements including duplicaite values.
   List support redundancy.
 
 ------------ 1. ArrayList---------
 * ArrayList is the implementation of List interface where the elements can be dynamically added or remove from the list.
  
  ```
       ArrayList arr = new ArrayList()
  ```
 * The size of the list is increased dynamically if the elements are added more than the initial size.

-------------2. LinkedList ------------
 * Linked List is a sequence of links which contains items.
 * Each link contains a connection to another link
    
  ```
       LinkedList object = new LinkedList()
  ```
LinkedList contains 2 types. 
   1. Singly Linked List. 
Each node in this list stores the data of the node and a pointer or reference to the next node in the list.

![Screen Shot 2022-03-07 at 7 14 45 PM](https://user-images.githubusercontent.com/11626327/157036155-f10f1699-e8cb-4e90-8886-c41a9084b6c2.png)

   3. Double Linked List
Doubly Linked List has 2 references: 1 to the next node and another to previous node.

![Screen Shot 2022-03-07 at 7 15 00 PM](https://user-images.githubusercontent.com/11626327/157036167-20b1d568-58ca-4f72-b2e0-b14d1b0913e8.png)

-------------3. Vector  ------------
 * Vectors are similar to arrays, where the elements of the vector object can be accessed via an index into the vector.
 * Vector implements a dynamic array and is not limited to a specific size and is synchronized.
     
----------- Queue --------------------

* Queue is Java follows a FIFO approach i.e. it orders the elements in First In First Out manner.

  ```
       Queue<Integer> ocherd = new LinkedList<>();
  ```
 ![Screen Shot 2022-03-07 at 9 41 51 PM](https://user-images.githubusercontent.com/11626327/157037155-759f87e2-7cea-4994-8243-68c909d293de.png)
 
 
 ```
 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i=10; i>0; i--){
            queue.add(i);
        }
        // Queue:  (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        /*** PriorityQueue sorts the data for us
         *   (Front) 1 2 3 4 5 6 7 8 9 10 (Rear) | Sorted Queue
         */
        /** Peaking --> Obtaining the head of Queue
         Polling --> Remove the head of Queue
         **/

        System.out.println("Queue size is : " + queue.size());
        System.out.println("Head of Queue is (peek) : " + queue.peek()); // head of queue : 1

        queue.poll(); // Removing the head 1
        System.out.println("Queue size after (poll)  : " + queue.size());

        System.out.println("Head of Queue is : " + queue.peek()); // New head of Queue : 2


    }
 ```
 
 -------- Set ----------------------
 
 
 * A set refers to collection that cannot cantain duplicaiton elements 
 * It is mainly used to model the mathematical set abstraction 
 
 Set consists of 3 main elements: 
   - HashSet
        - Java hashset class creates a collection that use a hash table for storage.
        - Hashset only contain unique elements and it inherits the AbstractSet classs and implements Set interface.
        - It uses a mechanism hashing to store the elements.
   - LinkedHashSet
        - Java LinkedHashSet class is a hash table and Linked list implementation of the set interface.
        - It contains only unique elements
        - It provides all optional set operations and maintains insertion order
        - LinkedHashSet<String> al = new LinkedHashSet();
        - The class inherits methods from other classes.
        - HashSet, AbstractSet, AbstractCollection, Object, Set
   - TreeSet
        - TreeSet class implements the Set interface that uses a tree for storage.
        - The objects of this classs are unique and are stored in the ascending order
        - It inherits AbstactSet class and implements NavigableSet interface
 
 
 
