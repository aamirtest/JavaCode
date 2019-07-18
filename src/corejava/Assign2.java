package corejava;

public class Assign2 {

	int a=10;
	int b=20;
	static int  x=100;
	static int y=200;
	
	
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(Assign2.x);
		System.out.println(Assign2.y);
	}
	static void m2(){
		Assign2 t=new Assign2();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Assign2.x);
		System.out.println(Assign2.y);
	}

	public static void main(String[] args) {
		Assign2 t=new Assign2();
		t.m1();
		Assign2.m2();

	}

}
