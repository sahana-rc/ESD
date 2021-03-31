/* Implement a Java program to check whether a number is a Duck Number or not */

import java.util.Scanner;

class Q26DuckNumber{

	static boolean check_duck(String num)
    {
        // Ignore leading 0s
        int i = 0, n = num.length();
        while (i < n && num.charAt(i) == '0')
            i++;
  
        // Check remaining digits
        while (i < n) {
            if (num.charAt(i) == '0')
                return true;
            i++;
        }
  
        return false;
    }

    public static void main(String args[])
    {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Duck number or not");
		
		String num = obj.nextLine();

		if (check_duck(num))
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}