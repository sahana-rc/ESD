/* Implement a program to check if a number is Mersenne number or not. */

/* check whether number is of the form 2^k - 1
	check whether the number is prime or not */

import java.util.Scanner;

class Q33Meresenne{

	static boolean isMersenne(int num){
		
		for(int i=1; i<100;i++)
			if(num == (Math.pow(2,i) - 1))
				return true;
		return false;
	}
	
	static boolean isPrime(int num){
		
		if(num == 2)
			return true;
				
		for (int i=2; i<Math.sqrt(num);i++)
				if((num%i) == 0)
					return false;
		return true;
	}

	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Mersenne or not");
		
		int inputNumber = obj.nextInt();
		
		if(isMersenne(inputNumber))
			if(isPrime(inputNumber))
			{
				System.out.println("The number "+inputNumber+" is Mersenne");
				System.exit(0);
			}
			
		System.out.println("The number "+inputNumber+" is not Mersenne");
	}

}