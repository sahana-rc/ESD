/* Implement a Java program that reads via CLA (size type) 
example: 1 KB / 1 MB, calculate the memory in bytes. */

import java.util.Scanner;

class Q39Memory{
	
	public static void main(String args[]) {
		
		if(Integer.parseInt(args[0]) < 0)
		{
			System.out.println("No negative memory");
			System.exit(0);
		}
		
		switch(args[1])
		{
		case "kb":
		case "KB":	System.out.println("Memory in bytes is "+(Integer.parseInt(args[0]) * Math.pow(2,10)));
					break;
		case "mb":
		case "MB":	System.out.println("Memory in bytes is "+(Integer.parseInt(args[0]) * Math.pow(2,20)));
					break;
		case "gb":
		case "GB":	System.out.println("Memory in bytes is "+(Integer.parseInt(args[0]) * Math.pow(2,30)));
					break;
		case "tb":
		case "TB":	System.out.println("Memory in bytes is "+(Integer.parseInt(args[0]) * Math.pow(2,40)));
					break;
		default: 	System.out.println("Enter proper input");
					break;
		}
	
	}

}
