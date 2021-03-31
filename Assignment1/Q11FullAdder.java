/* Implement a JAVA program to implement a Full adder using Bitwise operator. */

import java.util.Scanner;
class Q11FullAdder{
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
	static int or(int A,int B,int C){
		int AorBorC;
		int t1 = A |B;
		
		AorBorC = t1| C ;
		return AorBorC;
	}
	
	static void fullAdder(int A, int B, int C){
		
		int tempxor = xor(A,B);
		int and1 = and(A,B);
		int and2 = and(B,C);
		int and3 = and(A,C);
		
		System.out.println("The Sum is: "+xor(tempxor,C));
		System.out.println("The Carry is: "+or(and1,and2,and3));
	}
	
	
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter 'a'");
		int a = num.nextInt();
		System.out.println("Enter 'b'");
		int b = num.nextInt();
		System.out.println("Enter 'c'");
		int c = num.nextInt();
		
		fullAdder(a,b,c);
	}
}