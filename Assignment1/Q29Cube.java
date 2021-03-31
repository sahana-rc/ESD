/* Implement a Java program to check a number is a cube or not. */

import java.util.Scanner;

class Q29Cube{   
    // Function to check if a number
    // is a perfect Cube or not
    static void perfectCube(int N)
    {
        int cube;
     
        // Iterate from 1-N
        for (int i = 0; i <= N; i++) {
     
            // Find the cube of
            // every number
            cube = i * i * i;
     
            // Check if cube equals
            // N or not
            if (cube == N) {
                System.out.println("Yes");
                return;
            }
            else if (cube > N) {
                System.out.println("NO");
                return;
            }
        }
    }
     
    // Driver code
    public static void main (String[] args)
    {
        Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number to check whether it is cube or not");
		
		int inputNumber = obj.nextInt();
     
        // Function call
        perfectCube(inputNumber);
 
    }
}