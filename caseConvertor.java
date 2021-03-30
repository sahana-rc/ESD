/*Program to convert lower case character to upper case character using bitwise operator */
import java.util.Scanner;
//class <classname>
class caseConvertor{
public static void main(String args[]){
	
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter a character\n");
         
        char c = myObj.next().charAt(0); 
   
        //System.out.println("c = "+c);
		
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			c ^= 32;
		else
		{
			System.out.println("input value is not an alphabet, please enter alphabet");
			System.exit(0);
		}

		System.out.println("converted case value is = "+c);
}
}