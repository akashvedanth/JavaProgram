package asdfghjkl;

 class GetSetq {
	int a=10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	}
public	class Day06prog1 extends GetSetq{
		public static void main(String[]args) {
			Day06prog1 bb = new Day06prog1();
			bb.setA(4);
		int ss = bb.getA();
		System.out.println(ss);
		}
	}