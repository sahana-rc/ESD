/* Implement a JAVA program to implement a Half adder using Bitwise operator. */

import java.util.Scanner;
class Q10HalfAdder{
	static int xor(int A,int B){
		int AxorB;
		AxorB = A ^ B;
		return AxorB;
	}
	static int and(int A,int B){
		int AandB;
		AandB = A & B;
		return AandB;
	}
	
	static void halfAdder(int A, int B){
		System.out.println("The Sum is: "+xor(A,B));
		System.out.println("The Carry is: "+and(A,B));
	}
	
	
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'a'");
		int a = num.nextInt();
		System.out.println("Enter 'b'");
		int b = num.nextInt();
		
		halfAdder(a,b);
	}
}