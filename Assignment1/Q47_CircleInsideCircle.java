/* Implement a java program to find whether a circle is inside another circle or not. (consider all the possibel cases) */

import java.util.Scanner;

class Q47_CircleInsideCircle{

	static void checkCircle(int c1_x1,int c1_y1,int c2_x2,int c2_y2,int c1_r,int c2_r){
	
	int distance = (int)Math.sqrt(((c1_x1 - c2_x2) * (c1_x1 - c2_x2)) + ((c1_y1 - c2_y2) * (c1_y1 - c2_y2)));
	
	if((distance + c2_r) < c1_r)
		System.out.println("Circle2 is within circle1 without circle2 touching the circumference of circle1");
	
	else if((distance + c2_r) == c1_r)
		System.out.println("Circle2 is within circle1 with circle2 touching the circumference of circle1");
	
	else
		System.out.println("Circle2 is not within circle1");
	
	}

public static void main(String args[]){
	
	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the center co-ordinates of a circle1(x1,y1)");
	int c1_x1 = Integer.parseInt(obj.nextLine());
	int c1_y1 = Integer.parseInt(obj.nextLine());
	
	System.out.println("Enter the radius of a circle1");
	int c1_r = Integer.parseInt(obj.nextLine());

	System.out.println("Enter the center co-ordinates of a circle2(x2,y2)");
	int c2_x2 = Integer.parseInt(obj.nextLine());
	int c2_y2 = Integer.parseInt(obj.nextLine());
	
	System.out.println("Enter the radius of a circle2");
	int c2_r = Integer.parseInt(obj.nextLine());
	
	checkCircle(c1_x1,c1_y1,c2_x2,c2_y2,c1_r,c2_r);
}
}