package corejava;

public class Encap2 {

	private int i;
	
	public void setI(int j){
		i=j;
	}
	public int getI(){
		return i;
	}
	
	
	public static void main(String[] args) {
		
	Encap2 obj=new Encap2();
	obj.setI(10);
	System.out.println(obj.getI());
	}

}
