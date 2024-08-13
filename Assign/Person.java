import java.util.Scanner;
class Person{
	String name;
	int age;
	Person(){
		Scanner s=new Scanner(System.in);
		name=s.nextLine();
		System.out.println(name+" should be 18 must.");
		}
	Person(String name1,int age2){
		name=name1;
		age=age2;
	}
	void display(){
		System.out.println("your name is "+name+" and age is "+age);
	}
		
	public static void main(String args[]){
		Person a=new Person();
		Person b=new Person("vivek",23);
		b.display();
		
	}
}