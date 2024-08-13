import java.util.Scanner;
class Base{
	double dim1,dim2;
	Base(){
		dim1=0;
		dim2=0;
	}
	Base(double x,double y){
		dim1=x;
		dim2=2;
	}
	void area(){
		System.out.println("Invalid output");
	}
}
class Base1 extends Base{
	Base1(){
		super();
	}
	Base1(double x,double y){
		super(x,y);
	}
	void area(){ 		
		double a=dim1*dim2;
		System.out.println("aera is:"+a);
	}
}
class PolymorphismDemo{
	public static void main(String [] args){
		Base b;
		Base b3=new Base();
		Base1 b1=new Base1(5,2);
		Base1 b2=new Base1();
		b=b1;
		b.area();
		b=b2;
		b.area();
		b3.area();
	}
	
}