/* Program to find stright line equation giving input m and c */
import java.util.Scanner;

class Q49_StraightLine{
public static void main(String args[]){

Scanner myObj = new Scanner(System.in);

System.out.println("Enter the slope value(m) and constant value(c)\n");

int slope = Integer.parseInt(myObj.nextLine());

int constant = Integer.parseInt(myObj.nextLine());

System.out.format("The straight line equation is: y = %d x + (%d)\n", slope,constant);

//System.out.println("The straight line equation is: y = mx + c\n"+slope, +constant);

}
}


