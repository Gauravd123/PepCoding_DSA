package Recursion;

public class Prgrm8_FirstIndexOccurrence {

	public static void main(String[] args) {

		int[] arr = { 10, 24, 8, 24 };
		int ele = 242;
		int res = firstIndex(arr, 0, ele);

		System.out.println(res);
	}

	public static int firstIndex(int[] arr, int index, int ele) {
		if (index == arr.length)
			return -1;

		if (arr[index] == ele)
			return index;
		else
			return firstIndex(arr, index + 1, ele);

	}
}
