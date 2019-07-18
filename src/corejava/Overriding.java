package corejava;

class Parental{
	
	static void m1(){
		System.out.println("Parent");
	}

}
class Children extends Parental{
	static void m1(){
		System.out.println("Child");
	}
	public static void main(String[] args){
		Parental p = new Children();
		p.m1();
		
	}

}
