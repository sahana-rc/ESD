/* Implement a Java program to check whether a number is a Harshad Number or not. */

import java.util.Scanner;

class Q23HarshadNumber	{
	
	static boolean checkHarshad(int n)
    {
        // calculate sum of digits
        int sum = 0;
        for (int temp = n; temp > 0; temp /= 10)
            sum += temp % 10;
 
        // Return true if sum of digits is multiple
        // of n
        return (n % sum == 0);
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Harshad number or not");
		
		int inputNumber = obj.nextInt();
		
		if(inputNumber <= 0)
		{
			System.out.println("Enter proper input");
			System.exit(0);
		}
		
        System.out.println(checkHarshad(inputNumber) ? "Yes" : "No");
  
    }
}