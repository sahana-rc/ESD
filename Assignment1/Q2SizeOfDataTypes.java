/* Implement a JAVA program to check the default values of the Datatypes. */

class Q2SizeOfDataTypes{
	public static void main(String args[]){
		System.out.println("Size of int:"+ (Integer.SIZE/8)+"bytes");
		System.out.println("Size of long:"+ (Long.SIZE/8)+"bytes");
		System.out.println("Size of character:"+ (Character.SIZE/8)+"bytes");
		System.out.println("Size of float:"+ (Float.SIZE/8)+"bytes");
		System.out.println("Size of double:"+ (Double.SIZE/8)+"bytes");
	}
}