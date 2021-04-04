/* Implement a Java program to calculate the Binomial Coefficient of two positive numbers. */
import java.util.Scanner;
class Q19BinomialCoef{
	
	public static int fact(int n){
		int fact = 1;
		while(n!=0){
			fact = fact * n;
			n--;
		}
		return fact;
	}
	
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number n");
		int n = num.nextInt();
		System.out.println("Enter the number k");
		int k = num.nextInt();
		int temp = n-k;
		int binom =(fact(n)/(fact(k)*fact(temp)));
		System.out.println("The Binomial coefficient of n and k is: "+binom);
		
		
	}	
}