package corejava;

import java.util.Scanner;

public class ArmStrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of N");
		 int n= sc.nextInt();
		 
		 int temp=n;
		 int r,Sum=0;
		 
		 while(n>0){
		 r=n%10;
		 n=n/10;
		 Sum=Sum+r*r*r;
		 }
		 if(temp==Sum){
			 System.out.println("Amrstrong");
		 }
		 else{
			 System.out.println("Not an armstrong");
		 }
	}

}
