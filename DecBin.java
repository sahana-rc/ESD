/*Program to convert decimal to binary */
import java.util.Scanner;
//class <classname>
class DecBin{
public static void main(String args[]){

Scanner myObj = new Scanner(System.in);
System.out.println("Enter the number to converted to binary");
int number = Integer.parseInt(myObj.nextLine());

int [] binNumber = new int[10];
int i = 0;
while (number > 0)
{
	binNumber[i++] = number%2;
	
	number /= 2;
}

System.out.println("Binary number is");

//i = i-1;

while(i >= 0)
{
	System.out.println(+binNumber[i--]);
}

}
}