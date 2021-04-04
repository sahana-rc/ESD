/* 42. If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. 
Charu is how many years younger than Iqbal? 
Generalize this program and provide a JAVA program to get input and find the age.
*/

import java.util.Scanner;

class Q42Ages{

	void age(int iq, int sh)
	{
		int ch = iq+sh-sh-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu's age is "+ch);
	}

	public static void main(String[] args) {
		
		Q42Ages obj = new Q42Ages();
		obj.age(32,40);
	}
}