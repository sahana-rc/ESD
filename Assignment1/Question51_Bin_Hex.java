/* Binary to hexadecimal equivalent 
1100 / 10 = 

*/
import java.util.Scanner;
//class <classname>
class Question51_Bin_Hex{
public static void main(String args[]){

Scanner myObj = new Scanner(System.in);
System.out.println("Enter a 4 digit binary number\n");
int Bin_number = Integer.parseInt(myObj.nextLine());
if(Bin_number < 0)
	{
		System.out.println("Enter the correct binary number\n");
		System.exit(0);
	}
int res = 0;
int rem;
int digitcnt = 0;
int i = 0;
while(Bin_number != 0)
{
	digitcnt++;
	if(digitcnt > 4)
	{
		System.out.println("Input number is more than 4 digits\n");
		System.exit(0);
		//break;
	}	
	rem = Bin_number % 10;
	//System.out.println("\n"+rem);
	if(rem != 0 && rem != 1)
	{
		System.out.println("Input number is not binary number\n");
		System.exit(0);
	}
	res += rem * Math.pow(2,i++);
	Bin_number /= 10;
}

switch(res)
{
case 10: System.out.println("A\n");
			break;
case 11: System.out.println("B\n");
			break;
case 12: System.out.println("C\n");
			break;
case 13: System.out.println("D\n");
			break;							
case 14: System.out.println("E\n");
			break;
case 15: System.out.println("F\n");
			break;
default: System.out.println("\n"+res);
			break;
}

}
}


