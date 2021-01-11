
/**
 * Leetcode (96)
 * Given n, how many structurally unique BST’s (binary search trees) that store values 1 … n?
 *
 * ---------------------------------------------
 * |
 * Input: 3
 * Output: 5
 * Explanation:
 * Given n = 3, there are a total of 5 unique BST's:
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 *Lets first consider 1 as root, as 2 and 3 are greater than 1, it will be added to the right sub tree. The right subtree have 2 elements and we already know how many unique BST’s we can form if n = 2, we can use that value to compute for n=3. So basically we are going to solve the problem using dynamic programming
 *       1
 *     /   \
 *   {0} {2, 3}
 *  T[0] * T[2]
 * Now consider 2 as root, 1 will go to the left sub tree as it is smaller and 3 will go to the right sub tree
 *       2
 *     /   \
 *   {1}   {3}
 *  T[1] * T[1]
 * Now consider 3 as root, 2, and 1 will be added to the left sub tree as it is smaller than 3.
 *      3
 *    /   \
 * {1, 2}  {0}
 *  T[2] * T[0]
 * T[3] = T[0] * T[2] + T[1] * T[1] + T[2] * T[0]
 * */


public class BTS_Number {

    public static void main(String[]args)
    {
        int n=19;

        int[] Tr = new int[n+1];

        Tr[0] = 1;
        Tr[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=0; j<=i-1; j++){
                Tr[i]+= Tr[j] * Tr[i- j -1];
            }
        }
        System.out.println(Tr[n]);
    }
}
