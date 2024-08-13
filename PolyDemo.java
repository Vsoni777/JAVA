class Test{
void run(){
	System.out.println("that's parent clock");
	}
}

class PolyDemo extends Test{
void run(){
	super.run();//Super key with method which is overridden
	System.out.println("that's chlid block");
	}
	public static void main(String [] args){
	PolyDemo s=new PolyDemo();
	s.run();
	}
}