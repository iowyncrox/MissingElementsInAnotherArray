import java.util.Arrays;

public class MissingElementsInAnotherArray {

	public static int[] missingElements(int[] arrayOne, int[] arrayTwo) {

		int size;
		int[] returnArray;

		if (arrayOne.length > arrayTwo.length) {
			size = arrayOne.length;
			returnArray = new int[size];
			int start = 0;

			for (int i = 0; i < arrayOne.length; i++) {
				if (!isPresent(arrayOne[i], arrayTwo)) {
					returnArray[start++] = arrayOne[i];
				}
			}

		} else {
			size = arrayTwo.length;
			returnArray = new int[size];
			int start = 0;

			for (int i = 0; i < arrayTwo.length; i++) {
				if (!isPresent(arrayTwo[i], arrayOne)) {
					returnArray[start++] = arrayTwo[i];
				}
			}

		}

		return returnArray;
	}

	private static boolean isPresent(int elementOne, int[] arrayTwo) {
		for (int elementInArrayTwo : arrayTwo) {
			if (elementOne == elementInArrayTwo) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arrayOne = { 10, 20, 30, 40, 50 };
		int[] arrayTwo = { 20, 40 };

		int[] returnArray = missingElements(arrayOne, arrayTwo);
		// int[] returnArray = missingElements(arrayTwo, arrayOne);
		System.out.println(Arrays.toString(returnArray));
	}
}
