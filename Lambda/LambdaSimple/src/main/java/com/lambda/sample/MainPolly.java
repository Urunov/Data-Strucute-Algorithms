package com.lambda.sample;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {LambdaSimple}
 * @Date: {2022/03/15 && 8:53 PM}
 */
public class MainPolly {
    public static void main(String[] args) {

        Cat myCat = new Cat();
      // printThing(myCat);
        Printable lambdaPrintable = (perfix, suffix)->System.out.println("myow" + suffix);
        printThing(lambdaPrintable);
    }

    static void printThing(Printable things){
        things.print("> ", "!");
    }


}
