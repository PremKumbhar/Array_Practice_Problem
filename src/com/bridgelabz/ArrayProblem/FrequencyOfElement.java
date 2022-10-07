package com.bridgelabz.ArrayProblem;

public class FrequencyOfElement {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 10, 10, 20, 20, 30, 40};
		boolean visited[] = new boolean[10];
		for(int i =0; i < array.length; i++) {
			if(visited[i] == true) {
				continue;}
			int count = 1;
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println("array[i] = array[j] "+j);
					visited[j] = true;
					count++;
					}
				}
				System.out.println(array[i]+ " occurs " + count + " times ");
			}
		}
	}
