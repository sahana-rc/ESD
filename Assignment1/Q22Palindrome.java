/* Check whether the number is a palindrome number or not */

import java.util.ArrayList;
import java.util.Scanner;
  
class Q22Palindrome {
  
    public static void main(String[] args)
    {
  
        Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = num.nextInt();
		int length = String.valueOf(n).length();
		
		int[] list = new int[length+1];
		int[] list_rev = new int[length+1];
		int j = length;
		int flag = 0;
		int i=0;
		while(n!=0){
			int digit = n%10;
			list[i] = digit;
			n=n/10;	
			i++;
		}
		
		System.out.println("The array is: \n");
        for (int k = 0; k < length; k++) {
            System.out.print(list[k]);
		}
			
        // Initialise flag to zero.
        
 
        // Loop till array size n/2.
        for (i = 0; i <= length / 2 && length != 0; i++) {
 
            // Check if first and last element are different
            // Then set flag to 1.
            if (list[i] != list[length - i - 1]) {
                flag = 1;
                break;
            }
        }
 
       
        if (flag == 1)
            System.out.println("Not Palindrome");
        else
            System.out.println("Palindrome");
    }
}