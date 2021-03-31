/* Implement a Java program to create the 
first twenty Hamming numbers */

/* Hamming number is of the form 2^i * 3^j * 5^k where i,j,k >= 0 */

import java.util.Scanner;

class Q37HammingNumber{

	static int isHammingNumber(int r){
		if(r == 1)
			return 1;
		if((r%2) == 0)
			return isHammingNumber(r/2);
		if((r%3) == 0)
			return isHammingNumber(r/3);
		if((r%5) == 0)
			return isHammingNumber(r/5);
		return 0;
	}

	static int hammingSequence(int range){
	
		if(range == 1)
			return range;
		
		range = hammingSequence(range-1);
		
		if(isHammingNumber(range) == 1)
			System.out.println(range);
		
		return range+1;
	
	}
	
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the range upto which hamming numbers has to be generated");
		
		int range = obj.nextInt();
		
		hammingSequence(range);
	
	}

}