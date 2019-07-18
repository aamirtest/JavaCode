package corejava;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		int s=0,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		
		int t=n;
		while(n>0){

			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s){
			System.out.println("Palindrom " +s);
		}
		else{
			System.out.println("Not a palindrom");
		}

	}
}
