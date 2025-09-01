package Recursion;

public class Prgrm3_Pow_Logarithmic {

	public static void main(String[] args) {

		System.out.println(pow_log(10, 8));
	}
	
	public static long pow_log(long x,long n)
	{
		
		if(n==0)
			return 1;
		
		long xn2 = pow_log(x,n/2);
		long xn = xn2 * xn2;
		
		if(n%2==1)
			xn*=x;
		return xn;
	}

}
