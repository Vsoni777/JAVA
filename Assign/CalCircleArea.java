import java.util.Scanner;
class CalCircleArea{
	float r;
	double area;
	public void init(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of radiuse:");
		r=s.nextFloat();
	}
	public void calc(){
		area=3.14*r*r;
	}
	public void display(){
		System.out.println(area);
	}
	public static void main(String args[]){
		CalCircleArea s=new CalCircleArea();
		s.init();s.calc();s.display();
	}
}