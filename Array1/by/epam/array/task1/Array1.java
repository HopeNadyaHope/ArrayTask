package by.epam.array.task1;

import java.util.Scanner;

public abstract class Array1 {
		
	/////////////////maxSum////////////////////////////
	public static double maxSum(double []array) {
		double max;
		max = array[0] + array [array.length - 1];
		
		double currentSum;		
		for(int i = 0; i< (array.length / 2); i++) {
			currentSum = array[i] + array[array.length - 1 - i];
			if(currentSum > max)
				max = currentSum;
		}
		return max;
	}
	
	
//////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input half length of the array : ");
        Scanner in = new Scanner(System.in);
        int n = (in.nextInt()) * 2;
        in.close();
        
		double [] array = new double [n];
		for(int i = 0; i< n; i++) {
			array[i] = Math.random() * 10;
		}
		
		System.out.println("Array : ");
		for(double x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("Max sum : " + maxSum(array));
	}

}
