/*Program to print odd numbers in between 1 - 100 */
import java.util.Scanner;
//class <classname>
class Q8OddNumber{
public static void main(String args[]){

Scanner myObj = new Scanner(System.in);
System.out.println("Enter the lower and higher range in which odd numbers has to be printed\n");
int LowerIndex = Integer.parseInt(myObj.nextLine());
int HigherIndex = Integer.parseInt(myObj.nextLine());

System.out.println("Odd numbers are: "); 

for(int i = LowerIndex; i < HigherIndex ; i++)
{
	if(i%2 != 0)
		System.out.println(+i);
}

}
}