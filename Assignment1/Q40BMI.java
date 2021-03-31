/* Implement a Java program to compute body mass index (BMI). */

import java.util.Scanner;

class Q40BMI{

	static void calcBMI(float w,float h){
	
		System.out.println("BMI is "+(w/(h*h)));
	}

	public static void main(String args[]){
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the weight in kgs");
		
		float weight = obj.nextFloat();
		
		System.out.println("Enter the height in meters");
		
		float height = obj.nextFloat();
		
		calcBMI(weight,height);
			
	}


}