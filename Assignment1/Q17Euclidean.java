/* Find the dictance between two points, using euclidean distance. */

import java.util.Scanner;
import java.lang.Math;;
class Q17Euclidean{
	public static void main(String args[]){
		Scanner num = new Scanner(System.in);
		System.out.println("Enter point x1");
		double x1 = num.nextDouble();
		System.out.println("Enter point x2");
		double x2 = num.nextDouble();
		System.out.println("Enter point y1");
		double y1 = num.nextDouble();
		System.out.println("Enter point y2");
		double y2 = num.nextDouble();
		double a = x2-x1;
		double b = y2-y1;
		
		double Eucl = Math.pow((Math.pow(a,2)+Math.pow(b,2)),0.5);
		System.out.println("The Euclidean Distance is: "+Eucl);
		
	}
	
}