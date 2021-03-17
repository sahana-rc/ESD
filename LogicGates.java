class LogicGates{
//... - to pass variable length arguments in java
int or_gate(int in1,int in2){
	int a,b;
	a = in1;
	b = in2;
	int or_ans;
	or_ans = a | b;
	return or_ans;
}

int nor_gate(int in1,int in2){
	int a,b;
	a = in1;
	b = in2;
	int nor_ans;
	if(a == 0 && b == 0)
	nor_ans = 1;
	else
	nor_ans = 0;
	
	return nor_ans;
}

public static void main(String args[]){
		
	int inp1=1;
	int inp2=0;
		
	LogicGates lg = new LogicGates();
	int result_or = lg.or_gate(inp1,inp2);
	int result_nor = lg.nor_gate(inp1,inp2);
	
	System.out.println("Result of or gate is:"+result_or);
	System.out.println("Result of nor gate is:"+result_nor);
	
}

}

