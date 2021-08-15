package com.syntax.class12;

public class Part8 {

	public static void main(String[] args) {

		int[] array = { 5, 6, 8, 9, 11, 2, 36, 99, 48, 95, 100 };
		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println("Second largest number is = " + secondLargest);
	}

}
