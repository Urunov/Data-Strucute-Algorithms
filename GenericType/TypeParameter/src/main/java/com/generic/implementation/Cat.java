package com.generic.implementation;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {TypeParameter}
 * @Date: {2022/03/14 && 7:10 PM}
 */
public class Cat extends Animal{
    //
    private String litterPreference;


    public Cat(String name) {
        this.name = name;
    }

    public String getLitterPreference(){
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference){

        try {
            this.litterPreference = litterPreference;
        }catch (Exception e){
            System.out.println(" " + e);
        }
    }
}
