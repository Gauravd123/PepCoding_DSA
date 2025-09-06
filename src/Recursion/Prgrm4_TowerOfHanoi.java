package Recursion;

import java.util.Scanner;

public class Prgrm4_TowerOfHanoi {

	static int count=0;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n=sc.nextInt();
		
		
		toh(n,"S","D","H");
		System.err.println("Count: "+count);
	}
	
	
	public static void toh(int n,String s,String d,String h) {
		
		
		if(n==0)
			return;
		toh(n-1,s,h,d);
		System.out.println(n+": "+s+" -> "+d);
		count++;
		toh(n-1,h,d,s);
	}

}
