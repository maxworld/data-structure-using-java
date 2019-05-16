package com.learn.sorting;

import com.learn.constants.Constants;

/**
 * Class to perform merge sort on unsorted array. Complexity for merge sort is O(n log n)
 * 
 * @author Mayank Bharadwaj
 * 
 */
public class Merge {

	//To split the array using pivot as mid. 
	private void mergeSort(int[] testIntArr, int arrLength) {

		//base condition to break the recursive call
		if (arrLength < 2)
			return;

		int mid = arrLength / 2;
		int left[] = new int[mid];
		int right[] = new int[arrLength - mid];

		for (int leftIndex = 0; leftIndex < mid; leftIndex++) {
			left[leftIndex] = testIntArr[leftIndex];
		}

		for (int rightIndex = mid; rightIndex < arrLength; rightIndex++) {
			right[rightIndex - mid] = testIntArr[rightIndex];
		}

		this.mergeSort(left, mid);
		this.mergeSort(right, arrLength - mid);

		merge(testIntArr, left, right, mid, arrLength - mid);
	}

	//To merge the split array with sort
	private void merge(int[] testIntArr, int[] left, int[] right, int leftIndex, int rightIndex) {

		int i = 0, j = 0, k = 0;

		while (i < leftIndex && j < rightIndex) {
			if (left[i] <= right[j])
				testIntArr[k++] = left[i++];
			else
				testIntArr[k++] = right[j++];
		}

		while (i < leftIndex) {
			testIntArr[k++] = left[i++];
		}

		while (j < rightIndex) {
			testIntArr[k++] = right[j++];
		}

	}

	public static void main(String... args) {
		Merge merge = new Merge();

		int arr[] = Constants.TEST_INT_ARR;
		merge.mergeSort(arr, arr.length);

		//To print the sorted array
		for (int a : arr) {
			System.out.println(a + " ");
		}
	}

}
