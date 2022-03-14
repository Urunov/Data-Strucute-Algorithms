package com.project.differences;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {JavaSingly}
 * @Date: {2022/03/11 && 10:27 PM}
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListImpProcess linkedListImpProcess = new LinkedListImpProcess();
        linkedListImpProcess.addLast("B");
        linkedListImpProcess.addLast("C");
        linkedListImpProcess.addLast("F");
        linkedListImpProcess.addLast("E");
        linkedListImpProcess.addLast("R");

        System.out.println("result; " + linkedListImpProcess);
        linkedListImpProcess.addLast("H");
        System.out.println("new result: " + linkedListImpProcess);

        System.out.println(" Index of element with value E: " + linkedListImpProcess.get("E"));
        System.out.println("Index  of element with value zz" + linkedListImpProcess.get("ZZZ"));
    }
}
