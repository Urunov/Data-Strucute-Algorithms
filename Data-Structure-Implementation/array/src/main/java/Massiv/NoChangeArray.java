package Massiv;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 10:12 PM}
 */
public class NoChangeArray {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x: nums){
            System.out.print( x + " ");
            x*=10; // no effect no nums
        }

        System.out.println();

        for (int x: nums){
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
