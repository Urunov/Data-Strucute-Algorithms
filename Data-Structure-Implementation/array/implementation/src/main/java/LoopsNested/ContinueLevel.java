package LoopsNested;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 11:38 PM}
 */
public class ContinueLevel {
    //
    public static void main(String[] args) {


        outer: for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                if (j>i){

                    System.out.println();
                    continue outer; //
                }
                System.out.print("  " + (i * j));
            }
        }
        System.out.println();

    }
}
