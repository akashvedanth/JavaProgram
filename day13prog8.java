package Akashjava;

class day13prog8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");

        sb.delete(5, 11);
        System.out.println("After delete(): " + sb);

        StringBuilder s = new StringBuilder("Hello");
        s.deleteCharAt(1);
        System.out.println("After deleteCharAt(): " + s);
    }
}