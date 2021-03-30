
//normal class to display two variables a and b
class A{
	int a = 10;
	int b = 20;
	void display()
	{
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
}

class Amain{
	public static void main(String args[]){
	
	String a[] = {"Hello","World"}; //creating a string array to pass as argument to main
	A obj = new A();
	Amain Am = new Amain();
	obj.display();
	Am.main(a); //recursive call? whether it will loop or only once?
	System.out.println(args[0]); //what is the value of args[0]?
	
	
	}


}