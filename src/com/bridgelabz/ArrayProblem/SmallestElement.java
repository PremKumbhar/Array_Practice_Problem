package com.bridgelabz.ArrayProblem;

public class SmallestElement {
public static void main(String[] args) {  
		
        int [] arr = new int [] {25, 10, 99, 125, 7, 66, 45};  
        int min = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] < min)  
               min = arr[i];  
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }  
}
