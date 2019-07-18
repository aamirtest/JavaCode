package corejava;

	public class fuctionOverloading {
		
		public static void main(String[] args) {
			Addition t=new Addition();
			t.add(24,6);
			t.add(2,5,3);
			t.add(2.5,3.696);
			
		}
		}

		
	class Addition{
		void add(int x, int y){
			int c=x*y;
			System.out.println(c);
		}
		void add(int a,int b,int d){
		int c=a+b+d;
		System.out.println(c);
		}
		void add(double x, double y){
		double c=x*y;
		System.out.println(c);
		}
		}
	


	
	