package corejava;

public class Test {
		
		Test(){
			this(10);
			System.out.println("0-arg");
		}
		Test(int a){
			this(10,10);
			System.out.println("1-arg");
		}
		Test(int a,int b){
			System.out.println("2-arg");
		}
		void m1(){
			System.out.println("m1 method");
		}
		void m2(){
			System.out.println("m2 method");
		}
		void m3(){
			System.out.println("m3 method");
		}

		public static void main(String[] args) {
			Test t= new Test();
			t.m1();
			t.m2();
			t.m3();
		}

	}

