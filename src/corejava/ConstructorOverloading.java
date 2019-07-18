package corejava;

public class ConstructorOverloading {

	ConstructorOverloading(int a){
		System.out.println("int arg const");
	}
	ConstructorOverloading(int a,int b){
		System.out.println("int, int arg const");
	}
	ConstructorOverloading(char ch){
		System.out.println("char arg const");
	}
	public static void main(String[] args) {
		new ConstructorOverloading(10);
		new ConstructorOverloading(12,20);
		new ConstructorOverloading('b');

	}

}
