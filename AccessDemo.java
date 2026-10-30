package Akashjava;

import java.util.LinkedList;

public class AccessDemo {

    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.getFirst());

        System.out.println(list.reversed());

        System.out.println(list);
    }
}