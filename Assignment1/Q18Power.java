/* Find the power of the number without using existing methods */

import java.util.Scanner;
class Q18Power{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number");
		double n = num.nextDouble();
		System.out.println("Enter the power");
		double p = num.nextDouble();
		double save_p = p;
		double mul=1;
		
		while(p!=0){
			
			mul = mul*n;
			p--;	
		}
		System.out.println(+n +" to the power "+save_p +" is: " +mul);
	}	
}