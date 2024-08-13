import java.util.Scanner;
class A{
	 void show(){
System.out.println("animal");
	}
}
class B extends A{
	void show1(){
		System.out.println("it is dog");
	}
}
class C extends B{
	void show2(){
		System.out.println("it is not animal");
	}
}
class Multiplevel{
public static void main(String [] args){
	A a=new A();
	B b=new B();
	C c=new C();
	a.show();
	b.show();
	b.show1();
	c.show();
	c.show1();
	c.show2();
}
}