package asdfghjkl;

public class Allcode {

}
package asdfghjkl;
//OOPS
//inheritance , ploymor 1) over laod / overrding
//, encap abst
//same name of a method with diff parameter
//with in the class


public class Demo {	   
	 void add(String s)
	 {
		 System.out.println(" 1aat");
	 }
	 void add(int a, int b)
	 {
		 System.out.println("2nd");
	 }
	 public static void main	(String[] args) {
		Demo  tt = new Demo();
		tt.add(2, 3);
		tt.add("asdfasdf");
		
	}
}---------------------------------

package asdfghjkl;

//OOPS
//inheritance , ploymor 1) over laod / overrding
//, encap abst
//same name of a method with diff parameter
//with in the class
class Parent {
	void cancer() {
		System.out.println(" dsfsdf");
	}
}

public class Demo extends Parent{	   
	 public static void main	(String[] args) {
		Demo  tt = new Demo();
	  tt.cancer();
	}
}

------------------------
package asdfghjkl;

//OOPS
//inheritance , ploymor 1) over laod / overrding
//, encap abst
//same name of a method with diff parameter
//with in the class
class Parent {
	void proprty()
	{
		System.out.println("propoerty ");
	}
	void marry()
	{
		System.out.println("family girl / boy");
	}}
public class Demo extends Parent{	   
	void marry()
	{
		System.out.println("campus selection girl / boy");
	}
	public static void main	(String[] args) {
		Demo  tt = new Demo();
		tt.marry();
		tt.proprty();}
}