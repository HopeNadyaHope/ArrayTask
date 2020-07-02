package by.epam.array.task3;

import java.util.Random;


public class Array3 {
	
	/////////////////CreateLock//////////////////////////
	public static int[] createLock(int length) {
		int [] lock = new int [10];
		
		Random rn = new Random();
		int ind1;
		int ind2;
		ind1 = rn.nextInt(10);
		do{
			ind2 = rn.nextInt(10);
		}while(ind2 ==ind1);	

		lock[ind1] = rn.nextInt(6) + 1;
		lock[ind2] = rn.nextInt(6) + 1;
		
		return lock;
	}
	
	/////////////////FilledIndex//////////////////////////
	public static int[] filledIndex(int[] lock) {
		int[] index = new int[2];
		int i;
		i = 0;
		while( lock[i] == 0) {
			i++;
		}
		index[0] = i++;
		
		while( lock[i] == 0) {
			i++;
		}
		index[1] = i;
		
		return index;
		
	}
	/////////////////CreateCode//////////////////////////
	public static int[] createCode(int[] lock) {
		int[] filledIndex;
		filledIndex= filledIndex(lock);
		int firstValue = lock[filledIndex[0]];
		int secondValue = lock[filledIndex[1]];
		
		int mod1;
		int mod2;
		mod1 = filledIndex[0] % 3;
		mod2 = filledIndex[1] % 3;

		if((mod1 != mod2) && ((firstValue + secondValue > 9 ) || (firstValue + secondValue < 4 )))
			return null;
		
		if((mod1 == mod2) && (firstValue != secondValue))
			return null;
		
		if(mod1 == mod2) {
			mod2 = (mod1 + 1) % 3;
			secondValue = 3; 
		}
		
		int mod3;
		int thirdValue;
		mod3 = 3 - mod1 - mod2;
		thirdValue = 10 - firstValue - secondValue;
		
		int[] code = new int[lock.length];
		for(int i = 0; i < code.length; i++) {
			if(i % 3 == mod1)
				code[i] = firstValue;
			if(i % 3 == mod2)
				code[i] = secondValue;
			if(i % 3 == mod3)
				code[i] = thirdValue;
		}
		
		return code;
	}
	
	
	
//////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////	
	public static void main(String[] args) {
		System.out.println("Create lock : ");
        
		int[] lock;
		lock = createLock(10);		
		for(int x : lock)
			System.out.print(x + " ");
		System.out.println();
		
		///////////////////////////////
		System.out.println("Unlock : ");

		int[] code;
		code = createCode(lock);		
		if(code == null)
			System.out.println("Can't be unlocked");
		else {			
			for(int x : code)
				System.out.print(x + " ");
		}
	}
}
