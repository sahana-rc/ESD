/* Implement a JAVA program to find the Mean of given 5 numbers */
import java.util.Arrays; 
  
class Q14Mean { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 20, 32, 45, 78, 55 };
		float sum = 0;
		float mean;
		for(int i=0;i<intArr.length;i++){
			sum += intArr[i];	
		}
		mean = sum/intArr.length;
		System.out.println("Mean is:"+mean);
	}	
}  