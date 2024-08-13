class VariableScope{
	int a=10;//we want to access it by create reference of that class
	static int b=20;
	public static void main(String [] args){
		VariableScope s=new VariableScope();
	int c=30;
	System.out.println(" "+s.a+" "+b+" "+c);
	}
}