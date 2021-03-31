/* Program to check whether there is any occurance of character in an n-digit input number */

import java.util.Scanner;

class Q45_isCharacter{

public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter n-digit number\n");
		
		String s = obj.next();
		
		//int inputNumber = Integer.parseInt(obj.nextLine());
		int flag = 0;
		int len = s.length();
		
		//System.out.println("Length of input string is "+len);
		
		int i=0;
		while(len > 0)
		{
			if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
			{
				//System.out.println("Inside if");
				flag = 1;
				break;
			}
			i++;
			len--;
		}
		
		if(flag == 1)
			System.out.println("There exists character in the input number\n");
		else
			System.out.println("There exists no character in the input number\n");
}

}