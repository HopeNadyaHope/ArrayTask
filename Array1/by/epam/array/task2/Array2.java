package by.epam.array.task2;

import java.util.Scanner;

public class Array2 {
	
	///////////////////////GetMin////////////////////////
	public static double findMin(double []array) {
		double min;
		min = array[0];
		for(double x : array) {
			if(x < min) 
				min = x;		
		}
		return min;
	}
	///////////////////////GetCount///////////////////////
	public static int countingMin(double []array, double min) {
		int count;
		count = 0; 
		for(double x : array) {
			if( x == min)
				count++;
		}
		return count;
	}
	
	/////////////////////CreateArrayWithoutMin/////////////
	public static double[] createArrayWithoutMin(double [] array){
		double min = findMin(array); 
		int count = countingMin(array, min);
		double[] resultArray = new double[array.length - count];
		int ind;
		ind = 0;
		for(double x : array) {
			 if(x != min)
				 resultArray[ind++] = x;
		 }
		 return resultArray;
	}
	
	
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input length of the array : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        double [] array = new double [n];
		for(int i = 0; i< n; i++) {
			array[i] = Math.random() * 10;
		}
        
		System.out.println("Source array: ");
		for(double x : array)
			System.out.print(x + " ");
		System.out.println();
		
		double[] resultArray = createArrayWithoutMin(array);
		System.out.println("Array without min: ");
		for(double x : resultArray)
			System.out.print(x + " ");
		System.out.println();
	}
}
