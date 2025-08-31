package Recursion;

public class Prgrm2_Fact {

	public static void main(String[] args) {
		
		
		System.out.println(fact(5));
	}
	
	public static int fact(int n)
	{
		if(n==1 || n==0)
			return 1;
		return n*fact(n-1);
	}

}
