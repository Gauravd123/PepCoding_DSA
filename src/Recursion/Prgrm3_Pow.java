package Recursion;

public class Prgrm3_Pow {

	public static void main(String[] args) {

		System.out.println(pow(2,31));
	}
	
	public static int pow(int x,int n)
	{
		if(n==0)
			return 1;
		
		return x*pow(x,n-1);
		
	}

}
