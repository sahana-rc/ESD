/* Implement Java program to check if a given number is Fibonacci number or not. */

import java.util.Scanner;
class Q21Fibonacci{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = num.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 =0;
		int flag = 0;
		if(n==0 | n==1 | n==2){
			System.out.println("The number "+n +" is Fibonacci Number ");
			flag = 1;
		}
		else{
		for(int i=3;i<=(n+1);i++){
			n3 = n1 + n2 ;
			//System.out.println("The number is Fibonacci Number " +n3);
			if(n3 == n){
				System.out.println("The number "+n +" is Fibonacci Number ");
				flag = 1;
			}
			n1 = n2;
			n2 = n3;
			
		}
		if(flag==0){
			System.out.println("The number "+n +" is not a Fibonacci Number ");	
		}
		}	
	}
}