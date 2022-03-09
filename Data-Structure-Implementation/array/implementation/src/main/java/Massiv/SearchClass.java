package Massiv;

/**
 * @Company: {Nextree}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 10:25 PM}
 */
public class SearchClass {
    public static void main(String[] args) {
        //
        int nums[] = {4, 2, 1, 43, 23, 66,56, -43, 5, 34, -66};
        int val = 2;
        boolean found = false;

        // use for-each style to search nums for val
        for (int x: nums){
            if (x==val){
                found = true;
                System.out.println(found);
                break;
            }
        }
        if (found != true)
            System.out.println("Value could not find");
        }
    }

