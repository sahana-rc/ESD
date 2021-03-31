/* Program to find LCD of numbers */

import java.util.Scanner;

class Q50_LCD{
	
	static int gcd(int a, int b){
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		
		if(a > b)
			return gcd(a%b,b);
		
		return gcd(a,b%a);
		
	}
	
	static int lcd(int a,int b){
		
		return ((a*b)/gcd(a,b));
		
	}
	
	public static void main(String args[]){
		
		System.out.println("Enter two numbers for which LCD has to be computed\n");
		
		Scanner obj = new Scanner(System.in);
		
		int number1 = Integer.parseInt(obj.nextLine());
		
		int number2 = Integer.parseInt(obj.nextLine());
		
		if(number1 < 0 || number2 < 0)
		{
			System.out.println("Enter positive numbers");
			System.exit(0);
		}
		
		System.out.println("LCD of "+number1 + " and " + number2 + " is " + lcd(number1,number2));
		
	}
	
	
}