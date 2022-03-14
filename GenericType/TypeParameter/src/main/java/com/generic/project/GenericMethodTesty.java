package com.generic.project;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TypeParameter}
 * @Date: {2022/03/12 && 4:39 PM}
 */
public class GenericMethodTesty {
    //
    public static <E> void printArray(E[] inputArray){
        // Display array elements
        for (E element: inputArray){
            System.out.printf(" %s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create arrays of Integer, Double, and Character
        Integer[] inArray = {2, 4, 1, 5, 6};
        Double [] doubleArray = {3.3, 21.2, 43.4};
        Character [] characters = {'H', 'G', 'L', 'J', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        printArray(inArray);

        System.out.println("\n Array double array contains: ");
        printArray(doubleArray);

        System.out.println("\n Array character Array contains: ");
        printArray(characters); // pass a character array
    }
}
