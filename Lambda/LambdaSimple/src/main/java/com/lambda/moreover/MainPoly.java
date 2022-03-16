package com.lambda.moreover;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaSimple}
 * @Date: {2022/03/15 && 9:44 PM}
 */
public class MainPoly implements LambdaInterface{
    public static void main(String[] args) {
        String name = "Bro";
        char symbol = '!';
        LambdaInterface lambdaInterface =(x, y) -> {
            System.out.print("Heloo");
            System.out.println("  " + x + y);
        };
        lambdaInterface.message(name, symbol);

    }
    @Override
    public void message(String name, char symbol) {
        System.out.println("My");
    }
}
