/* Implement a Java program to display first 10 Fermat numbers */

/* 2^k + 1 should be prime and k should be power of 2 */

/* to check whether number is power of 2 
	2^k = num
*/

class Q31FermatNumber{

	static boolean isPowerOf2(int n){
		
		if(n == 1)
			return true;
		
		for(int i=1;i<=(n/2);i++)
			if(Math.pow(2,i) == n)
				return true;
		return false;
	}

	static boolean isPrime(int num){
		
		if(num == 2)
			return true;

		for (int i=2; i<Math.sqrt(num);i++)
				if((num%i) == 0)
					return false;
		return true;
	}

	public static void main(String args[]){
		
		int i = 1;
		
		int cnt = 0;
		
		while(cnt <= 10)
		{
			double x = Math.pow(2,i) + 1;
			
			if(isPrime((int)x))
				if(isPowerOf2(i))
					{
						System.out.println((int)x);
						cnt++;
					}
			i++;
		}

	}
}