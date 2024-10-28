package array;

import java.util.Arrays;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 5;
		intArray[1] = 9;
		intArray[2] = 3;
		intArray[3] = 6;
		intArray[4] = 4;
		printArray(intArray);
		int[] oddArray = removeEvenIntegers(intArray);
		printArray(oddArray);
		int[] reverseArray = reverseArray(intArray);
		printArray(reverseArray);
		reverseString("Hello World");
		System.out.println(minimumInteger(intArray));
		System.out.println(maximumInteger(intArray));
		System.out.println(secondMaximum1(intArray));
		System.out.println(secondMaximum2(intArray));
	}

	// print array elements
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// getting odd elements from array
	static int[] removeEvenIntegers(int[] array) {
		int oddCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddCount++;
			}
		}
		int[] oddIntegers = new int[oddCount];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				oddIntegers[index] = array[i];
				index++;
			}
		}
		return oddIntegers;
	}

	// reversing array
	static int[] reverseArray(int[] array) {
		int[] reverseArray = new int[array.length];
		int index = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			reverseArray[index] = array[i];
			index++;
		}
		return reverseArray;
	}

	// reversing string
	static void reverseString(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverse = ch + reverse;
		}
		System.out.println(reverse);
	}

	// minimum value
	static int minimumInteger(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	// maximum value
	static int maximumInteger(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// second maximum value
	static int secondMaximum1(int[] array) {
		Arrays.sort(array);
		int secondMaximum = array[array.length - 2];
		return secondMaximum;
	}

	static int secondMaximum2(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			sortedArray[i] = array[i];
		}
		int secondMaximum = sortedArray[sortedArray.length - 2];
		return secondMaximum;

	}

}
