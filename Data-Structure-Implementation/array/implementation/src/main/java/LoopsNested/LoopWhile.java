package LoopsNested;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 9:37 PM}
 */
public class LoopWhile {
    public static void main(String[] args) {
        //
        int leftNumber = 85;
        int rightNumber =100;


        while(++leftNumber < --rightNumber); // no body

        System.out.println("Midpoint = " + leftNumber);
    }
}
