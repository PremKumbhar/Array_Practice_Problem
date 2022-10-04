package com.bridgelabz.ArrayProblem;

public class LargestElement {
	public static void main(String[] args) {  
		
        int [] arr = new int [] {25, 10, 99, 125, 7, 66, 45};  
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}
