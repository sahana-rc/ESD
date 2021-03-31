/* Implement a JAVA program to find the square root of the number. (import MATH,can use sqrt) */
import java.util.Scanner;
import java.lang.Math;
class Q5SquareRoot{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj.nextInt();
		System.out.println("The square of a number is "+(Math.pow(num,0.5)));
		System.out.println("The square of a number is "+(Math.sqrt(num)));
	}
}