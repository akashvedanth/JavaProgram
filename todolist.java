package Akashjava;

import java.util.ArrayList;

public class todolist {

    public static void main(String args[]) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Write report");
        tasks.add("Review code");

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}