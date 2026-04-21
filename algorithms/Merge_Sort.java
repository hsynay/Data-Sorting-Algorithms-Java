package algorithms;

import java.util.Iterator;

public class Merge_Sort {
	
	//int [] array = {23, 78, 45, 8, 32, 56};
	
	public static void mergeSort(int [] array) {
		
		int length = array.length;
		
		if(length < 2) {
			return;
		}
		
		int midIndex = length / 2;
		
		int [] leftArray = new int[midIndex];
		
		int [] rightArray = new int[length - midIndex];
		
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[i];
		}
		
		for (int i = midIndex; i < length; i++) {
			rightArray[i - midIndex] = array[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(array, leftArray, rightArray);
		
	}
	
	public static void merge(int [] array, int [] leftArray , int [] rightArray) {
		
		int i = 0, j = 0, k = 0;
		
		while (i < leftArray.length && j < rightArray.length) {
			
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = rightArray[j];
				j++;
				
			}
			k++;
		}
		
		while (i < leftArray.length) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while (j < rightArray.length) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		 	
	}
}
