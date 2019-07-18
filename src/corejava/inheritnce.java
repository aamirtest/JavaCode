package corejava;

class inheritnce{
	void m1(){
		System.out.println("m1 method");
	}
	void m2(){
		System.out.println("m2 method");
	}
}
class A extends inheritnce{
	void m3(){
		System.out.println("m3 method");
	}
	void m4(){
		System.out.println("m4 method");
	}
}
class B extends A{
	void m5(){
		System.out.println("m5 method");
	}
	void m6(){
		System.out.println("m6 method");
	}
	public static void main(String[] args){
		inheritnce t1=new inheritnce();
		t1.m2(); t1.m1();
		B t=new B();
		t.m4(); t.m5(); t.m6(); t.m3();
		A t2=new A();
		t2.m3(); t2.m4(); t2.m1(); t2.m2();
	}

}

	
	




