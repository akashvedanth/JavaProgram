package Demo;

 abstract class Test1 {
	abstract void withdraw();
	abstract void deposite();
	
}

public class Test 
{
	void withdraw()
	{
		System.out.println("Trserser");
	}
	void deposite()
	{
		System.out.println("Trserser dfgsdf");
	}
	public static void main(String[] args) {
		Test  bb =new Test();
		bb.withdraw();
		bb.deposite();
	}
}

