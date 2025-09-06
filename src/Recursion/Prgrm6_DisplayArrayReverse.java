package Recursion;

public class Prgrm6_DisplayArrayReverse {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		displayArray(arr, 0);

	}

	public static void displayArray(int[] arr, int index) {
		if (index > arr.length - 1)
			return;
		
		displayArray(arr, index + 1);
		System.out.println(arr[index]);

	}
}