package com.generic.implementation;

import java.util.ArrayList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TypeParameter}
 * @Date: {2022/03/14 && 1:02 PM}
 */
public class GenericsExample {
    public static void main(String[] args) {

        Printers<Integer> printer = new Printers<>(23);
        printer.print();

        Printers<Double> printers = new Printers<>(454.4);
        printers.print();

        Printers<String> str = new Printers<>("Mashina ");
        str.print();

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat("Kate"));
        Cat my = (Cat) cats.get(0);

    }
}
