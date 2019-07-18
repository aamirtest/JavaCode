package corejava;
/*
public class Inheritnce1 {
	int a=10;
	int b=20;
}
class C extends Inheritnce1{
	int a=100;
	int b=200;
	void add(int a, int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}	
	public static void main(String[] args) {
		new C().add(300,300);
	}
}
*/
class D{
	void m1(){
		System.out.println("m1 method");
	}
}
class E extends D{
	void m1(){
		System.out.println("m1 of child");
	}
	void m2(){
		m1();
	}
	public static void main(String[] args){
		new E().m1();
		new E().m2();
	}
}
