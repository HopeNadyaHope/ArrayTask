package by.epam.mtv.task3;

import java.util.Random;
import java.util.Scanner;

public class Arrays4 {

	///////////////////GetMostOften////////////////////////
	public static int GetMostOften(int[] array) {
		int[] frequency = new int [array.length];
		
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array.length; j++) 
				if (array[i] == array[j]) 
					frequency[i]++;
				 
		int mostOftenNumber;
		int mostOftenFrequency;
		mostOftenNumber = array[0];
		mostOftenFrequency = frequency[0];

		for(int i=0; i < frequency.length; i++) {
			if(frequency[i] > mostOftenFrequency) {
				mostOftenFrequency = frequency[i];
				mostOftenNumber = array[i];
			}
			if((frequency[i] == mostOftenFrequency) && (array[i] < mostOftenNumber )) {
				mostOftenFrequency = frequency[i];
				mostOftenNumber = array[i];
			}
		}
		return mostOftenNumber;
	}
	
	
//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.print("Input length of the array : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
		int [] array = new int [n];
		Random rn = new Random();
		for(int i = 0; i< n; i++) {
			array[i] = rn.nextInt(5);
		}
		
		System.out.println("Array : ");
		for(int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();

		
		System.out.println("The most often number : " +  GetMostOften(array));
	}

}
