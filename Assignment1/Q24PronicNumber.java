/* Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not. */

import java.util.Scanner;

class Q24PronicNumber{

    static boolean checkPronic(int x)
    {
        for (int i = 0;i <= (int)(Math.sqrt(x));i++)
            if (x == i * (i + 1))
                return true;
         
        return false;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is Pronic number or not");
		
		int inputNumber = obj.nextInt();
		
		if(inputNumber <= 0)
		{
			System.out.println("Enter proper input");
			System.exit(0);
		}
		
        if(checkPronic(inputNumber))
            System.out.print(inputNumber+" is a Pronic Number");    
		else
			System.out.print(inputNumber+" is not a Pronic Number");    
    }
}