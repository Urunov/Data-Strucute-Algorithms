package LoopsNested;

/**
 * @Company: {Nextree Inc.}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 9:26 PM}
 */
public class NestedLoop {
    //
    public static void main(String[] args){

        int leftNumber, rightNumber;
        int i, k, l; // do not recommend

        for(leftNumber=0; leftNumber<10; leftNumber++){
            for (rightNumber=leftNumber; rightNumber<10; rightNumber++){
                System.out.print(".");
            }
            System.out.println();
        }
//        for (leftNumber=9; leftNumber>0; leftNumber--){
//
//            for(rightNumber=leftNumber; rightNumber>0; rightNumber--){
//                System.out.print(".");
//            }
//            System.out.println();
//        }

    }
}
/**
 *  # Task1:
 *  .
 *  ..
 *  ...
 *  ....
 *
 *  ..........
 *
 *
 *  # Task2:
 *  while(leftNumber<10){
 *
 *  leftNumber ++;
 *
 *  }
 *
 * */
