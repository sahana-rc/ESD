/* Implement a JAVA program to find the max and min of given two numbers. */

import java.util.Scanner;
class Q13MaxAndMin{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'a'");
		int a = num.nextInt();
		System.out.println("Enter 'b'");
		int b = num.nextInt();
		
		if(a>b)
			System.out.println(" a is maximum and b is minimum");	
		else
			System.out.println(" b is maximum and a is minimum");
	}
}