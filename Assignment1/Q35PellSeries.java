/* Implement a Java program to print the first 15 numbers of the Pell series. */
/*
Pn = 2*Pn-1 + Pn-2 
with seeds P0 = 0 and P1 = 1
*/

class Q35PellSeries{

	static void pellSeries(int num){
		
		int first = 0, second = 1;
		for(int i=0;i<num;i++)
		{
			int t = (2*second) + first;
			System.out.println(t);
			first = second;
			second = t;	
		}
	}

	public static void main(String args[]){
	
		pellSeries(15);
		//System.out.println(pellSeries(4));
		
	}

}