package chetan;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    // Constructor: takes name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: displays name and age
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String n = sc.nextLine();

        System.out.print("Enter age: ");
        int a = sc.nextInt();

        Person p = new Person(n, a);
        p.display();

        sc.close();
    }
}