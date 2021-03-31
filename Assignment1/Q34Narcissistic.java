/* Implement a Java program to find all the narcissistic numbers between 1 and 1000. */

/* Same as Question 1 - ArmStrong number */

/*Program to check whether number is armstrong number */
import java.util.Scanner;
//class <classname>
class Q34Narcissistic{
	
	static void narcissistic(int num){
		
	int countnumber = 0;
	
	int copyNumber = num;
	
	while(copyNumber != 0)
	{
		countnumber++; //provides the number of digits in the input number
		copyNumber /= 10;
	}

	copyNumber = num;
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

	if(result == num)
		System.out.println(num);

	//else
	//System.out.println("Not an Armstrong Number\n"+num);
	
	}
	
public static void main(String args[]){
	
	System.out.println("Narcissistic Numbers inbetween 1 to 1000 are:");
	for(int i=1;i<1000;i++)
	{
		narcissistic(i);
	}

}
}