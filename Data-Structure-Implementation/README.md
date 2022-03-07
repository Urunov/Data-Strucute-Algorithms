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


   3. Double Linked List
Doubly Linked List has 2 references: 1 to the next node and another to previous node.

-------------3. Vector  ------------
 * Vectors are similar to arrays, where the elements of the vector object can be accessed via an index into the vector.
 * Vector implements a dynamic array and is not limited to a specific size and is synchronized.
     
