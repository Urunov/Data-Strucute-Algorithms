package Massiv;

/**
 * @Company: {Nextree inc.}
 * @Author: {urunov}
 * @Project: {ArrayImplementation}
 * @Date: {2022/02/05 && 9:22 PM}
 */
public class MyArray {
    public static void main(String[] args) {
        // Massiv --> array

        int boxEgg [] = {2, 4, 6, 5};

       /**
        *            boxEgg [0, 1, 2, 3, 4 , ..., n] --> index
        *            boxEgg[0] = 2
        *            boxEgg[1]=4
        *            boxEgg[2] = 6
        * */
        int index=0;
        int summa =0;
        int umnajeniya= 1;

        while(index<boxEgg.length){ // while loop just simple root....
           // summa = summa + boxEgg[index];    // length --> obshiy uzunlik
            summa+= boxEgg[index];
            // umnajeniya;

            index++; // biz indexni oshiryapmiz
        }
        System.out.println(summa);
        System.out.println("Umnajeinya: " + umnajeniya);

//        for(int xz : nums){ // for-each version of the for.
//            sum1+=xz;
//        }
       // System.out.println(sum1);

    }

}


/***
 *  Task-3:
 *  Umnajeniya massiv elementov.
 *  eggBox[0]=2
 *  eggBox[1] = 4
 *
 *
 *
 * */