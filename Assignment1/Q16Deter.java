/* Find the determinant, for the quadratic equations.  */
class Q16Deter{
	public static void main(String[] args) {

    // value a, b, and c
    double a = 2.3, b = 12, c = 5.6;
    
    // calculate the determinant (b2 - 4ac)
    double determinant = b * b - 4 * a * c;
	System.out.println("The Determinant is: "+determinant);
}
}