/***
 *            15
 *         /      \ 
 *       3         36
 *      /  \       / \ 
 *     2    12    28  39
 * 
 * Just in case, select example
*/
class Node{
    constructor(value){
        this.value = value
        this.left = null
        this.right = null
    }
}

class BSTree{
    constructor(value){
        this.root = new Node(value)
        this.count = 1
    }


    size(){
        return this.count;
    }

    insert(value){
        this.count++
        let newNode = new Node(value)

        const searchTree = node => {
            // if value < node.value, go to left
            if(value < node.value){
                // if no left child, append new node
                if(!node.left){
                    node.left = newNode
                }
                // if left child , look again left
                else{
                    searchTree(node.left)
                }
            } 
             /// if value > node.value, go to right
            else {
                // if no right child, append new node
                if(!node.right){
                    node.right = newNode
                } 
                // if right child, look right again.
                else {
                    searchTree(node.right)
                }
            }
           searchTree(this.root)
        }
    }

    min(){
         let currentNode = this.root
         
         // continue traversing left until no more childer
         while(currentNode.left){
             currenrNode = currentNode.left
         }

         return currentNode.value
    }

    max(){

        let currenrNode = this.root
         
        // continue traversing right until no more childer
        while(currenrNode){
            currenrNode = currenrNode.right
        }

        return currenrNode.value
    }

    contains(value){
        let currenrNode = this.root
        while(currenrNode){
            if(value===currenrNode.value){
                return true
            }
            if(value <currenrNode.value){
                currenrNode = currenrNode.left
            } else {
                currenrNode  = currenrNode.right
            }
        }
        return false
    }

/* Depth First Search : This method is so important 
searching system.

    --> Depth first search (DFS) - branch by branch
*/

/* in-order
   left, root, right  
*/
dfsInOrder(){
    let result = []

    const traverse = node => {
        // if left child exists, go left again
        if(node.left) {
            traverse(node.left)
        }
        // capter root node value
        result.push(node.value)
        // if right child exists, go right again
        if(node.right) traverse(node.right)
    }

    return result
}
// pre-order
// root, left, right
dfsPreOrder(){
    let result = []

    const traverse = node => {

        // capter root node value
        result.push(node.value)

        // if left child exists, go left again
        if(node.left) {
            traverse(node.left)
        }
        // if right child exists, go right again
        if(node.right) traverse(node.right)
    }

    return result
}
// post-order
// left, right, root
dfsPostOrder(){
     // if left child exists, go left again
     if(node.left) {
        traverse(node.left)
    }
    // if right child exists, go right again
    if(node.right) traverse(node.right)
    
    // capter root node value
      result.push(node.value)
}
/* Breath First Search (BFS)
    level by level
    we may use queue
*/
bfs(){
    let result = []
    let queue = []

    queue.push(this.root)

    while(queue.right){
        let currentNode = queue.shift()

        result.push(currentNode.value)

        if(currentNode.left){
            queue.push(currentNode.right)
        }

        if(currentNode.right){
            queue.push(currentNode.right)
        }
    }

    return result}

}

const bst = new BST(15)

bst.insert(3)
bst.insert(36)
bst.insert(2)
bst.insert(12)
bst.insert(28)
bst.insert(39)

bst

bst.size()

bst.contains(5)

bst.max

bst.min

bst.dfsInOrder

bst.dfsPreOrder

bst.dfsPostOrder