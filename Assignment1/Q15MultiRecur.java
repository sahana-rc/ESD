/* Implement a JAVA program to multiply two numbers using recursive multiplication. */

import java.util.Scanner;
class Q15MultiRecur{
	static int multiply(int a, int b){
		    if(a<b)
				return multiply(b,a);
			else if(b!=0)
				return (a+multiply(a,b-1));
			else
				return 0;
	}
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'a'");
		int a = num.nextInt();
		System.out.println("Enter 'b'");
		int b = num.nextInt();
		int mul = multiply(a,b);
		System.out.println(" The product is: "+mul);
	}
	
}