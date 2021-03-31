/*Program to check whether number is armstrong number */
import java.util.Scanner;
//class <classname>
class ArmStrong{
public static void main(String args[]){

int copyNumber;

Scanner myObj = new Scanner(System.in);
System.out.println("Enter a number\n");
int InputNumber = Integer.parseInt(myObj.nextLine());

System.out.println("Input number is: " +InputNumber);

if(InputNumber < 0)
{
	System.out.println("Enter a positive number\n");
	System.exit(0);
}

copyNumber = InputNumber;
int countnumber=0;

while(copyNumber != 0)
{
countnumber++; //provides the number of digits in the input number
copyNumber /= 10;
}

copyNumber = InputNumber;
int result = 0;
int remainder;
int sum = 0;
while(copyNumber != 0)
{
remainder = copyNumber%10;
sum += remainder;
//System.out.println("sum value is "+sum);
result += Math.pow(remainder,countnumber);
copyNumber /= 10;
//System.out.println("remainder value is "+remainder);
//System.out.println("result value is "+result);
}

if(result == InputNumber)
System.out.println("Armstrong Number\n"+InputNumber);

else
System.out.println("Not an Armstrong Number\n"+InputNumber);

}
}
