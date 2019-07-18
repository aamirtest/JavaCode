package corejava;

public class Encap1 {
	//declaring private members
	private String name;
	private int age;
	
	//declaring public members
	public void setName(){
		name="John";
	}
	public String getName(){
		return name;
	}
	public void setAge(){
		age=21;
	}
	public int getAge(){
		return age;
	}
	public static void main(String[] args){
		Encap1 e= new Encap1();
	//initializing the variables
		e.setName();
		e.setAge();
		
	//getting values from variables
		System.out.println("Name: "+e.getName());
		System.out.println("Age: "+e.getAge());
		
	}
	
	
	

}
