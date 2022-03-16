package com.lambda.sample;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaSimple}
 * @Date: {2022/03/15 && 8:51 PM}
 */
public class Cat implements Printable{
    //
    public String name;
    public int age;

    public Cat() {
    }



    @Override
    public void print(String perfix, String suffix) {
        System.out.println("Myow");
    }
}
