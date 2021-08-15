package com.syntax.class12;

public class Part7 {

	public static void main(String[] args) {
		
		int [] numbers = {432,24324,343,444,532,6213,7467,8657,960};
		int largest = numbers[0];
		
		largest = numbers[0];
		for (int n:numbers) {
			if (n>largest) {
				largest=n;
			}
		}
		System.out.println("THE LARGEST NUMBER IN THE ARRAY IS "+largest);
		int smallest = numbers[0];
		for (int no:numbers) {
			if (no<smallest) {
				smallest=no;
			}
		}
		System.out.println("THE SMALLEST NUMBER IN THE ARRAY IS "+smallest);
	}

}
