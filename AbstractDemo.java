import java.util.Scanner;
abstract class Demo{
	abstract void add();
	abstract void sub();
	abstract void div();
	abstract void multi();
}
class B extends Demo{
	void add(){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("sum of number is:"+c);
	}
	void sub(){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a-b;
		System.out.println("sub of number is:"+c);
	}
	void div(){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a/b;
		System.out.println("division of number is:"+c);
	}
	void multi(){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a*b;
		System.out.println("multiplication of number is:"+c);
	}	
}
class AbstractDemo{

	public static void main(String [] args){
		B x=new B();
		x.add();
		x.multi();
		x.sub();
		x.div();
	}
}