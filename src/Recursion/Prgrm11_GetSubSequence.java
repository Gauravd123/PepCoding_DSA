package Recursion;

import java.util.ArrayList;

public class Prgrm11_GetSubSequence {

	public static void main(String[] args) {
		
		
		ArrayList<String> res = gss("123");
		System.out.println(res);
	}

	
	public static ArrayList<String> gss(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
			
		}
		char ch = str.charAt(0);
		String s = str.substring(1);
		ArrayList<String> res = gss(s);
		
		ArrayList<String> mres = new ArrayList<String>();
		
		for(String s1: res)
		{
			mres.add(""+s1);
		}
		
		for(String s2: res)
		{
			mres.add(ch+s2);
		}
		
		return mres;
		
	}
}
