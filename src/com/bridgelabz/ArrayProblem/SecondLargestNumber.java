package com.bridgelabz.ArrayProblem;

public class SecondLargestNumber {
	static int secondLargest(int[] arr) {
		int firstNumber = 0;
		int secondNumber = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstNumber) {
				secondNumber = firstNumber;
				firstNumber = arr[i];
			}
			else if(arr[i] > secondNumber && arr[i] != firstNumber) {
				secondNumber = arr[i];
			}
		}
		return secondNumber;
	}
	public static void main(String[] args) {
		int[] arr = {16, 20, 15, 10, 7, 5, 21, 45, 18, 30};
		int secondNumber = secondLargest(arr);
		if(secondNumber == 0) {
			System.out.println("No second largest number");
		}
		else {
			System.out.println("The second Largest number is = "+secondNumber);
		}
	}
}