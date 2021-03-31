/* Implement a Program in Java to check whether a number is a Keith Number or not */

/* Input : x = 197
Output : Yes
197 has 3 digits, so n = 3
The number is Keith because it appears in the special
sequence that has first three terms as 1, 9, 7 and 
remaining terms evaluated using sum of previous 3 terms.
1, 9, 7, 17, 33, 57, 107, 197, .....

*/

import java.util.Scanner;

class Q36KeithNumber{

	final static int SIZE = 20;

	private static int digitCnt,cnt=0;
	
	private static int[] array = new int[SIZE];

	static int arrNumber(int inputNumber){
	
	int copyNumber = inputNumber;
		
	//int cnt = 0;
	
	while(copyNumber != 0)
	{
		//array[i] = copyNumber%10;
		copyNumber /= 10;
		cnt++;
	}
	
	System.out.println("number of digits is "+cnt);
	
	digitCnt = cnt;
	
	copyNumber = inputNumber;
	
	cnt = cnt - 1;
	
	while(copyNumber != 0)
	{
		array[cnt] = copyNumber%10;
		copyNumber /= 10;
		System.out.println(array[cnt]);
		cnt--;
	}
	
	
	return digitCnt;
	
	}
	
	static void isKeithNumber(int inNum,int numDigit){
	
	int sum=0;
	int j = 0;
	int i = 0;
	int count;
	
	while (sum <= inNum)
	{
		sum = 0;
		i = j;
		count = numDigit;
		System.out.println("Loop "+j);
		while(count > 0)
		{
			System.out.println("\tcount is "+count+"array value is "+array[i]);
			sum += array[i++];
			count--;
		}
		
		array[i] = sum;
		System.out.println("Computed sum is "+sum);
		
		if(sum == inNum)
		{
			System.out.println("Number "+inNum+" is keith number");
			System.exit(0);
		}
		j++;
	}
	
	System.out.println("Number "+inNum+" is not keith number");
	
	}
	
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked whether its a keith number or not");
		
		int inputNumber = obj.nextInt();
		
		if(inputNumber < 0)
		{
			System.out.println("Number is negative, please enter proper input(+ve number)");
			System.exit(0);
		}
		
		int numberOfDigits = arrNumber(inputNumber);
		
		System.out.println("Number of digits is "+numberOfDigits);
		
		isKeithNumber(inputNumber,numberOfDigits);
	
	}
}