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