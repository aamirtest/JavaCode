package corejava;

public class Test2 {

		public static void main(String[] args) {
			Test3 t=new Test3();
			t.forloop();
			t.whileloop();
			t.dowhileloop();
		}
}

	class Test3{
		
		void forloop(){
			for(int i=0; i<10; i++){
				System.out.print(i);
			}	
			System.out.println();
		}
		void whileloop(){
			int j=0;
			while(j<10){
				System.out.print(j);
				j++;
			}
			System.out.println();
			
		}
		void dowhileloop(){
			int z=0;
			do{
				System.out.print(z);
				z++;
			}
			while(z<10);
		}
		
		
	}
