package by.epam.mtv.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays2 {
	
	///////////////////////GetMin////////////////////////
	public static double GetMin(double []array) {
		double min;
		min = array[0];
		for(double x : array) {
			if(x < min) 
				min = x;		
		}
		return min;
	}
	///////////////////////GetCount///////////////////////
	public static int GetCount(double []array, double min) {
		int count;
		count = 0; 
		for(double x : array) {
			if( x == min)
				count++;
		}
		return count;
	}
	
	/////////////////////CreateArrayWithoutMin/////////////
	public static double[] CreateArrayWithoutMin(double [] array){
		double min = GetMin(array); 
		int count = GetCount(array, min);
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
		
		double[] resultArray = CreateArrayWithoutMin(array);
		System.out.println("Array without min: ");
		for(double x : resultArray)
			System.out.print(x + " ");
		System.out.println();
	}
}
