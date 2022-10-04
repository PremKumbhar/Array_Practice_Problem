package com.bridgelabz.ArrayProblem;

public class ReverseArray {
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println("\nArray in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
       
        }  
    }  
}
