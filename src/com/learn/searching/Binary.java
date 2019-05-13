package com.learn.searching;

import java.util.Arrays;

import com.learn.constants.Constants;

/**
 * Class to perform binary searching on sorted array. Complexity for binary search is O(log n)
 * 
 * @author Mayank Bharadwaj
 * 
 */
public class Binary {

	private int elementToSearch;

	public Binary(int elementToSearch) {
		this.elementToSearch = elementToSearch;
	}

	//getter
	public int getElementToSearch() {
		return this.elementToSearch;
	}

	//method to search element using binary searching
	private static int searchElement(int[] testIntArr, int elementToSearch) {
		Arrays.sort(testIntArr);
		int start = 0;
		int end = testIntArr.length - 1;

		while (start != end) {
			int mid = (int) (start + Math.ceil(((end - start) / 2.0)));

			if (testIntArr[mid] == elementToSearch)
				return mid;

			if (testIntArr[mid] > elementToSearch) {
				start = 0;
				end = mid;
			} else {
				start = mid;
				end = testIntArr.length - 1;
			}
		}

		return -1;
	}

	//main method for trigger the application by jvm
	public static void main(String... args) {
		Binary binary = new Binary(8);
		int searchedElementIndex = searchElement(Constants.TEST_INT_ARR, binary.getElementToSearch());

		String result = (searchedElementIndex != -1)
				? "Element " + binary.getElementToSearch() + " found at index " + searchedElementIndex
				: "Element " + binary.getElementToSearch() + " not found.";

		System.out.println(result);
	}
}
