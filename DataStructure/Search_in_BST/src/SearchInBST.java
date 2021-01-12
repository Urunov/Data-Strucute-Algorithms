
public class SearchInBST {

    // BST node that node class
    class Node{
        int value;
        Node left, right;

        public Node(int data){
            value = data;
            left = right = null;
        }
    }

    // BST root node
    Node root;

    // Constructor for BST => initial empty tree
    public SearchInBST() {
        root = null;
    }

    // delete a node from BST
    void deleteValue(int value){
        root = delete_Recursive(root, value);
    }

    // Function for Delete
    Node delete_Recursive(Node root, int value)
    {
        // tree is empty
        if(root==null)
            return root;

        // traverse the tree
        if(value < root.value){
            // left subtree
            root.left = delete_Recursive(root.left, value);
        } else if (value> root.value){
            // right subtree
            root.right = delete_Recursive(root.right, value);
        } else {
            // node contains only one child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            /**
             * node has tow children
             * get inorder successor (min value, in the right subtree)
             * */
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = delete_Recursive(root.right, root.value);
        }
        return root;
    }

    int minValue(Node root)
    {
        // initially minVal = root
        int minval = root.value;
        // find minval
        while(root.left!=null){
            minval = root.left.value;
            root = root.left;
        }
        return minval;
    }

    // insert a node in Searchin BST
    void insert(int value){
        root = insert_Recursive(root, value);
    }
    // recursive insert function
    Node insert_Recursive(Node root, int value)
    {
        // tree is empty
        if(root == null) {
            root = new Node(value);
            return root;
        }

        // traverse the tree
        if (value < root.value) {
            // insert in the left subtree
            root.left = insert_Recursive(root.left, value);
        } else if(value > root.value) // insert in the right subtree
            root.right = insert_Recursive(root.right, value);
        return root;
    }

    // method for inorder traversal of BST
    void inorder(){
        inorder_Recursive(root);
    }

    void inorder_Recursive(Node root){
        if (root!=null){
            inorder_Recursive(root.left);
            System.out.print(root.value + " ");
            inorder_Recursive(root.right);
        }
    }

    boolean search(int value){
        root = search_Recursive(root, value);
        if(root!=null){
            return true;
        } else
            return false;

    }

    // recursicve function search
    Node search_Recursive(Node root, int value)
    {
        // Base Cases: root is null or key is present at root
        if(root == null || root.value == value){
            return root;
        }
        // value is greater that root's value
        if(root.value > value){
            return search_Recursive(root.left, value);
        }
        return search_Recursive(root.right, value);
    }

    public static void main(String []args){

        // create BST object
        /****
         *               45
         *            /     \
         *           10      90
         *          /  \    /
         *         7   12  50
         * */
        SearchInBST searchInBST = new SearchInBST();
        searchInBST.insert(45);
        searchInBST.insert(10);
        searchInBST.insert(7);
        searchInBST.insert(12);
        searchInBST.insert(90);
        searchInBST.insert(59);
        System.out.println("The BST  Create with input data (Left-root-right");
        searchInBST.inorder();

        // delete leaf node
        System.out.println("Delete 12 node");
        searchInBST.deleteValue(12);
        searchInBST.inorder();
        //delete the node with one child
        System.out.println(" delete 90 (node with 1 child ");
        searchInBST.deleteValue(90);
        searchInBST.inorder();

        // search a key

        System.out.println("\n value 10 : " + searchInBST.search(10));
        System.out.println(" value : 8 " + searchInBST.search(8));
    }
}
