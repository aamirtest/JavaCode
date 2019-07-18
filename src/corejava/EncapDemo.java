package corejava;

public class EncapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Emp e1 = new Emp();
		e1.setempID(10);
		e1.setempName("Aamir");
		
		Emp e2 = new Emp();
		e2.setempID(20);
		e2.setempName("Raghu");
		
		System.out.println(e1.getempID());
		System.out.println(e1.getempName());
		
	}
}
class Emp{
	private int empID;
	private String empName;
	
	public void setempID(int empID){
		this.empID=empID;
	}
	public int getempID(){
		return empID;
	}
	
	public void setempName(String empName){
		this.empName= empName;
	}
	public String getempName(){
		return empName;
	}
	
	
}
