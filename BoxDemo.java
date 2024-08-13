import java.util.Scanner;
class Box{
double l,b,h;
	Box(){
		l=0;b=0;h=0;
	}
	Box(double x,double y,double z){
		l=x;b=y;h=z;
	}
   void show(){
	   System.out.println("length :"+l);
	   System.out.println("breath :"+b);
	   System.out.println("height :"+h);
   }
   void volume(){
	   double u;
	   u=l*b*h;
	   System.out.println("volumne :"+u);
   }
   void volume(double u){
	   double x=l*b*h;
	   System.out.println("volume of cube"+x);
   }
}
class BoxDemo{
	public static void main(String []args){
	Box b1=new Box();
	Box b2=new Box(4,5,6);
	b1.show();
	b2.show();
	b1.volume();
	b2.volume();
	}
}