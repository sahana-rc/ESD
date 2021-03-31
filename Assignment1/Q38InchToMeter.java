/*Implement a Java program that reads a number in inches, 
converts it to meters(CLA) */

import java.util.Scanner;

class Q39InchToMeter{
	
	static void convertToMeters(float len_inches){
		
		if(len_inches < 0)
		{
			System.out.println("Length cannot be negative");
			System.exit(0);
		}
		
		System.out.println("Inches in meter is "+(len_inches * 0.0254)+"m");
	
	}
	
	public static void main(String args[]){
				
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter length in inches to be converted into meters");
		
		float len_inches = obj.nextFloat();
		
		convertToMeters(len_inches);
	}

}