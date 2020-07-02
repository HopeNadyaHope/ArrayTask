package by.epam.array.task5;

import java.util.Scanner;

public class Array5 {
	
	public static double GetSum (double[] array) {
		if(array.length == 1)
			return array[0];
		if(array.length == 2)
			return array[0] + array[1];

		double min;
		double max;
		min = array[0];
		max = array [1];
		
		for(int i = 2; i < array.length; i++) {
			if((i % 2 ==0) && (array[i] < min))
				min = array[i];
			if((i % 2 ==1) && (array[i] > max))
				max = array[i];		
		}
		return max + min;
	}
	
	
	
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input length of the array : ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.close();
        
		double [] array = new double [len];
		for(int i = 0; i< len; i++) {
			array[i] = Math.random() * 10;
		}
		
		System.out.println("Source array: ");
		for(double x : array)
			System.out.print(x + " ");
		System.out.println();

		double sum;
		sum = GetSum(array);
		System.out.print("Sum : " + sum);
		
	}

}
