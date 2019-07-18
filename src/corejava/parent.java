package corejava;

public class parent{
	parent(){
		System.out.println("parent class const");
	}
	void m1(){
	System.out.println("parent class");
	}
}
class child extends parent{
	child(){
		System.out.println("child class cont");
	}
	void m2(){
		System.out.println("child class");
	}

	public static void main(String[] args) {
		new child().m1();
		new child().m2();

	}

}
