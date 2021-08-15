package com.syntax.class12;

public class Part2 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where
		//you will store odd and even numbers. 
		//Develop a program which will identify/print the even numbers only.

		int [][] numbers = {
				
				{22, 13, 32, 44, 55},
				{41, 54, 61},
				{71, 88, 92}
					
		};
		
		for (int [] numbs:numbers) {
			for (int num:numbs) {
				if (num%2==0) {
					System.out.println(num);
				}
				
			}
			
		}
		
	}

}
