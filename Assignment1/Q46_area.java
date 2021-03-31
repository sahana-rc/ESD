/* Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid
e)rhombus f) triangle */

import java.util.Scanner;

class Q46_area{

	static void areaOfCircle(){
		
	double PI = 3.14;
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the radius of the circle\n");
	
	int radius = Integer.parseInt(obj.nextLine());
	
	System.out.println("Area of the circle is "+(PI*radius*radius));
	
	}
	
	static void areaOfRectangle(){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the length and breadth of rectangle\n");
	
	int length = Integer.parseInt(obj.nextLine());
	int breadth = Integer.parseInt(obj.nextLine());
	
	System.out.println("Area of the rectangle is "+(length*breadth));
	
	}
	
	static void areaOfSquare(){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the side of square\n");
	
	int sideValue = Integer.parseInt(obj.nextLine());
	
	System.out.println("Area of the square is "+(sideValue*sideValue));
	
	}
	static void areaOfTrapezoid(){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the base length a,b and altitude of trapezoid\n");
	
	int a_value = Integer.parseInt(obj.nextLine());
	int b_value = Integer.parseInt(obj.nextLine());
	int altitude = Integer.parseInt(obj.nextLine());
	
	System.out.println("Area of the trapezoid is "+(((a_value + b_value)/2)*altitude));
	
	}
	
	static void areaOfRhombus(){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the base and height of rhombus\n");
	
	int base = Integer.parseInt(obj.nextLine());
	int height = Integer.parseInt(obj.nextLine());
	
	System.out.println("Area of the rhombus is "+(base*height));
	
	}
	
	static void areaOfTriangle(){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the three sides of triangle\n");
	
	int side_a = Integer.parseInt(obj.nextLine());
	int side_b = Integer.parseInt(obj.nextLine());
	int side_c = Integer.parseInt(obj.nextLine());
	
	double s = (side_a + side_b + side_c)/2.0;
	
	System.out.println("Area of the triangle is "+Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c)));
	
	}

public static void main(String args[]){
	
	System.out.println("Enter your choice");
	System.out.println("Find area of 1. Circle\n 2. Rectangle\n 3. Square\n 4. Trapezoid\n 5.Rhombus\n 6. Triangle\n");
	
	Scanner obj = new Scanner(System.in);
	
	int choice = Integer.parseInt(obj.nextLine());
	
	switch(choice)
	{
	case 1:	areaOfCircle();
			break;
	case 2: areaOfRectangle();
			break;
	case 3: areaOfSquare();
			break;
	case 4: areaOfTrapezoid();
			break;
	case 5: areaOfRhombus();
			break;
	case 6: areaOfTriangle();
			break;
	default:System.out.println("Entered option is not present, enter proper choice\n"); 
			System.exit(0);
	
	}
	
}

}