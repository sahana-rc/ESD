/*Program to implement calculator using CLA */
import java.util.Scanner;
//class <classname>
class CalculatorCLA{
public static void main(String args[]){
int res;
switch(args[1])
{
	case "+": System.out.println("Result is:"+(Integer.parseInt(args[0]) + Integer.parseInt(args[2])));
				break;
	case "-": System.out.println("Result is:"+(Integer.parseInt(args[0]) - Integer.parseInt(args[2])));
				break;
	case "x": System.out.println("Result is:"+(Integer.parseInt(args[0]) * Integer.parseInt(args[2])));
				break;
	case "/": System.out.println("Result is:"+(Integer.parseInt(args[0]) / Integer.parseInt(args[2])));
				break;
}
}
}