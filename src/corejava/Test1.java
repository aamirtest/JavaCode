package corejava;

public class Test1 {
	Test1(){
		System.out.println("0-arg");
	}
	Test1(int a){
		System.out.println("1-arg");
	}
	Test1(int a,int b){
		System.out.println("2-arg");
	}
	void m1(){
		System.out.println("method call");
	}
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static method");
	}
	public static void main(String[] args) {
		new Test1();
		new Test1(10);
		new Test1(10,20);
		new Test1().m1();
	}

}

