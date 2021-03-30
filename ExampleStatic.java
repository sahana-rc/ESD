/* Simple example to illustrate the static method*/

class ExampleStatic{
	int a = 10;
	//void display(int x,int y){
	static void display(int x,int y){ 
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
	
	}
	
	public static void main(String args[]){
	int x = 10;
	int y = 20;
	//ExampleStatic es = new ExampleStatic();
	//es.display(x,y);
	display(x,y);
	//System.out.println("a value is: "+es.a);
	}
}