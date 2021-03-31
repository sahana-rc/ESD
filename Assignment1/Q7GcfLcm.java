/* Implement a JAVA program to find the GCF  and LCM of given numbers.  */

class Q7GcfLcm {

  public static void main(String[] args) {

    int n1 = 24, n2 = 36, gcf = 1;

    for(int i = 1; i <= n1 && i <= n2; i++) {
      
      if(n1 % i == 0 && n2 % i == 0)
        gcf = i;
    }
	
	System.out.printf("The GCF of %d and %d is %d.", n1, n2, gcf);
	System.out.println("\n");
    int lcm = (n1 * n2) / gcf;
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}