package com.generic.implementation;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TypeParameter}
 * @Date: {2022/03/14 && 1:02 PM}
 */
public class Printers<T> {

    T thingsToPrint;

    public Printers(T thingsToPrint) {
        this.thingsToPrint = thingsToPrint;
    }

    public void print(){
        System.out.println(thingsToPrint);
    }
}
