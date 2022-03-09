package com.project.collect;

import java.util.LinkedList;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/08 && 10:45 PM}
 */
public class PopLinkedList {
    public static void main(String[] args) {

        LinkedList<String> stack = new LinkedList<>();
        stack.push("Allo");
        stack.push("Jhon");
        stack.push("how ");
        stack.push("are ");
        stack.push("you");


        System.out.println("The first : " + stack);

        String result = stack.pop();
        stack.push("Urunov");

        System.out.println(result);

        System.out.println(stack);
    }
}
