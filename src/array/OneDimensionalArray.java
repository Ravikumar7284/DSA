package array;

public class OneDimensionalArray {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		printArray(intArray);
		int[] oddArray = removeEvenIntegers(intArray);
		printArray(oddArray);
		int[] reverseArray = reverseArray(intArray);
		printArray(reverseArray);
		reverseString("Hello World");
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

}
