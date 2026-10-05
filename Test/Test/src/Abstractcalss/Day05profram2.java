public class Day05profram2 {
	int a;
	int b;
	void m1(int c, int d) {
		a=c;
		b=d;
	}
	void m2() {
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		Day05profram2 vv=new Day05profram2();
		vv.m1(2, 3);
		vv.m2();
	}
}
