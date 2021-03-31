/* Implement a Java program to check a number is a cyclic or not. */

import java.util.Scanner;

class Q30Cyclic {
	// Function to generate all cyclic
	// permutations of a number
	static boolean isCyclic(long N)
	{
		// Count digits and check if all
		// digits are same
		long num = N;
		int count = 0;
		int digit = (int)(num % 10);
		boolean allSame = true;
		while (num > 0) {
			count++;
			if (num % 10 != digit)
				allSame = false;
			num = num / 10;
		}

		// If all digits are same, then
		// not considered cyclic.
		if (allSame == true)
			return false;

		// If counts of digits is even and
		// two halves are same, then the
		// number is not considered cyclic.
		if (count % 2 == 0) {
			long halfPower = (long)Math.pow(10, count / 2);
			long firstHalf = N % halfPower;
			long secondHalf = N / halfPower;
			if (firstHalf == firstHalf && isCyclic(firstHalf))
				return false;
		}

		num = N;
		while (true) {
			// Following three lines generates a
			// circular pirmutation of a number.
			long rem = num % 10;
			long div = num / 10;
			num = (long)(Math.pow(10, count - 1))
					* rem
				+ div;

			// If all the permutations are checked
			// and we obtain original number exit
			// from loop.
			if (num == N)
				break;

			if (num % N != 0)
				return false;
		}

		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is cyclic or not");
		
		int inputNumber = obj.nextInt();
		
		if (isCyclic(inputNumber))
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}

