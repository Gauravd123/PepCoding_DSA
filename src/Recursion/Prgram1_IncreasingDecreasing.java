package Recursion;

public class Prgram1_IncreasingDecreasing {

	public static void main(String[] args) {
		
		incre_decre(5);
		
	}
		
		public static void incre_decre(int n)
		{
			if(n==0)
				return;
			System.out.println(n);
			incre_decre(n-1);
			System.out.println(n);
		}

	}
