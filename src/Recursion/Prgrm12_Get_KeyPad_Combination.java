package Recursion;

import java.util.ArrayList;

public class Prgrm12_Get_KeyPad_Combination {

	public static void main(String[] args) {

		ArrayList<String> words = getKPC("79");
		System.out.println(words);
	}

	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static ArrayList<String> getKPC(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> ran = new ArrayList<>();
			ran.add("");
			return ran;
		}
		char ch = str.charAt(0);
		String st = str.substring(1);
		
		ArrayList<String> res = getKPC(st);
		
		ArrayList<String> mres = new ArrayList<>();
		
		String code = codes[ch - '0'];
		
		for(int i=0;i<code.length();i++)
		{
			char ch1 = code.charAt(i);
			for(String s:res)
			{
				mres.add(ch1+s);
			}
		}
		
		
		
		return mres;
	}
}
