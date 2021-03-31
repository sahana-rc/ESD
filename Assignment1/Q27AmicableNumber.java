/* Implement a Java program to check two numbers are Amicable numbers or not. */

import java.util.Scanner;

class Q27AmicableNumber{
	static int divSum(int n)
    {
        // Sum of divisors
        int result = 0;
      
        // find all divisors which divides 'num'
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            // if 'i' is divisor of 'n'
            if (n % i == 0)
            {
                // if both divisors are same
                // then add it once else add
                // both
                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }
      
        // Add 1 and n to result as above loop
        // considers proper divisors greater 
        // than 1.
        return (result + 1);
    }
      
    // Returns true if x and y are Amicable
    // else false.
    static boolean areAmicable(int x, int y)
    {
        if (divSum(x) != y)
        return false;
      
        return (divSum(y) == x);
    }
      
    public static void main (String[] args) 
    {
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the numbers to be checked whether they are amicable");
		
		int num1 = obj.nextInt();
		
		int num2 = obj.nextInt();
		
        if (areAmicable(num1, num2))
			System.out.println( "Yes");
        else
			System.out.println("No");
      
    }
} 