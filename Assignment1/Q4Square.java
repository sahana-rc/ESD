/* Implement a JAVA program to find the square of the number.  */

import java.util.Scanner;

class Q4Square{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		System.out.println("The square of a number is "+(num*num));
	}
}