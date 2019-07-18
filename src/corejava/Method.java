package corejava;
/*
public class Method {

	int m1(){
		System.out.println("m1 method");
		return 20;
	}
	float m2(){
		System.out.println("m2 method");
		return 10.5f;
		}
	static char m3(){
		System.out.println("char methid");
		return 'p';
	}
	
	public static void main(String[] args) {
	System.out.println("main method");
		Method t= new Method();
		int x=t.m1();
		System.out.println(x);
		
		float f= t.m2();
		System.out.println(f);
		
		char s=Method.m3();
		System.out.println(s);
		

	}

}
*/
/*
class Emp{}
class X{}
public class Method {
	Emp m1(){
		System.out.println("m1 method");
		Emp e = new Emp();
		return e;
	}
	X m2(){
		System.out.println("m2 method");
		X x = new X();
		return x;
	}
	static String m3(){
		System.out.println("m3 method");
		String x = new String();
		return "Aamir";
	}
	
	
	public static void main(String[] args) {
		Method m= new Method();
		Emp e1= m.m1();
		System.out.println(e1);
		X x1 = new X();
		System.out.println(x1);
		String str = new String();
		System.out.println(str);
	}
}
*/

public class Method {
	Method m1(){
		System.out.println("m1 method");
		Method m= new Method();
		return m;
	}
	Method m2(){
		System.out.println("m2 method");
		return this;
	}
	public static void main(String[] args) {
		
	System.out.println("testing");
	 Method t= new Method();
	 Method t1= t.m1();
	 Method t2=t.m2();
	
	}
	
	}
