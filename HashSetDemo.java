package Akashjava;

 import java.util.HashSet;

		 public class HashSetDemo {

		     public static void main(String args[]) {

		         HashSet<String> set = new HashSet<>();

		         set.add("Apple");
		         set.add("Banana");
		         set.add("Mango");

		         for (String fruit : set) {
		             System.out.println(fruit);
		         }
		     }
		 }
