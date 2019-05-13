package com.learn.searching;

import com.learn.constants.Constants;

/*
 * Class to perform linear searching on unsorted array. Complexity for linear search is O(n)
 * 
 */
public class Linear {

	private int elementToSearch;

	public Linear(int elementToSearch) {
		this.elementToSearch = elementToSearch;
	}

	//getter
	public int getElementToSearch() {
		return this.elementToSearch;
	}

	//method to search element linearly
	private static int searchElement(int[] testIntArr, int elementToSearch) {
		for (int index = 0; index < testIntArr.length; index++) {
			if (testIntArr[index] == elementToSearch)
				return index;
		}
		return -1;
	}

	//main method for trigger the application by jvm
	public static void main(String ... args) {
		Linear linear = new Linear(8);
		int searchedElementIndex = searchElement(Constants.TEST_INT_ARR, linear.getElementToSearch());

		String result = (searchedElementIndex != -1)
				? "Element " + linear.getElementToSearch() + " found at index " + searchedElementIndex
				: "Element " + linear.getElementToSearch() + "not found.";

		System.out.println(result);
	}

}
