/* Implement a java program to find the memory size in bytes given the input as address length. */

import java.util.Scanner;

class Q48_memorySize{

static void memorySize(int aLength){

System.out.println("Memory Size in bytes is "+(int)(Math.pow(2,aLength))+" bytes");

}
	
public static void main(String args[]){

	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter the address length");
	
	int addressLength = Integer.parseInt(obj.nextLine());
	
	if(addressLength < 0)
	{
		System.out.println("Memory size is always positive");
		System.exit(0);
	}
	
	memorySize(addressLength);

}
}