package corejava;

public class MethodOverloading {
	void m1(int a){
		System.out.println("int m1 method");
	}
	void m1(int a, int b){
		System.out.println("int, int m1 method");
	}
	void m1(char ch){
		System.out.println("Char m1 method");
	}
	public static void main(String[] args){
		MethodOverloading t = new MethodOverloading();
		t.m1('A');
		t.m1(10);
		t.m1(2,3);
	}

}
