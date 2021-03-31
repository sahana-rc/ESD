/* Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9. */

import java.util.Scanner;
class Q3Ascii{
	public static void main(String[] args)   
{   
	for(int i = 65; i <= 90; i++)  {  
	System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
	}  
		System.out.println(" \n ");
	 
	
	for(int i = 97; i <= 122; i++)  {  
	System.out.println(" The ASCII value of " + (char)i + "  =  " + i); }     
	 
	 System.out.println(" \n ");
	
	for(int i = 48; i <= 57; i++)  {  
	System.out.println(" The ASCII value of " + (char)i + "  =  " +(int)i); }  
	 
}	
}
 