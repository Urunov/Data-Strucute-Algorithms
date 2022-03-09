package Massiv;

/**
 * @Company: {Nextree}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 10:32 PM}
 */
public class TypeInferenceInFor {
    public static void main(String[] args) {

        // Use type inference with the loop control variable.
        System.out.print("Values of x: ");
        for (var x =2.5; x< 100.0; x =x * 2)
            System.out.println(x + " ");

        System.out.println();

        // use type inference with the iteration variable.
        int[] nums = {1, 3, 4, 5, 6, 23};
        int k=0;
        System.out.print("Values in nums array: ");
        for (var v: nums)
            System.out.println(v + " " + nums[k]);
            k++;


        System.out.println();
    }
}
