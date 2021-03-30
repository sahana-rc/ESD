/* Simple example to illustrate the static method*/

class ExampleStatic1{
	static int a = 10;
	void display(){
	//static void display(int x,int y){ 
		System.out.println("a value:"+a);

	}
	
	//static block, it will be executed before main, once
	static{System.out.println("Inside static block");a=20;}
	
	//constructor, here we override the default constructor
	ExampleStatic1(){
		a++;
	}
	
	public static void main(String args[]){
	
	ExampleStatic1 es1 = new ExampleStatic1();
	es1.display();
	
	ExampleStatic1 es2 = new ExampleStatic1();
	es2.display();
	
	//display(x,y);
	//System.out.println("a value is: "+es.a);
	}
}