package com.syntax.class12;

public class Part5 {

	public static void main(String[] args) {

		int number = 15;
		boolean isPrime = true;
		if (number > 1) {
			for(int i=2; i<number; i++) {
				if (number%i==0) {
					isPrime=false;
					//break;
				}
			}
		} else {
			isPrime = false;
		}
		System.out.println("is "+number + " a prime number? " + isPrime);
// new change
	}

}
