package corejava;

import java.util.Scanner;

public class pyramid1 {
	
	static int count;
	
	public static void main(String args[]){
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("total rows "+count);
		
		int count = sc.nextInt();
		
		for(int i=1; i<count; i++){
			
			for(int k=3; k<i+1; k--){
				System.out.print(" ");
			}
		
		for(int j=1; j<=i; j++){
			
			System.out.print(j);
			
		}
		System.out.println();

}
	}
}
