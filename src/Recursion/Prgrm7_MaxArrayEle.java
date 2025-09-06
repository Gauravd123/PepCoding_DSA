package Recursion;

public class Prgrm7_MaxArrayEle {
	public static void main(String[] args) {
		int[] arr = { 212,24,400,176,8 };

		System.out.println(maxArray(arr, 0));
	}

	public static int maxArray(int[] arr, int index) {

		if(index==arr.length-1)
			{
			return arr[index];
			
			}
		

		if(maxArray(arr, index+1) > arr[index])
			return maxArray(arr, index+1);
		else
			return arr[index];
	}

}
