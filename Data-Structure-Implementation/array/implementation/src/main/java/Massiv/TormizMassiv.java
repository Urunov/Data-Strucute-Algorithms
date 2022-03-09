package Massiv;

import java.util.Scanner;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/15 && 6:53 PM}
 */
public class TormizMassiv {
    //
    public static void main(String[] args) {

        double [] bank = new double[4];

        int index =0;
        Scanner scanner = new Scanner(System.in);

        // dobavit element na massive element:
        while (index<bank.length){
            System.out.println("Enter massive element: >>" );
            bank[index] = scanner.nextDouble();
            index++;
        }

        // pechat element
        double sum =0.0;
        for (int i=0; i<bank.length; i++){
            sum+=bank[i];
        }
        System.out.print("    " + sum);

        // index =0, index pasldeniy = umnacheniyasi.
        System.out.println("---------------------------");
        double umnajeniya = 1, umnajeniya1=1;
        int paslendiyElement = bank.length-1;

        umnajeniya = bank[0] * bank[paslendiyElement];

        System.out.println("Umnajeyina: " + umnajeniya);

        // Task: umanjeniya: index=0, serdniy element, pasledniy
       // umnajeniya1 =


        // chotniy i nechotniy
        for(int i=0; i<bank.length; i++){
            if (bank[i] %2 ==0) {
                System.out.println(" Chotniy> " + bank[i]);
            } else{
                System.out.println(" Nechotniy " + bank[i]);
            }
        }

    }


    /****
     *  1. Array: bank
     *     chotniy : summa
     *     nechotniy: umnajeniya
     *
     *  2. Array: bank
     *  index
     *    - chotniy :
     *    - nechnotniy:
     *
     *    bank[0] = 1
     *    bank[1] = 4; index : nechotniy
     *    bank[2] = -3; index: chotniy
     *    bank[3] = 9; index: nechotniy
     *
     *  3. Max i Minimum element in Array(massivda)
     *
     *  while (){
     *
     *  }
     *
     *
     *  -------------------
     *  2D - Matritsa:
     *  a = [ 1 43 5 6
     *   54 43 4 7
      *  4  5  6 17
     *   5  5  5  5
      *  ]
     *  a [index0, index1]
     *  a [0, 0] = 1
     *  a [0, 1] = 43
     *  a [0, 2] = 5
     *  a[0, 3] = 6
     *
     *  a[1, 1] = 54
     *  a[1, 2] = 43
     *
     *
     * */

}
