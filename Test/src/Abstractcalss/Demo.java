public class Demo {
	abstract class Animal {
	    abstract void sound();
	}

	class Demo extends Animal {
	    void sound() {
	        System.out.println("Dog barks");
	    }

	    public static void main(String[] args) {
	        Test d = new Test();
	        d.sound();
	    }
	}

}
