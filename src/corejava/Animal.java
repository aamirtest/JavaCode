package corejava;

public class Animal {

	void m1(){
		System.out.println("m1");
	}
}
class Dog extends Animal{
	void m1(){
		System.out.println("m2");
	}
	public static void main(String[] args) {
		new Dog().m1();

	}

}
