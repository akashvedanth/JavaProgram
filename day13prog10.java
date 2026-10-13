package Akashjava;

class day13prog10 {
    public static void main(String[] args) {
        String s = "Java is easy";

        String[] words = s.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}