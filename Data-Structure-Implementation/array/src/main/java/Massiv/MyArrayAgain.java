package Massiv;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/10 && 7:52 PM}
 */
public class MyArrayAgain {
    //
    public static void main(String[] args) {

        int massiv1 [] = new int[100];

        // step-1. Fixed element
        massiv1[0] = 8;
        massiv1[1] = 18;
        massiv1[2] = 10;
        massiv1[3] = 3;
        massiv1[4] = 2;
        massiv1[5] = 100;
        massiv1[6] = 36;
        massiv1[20] = 90;
        massiv1[50] = 63;

        int minRasxod = massiv1[0];
        int maxRasxod = massiv1[0];
        for (int index =1; index<=5; index++){

            if (minRasxod > massiv1[index]){
                minRasxod = massiv1[index];
            }

            if (maxRasxod < massiv1[index]){
                maxRasxod = massiv1[index];
            }
        }

        System.out.println(" Min Rasxod " + minRasxod);

        System.out.println(" Max Rasxod " + maxRasxod);

            /****
             *  Sartirovka.....
             *  Sort Array .
             *
             *
             * */

        for (int index=0; index<=50; index++){
            System.out.print(" " + massiv1[index]);
        }
        System.out.println();
        System.out.println("----------------------");

        String mstring [] = new String[10];
        mstring[0] = "Madina";
        mstring[1] = "Germany";
        mstring[2] = "dango shone";
        mstring[3] = "Berlin";
        mstring[5] = "Seoul";
        mstring[8] = "Turkey";

        for (int index=0; index<=7; index++){
           // System.out.print("  " + mstring[index]);

            if (mstring[index].equals("Berlin")){  // IN String, == (equals)
                System.out.println("Berlin index => " + index);
                return; // break to loop; siklni to'xtish.
            }

        }



        System.out.println();
        System.out.println("-------------------");

    }
}
