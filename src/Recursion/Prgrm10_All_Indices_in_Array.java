package Recursion;

public class Prgrm10_All_Indices_in_Array {

	public static void main(String[] args) {
		int[] arr = { 24,10,24, 24, 8,  24 ,224,24};
		int ele = 24;
		int[] res = allIndicesArray(arr, 0, ele, 0);
		
		for(int x : res)
		{
			System.out.println(x);
		}
	}
	
	// fsf = find so far
	public static int[] allIndicesArray(int[] arr, int index, int ele, int fsf)
	{
		
		if(index == arr.length)
		{
			return new int[fsf];
		}
		if(arr[index] == ele)
		{
			int[] iarr = allIndicesArray(arr, index+1, ele, fsf+1);
			iarr[fsf] = index;
			return iarr;
		}
		else
		{
			int[] iarr = allIndicesArray(arr, index+1, ele, fsf);
			return iarr;
		}
	}

}
