package Recursion;

import java.util.ArrayList;

public class Prgrm13_Get_Stairs_Path {

	public static void main(String[] args) {

		
		ArrayList<String> res = getStairsPath(4);
		System.out.println(res);
	}
	
	
	public static ArrayList<String> getStairsPath(int n)
	{
		if(n==0)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}else if(n<0)
		{
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> path1 = getStairsPath(n-1);
		ArrayList<String> path2 = getStairsPath(n-2);
		ArrayList<String> path3 = getStairsPath(n-3);
		
		
		ArrayList<String> paths = new ArrayList<>();
		
		for(String path: path1)
		{
			paths.add(1+path);
		}
		for(String path: path2)
		{
			paths.add(2+path);
		}
		for(String path: path3)
		{
			paths.add(3+path);
		}
		
		return paths;
	}

}
