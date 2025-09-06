package Recursion;

public class Prgrm9_LastIndexOccurrence {

	public static void main(String[] args) {

		int[] arr = { 10,24, 24, 8,  24 ,224};
		int ele = 24;
//		int res = lastIndex(arr, arr.length-1, ele);
		int res = lastIndex(arr, 0, ele);
		System.out.println(res);
	}
	
	
	public static int lastIndex(int[] arr, int index, int ele) {
		if (index == arr.length)
			return -1;

		int arrEle = lastIndex(arr, index + 1, ele);
		if(arrEle == -1)
		{
			if(arr[index]==ele)
				return index;
			else
				return -1;
		}
		else
			return arrEle;
			

	}

//	public static int lastIndex(int[] arr, int index, int ele) {
//		if (index == 0)
//			return -1;
//
//		if (arr[index] == ele)
//			return index;
//		else
//			return lastIndex(arr, index - 1, ele);
//
//	}
}
