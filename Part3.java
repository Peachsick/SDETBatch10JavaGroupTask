package com.syntax.class12;

public class Part3 {

	public static void main(String[] args) {
		int [][] number = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		int total = 0;
		int sum = 0;
		
		for(int [] numbs : number) {
			for(int numb : numbs) {
				if (numb%2==0) {
					sum+=numb;
				}else if (numb%2!=0){
					total+=numb;
				}
			}	
		}
		System.out.println("The sum of all even numbers in the array is "+sum);
		System.out.println("The sum of all odd numbers in the array is "+total);
	}
}
