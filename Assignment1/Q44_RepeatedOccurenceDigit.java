/* Implement a java program to count the repeted occurance of a digit in a n-digit number */

import java.util.Scanner;

class Q44_RepeatedOccurenceDigit{

	static void digitOccurence(int inputNumber,int digit){
	int saveNumber = inputNumber;
	int digitCnt = 0;
	int rem;
	
	if(inputNumber == 0 && digit == 0)
	{
		System.out.println("Occurence of "+digit+" is 1 time");
		System.exit(0);
	}
	
	if(inputNumber < 0)
			inputNumber = Math.abs(inputNumber);
	
	
	while(inputNumber != 0){
		
		//System.out.println("Inside while loop");
		
		rem = inputNumber%10;
		inputNumber /= 10;
		
		if(rem == digit)
				digitCnt++;
	}
	
	System.out.println("Occurence of "+digit+" in "+saveNumber+" is "+digitCnt);
	}

public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter n-digit number\n");
		
		int inputNumber = Integer.parseInt(obj.next());
		
		System.out.println("Enter the digit for which its frequency has to be checked for\n");
		
		int digit = Integer.parseInt(obj.next());
		
		digitOccurence(inputNumber,digit);
		
}

}