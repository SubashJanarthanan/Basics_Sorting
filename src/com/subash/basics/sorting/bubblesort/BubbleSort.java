package com.subash.basics.sorting.bubblesort;

/**
 * Class BubbleSort
 * 
 * @author subash
 *
 */
public class BubbleSort {

	// Bubble Sort is the simplest sorting algorithm that works by repeatedly
	// swapping the adjacent elements if they are in wrong order.
	// Time complexity --> Best case --> O(n) and Worst case --> O(n2)
	// Recommended for small sized arrays

	public static void main(String[] args) {

		int[] integerArray = { 24, 58, 15, 45, 95, 27, 5, 43 };
		System.out.print("UnSorted Array:");
		for (int i : integerArray) {
			System.out.print(" " + i);
		}

		bubbleSort(integerArray);
	}

	/**
	 * @param integerArrayNew
	 */
	private static void bubbleSort(int[] integerArrayNew) {

		for (int i = 0; i < integerArrayNew.length - 1; i++) {
			for (int j = 1; j < integerArrayNew.length - i; j++) {

				if (integerArrayNew[j - 1] > integerArrayNew[j]) {
					int temp = integerArrayNew[j];
					integerArrayNew[j] = integerArrayNew[j - 1];
					integerArrayNew[j - 1] = temp;
				}
			}
		}

		System.out.println();
		System.out.print("Sorted Array: ");
		for (int i : integerArrayNew) {
			System.out.print(" " + i);
		}
	}

}
