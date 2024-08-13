import java.util.Scanner;
class Person{
	String name;
	String address;
	void getdata(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name:");
	name=sc.nextLine();
	System.out.println("Enter your address");
	address=sc.nextLine();
	}
	void show(){
	System.out.println("My name is:"+name);
	System.out.println("I am live in:"+address);
	}
}
class Student extends Person{
	int roll_no;
	int marks;
	void getdata1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno: ");
		roll_no=sc.nextInt();
		System.out.println("Enter marks: ");
		marks=sc.nextInt();
	}
	void show1(){
		System.out.println(" your Rollno is: "+roll_no);
		System.out.println("you get marks is: "+marks);
	}
}
class Employee extends Person{
	int empno;
	int salary;
	void getdata2(){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Employee number: ");	
	empno=sc.nextInt();
	System.out.println("Enter Salary: ");
	salary=sc.nextInt();
	}
	void show2(){
     System.out.println("Employee number is: "+empno);
     System.out.println("Employee salary is: "+salary);
	}
}
class Manager extends Employee{
	int deptno;
	String dept_name;
	void getdata3(){
	Scanner x=new Scanner(System.in);
    System.out.println("Enter deptno: ");	
	deptno=x.nextInt();
	System.out.println("Enter Department name: ");//can't access
	dept_name=x.next();	
	}
	void show3(){
	System.out.println("Dept_no"+deptno);	
	System.out.println("Department name is:"+dept_name);
	}
}
class TestDemoI{
	public static void main(String [] args){
	Person a=new Person();
	Student b=new Student();
	Employee c=new Employee();
	Manager d=new Manager();
	a.getdata();
	a.show();
	System.out.print("\n\n\n");
	System.out.println("Inside Student class");
	b.getdata();
	b.getdata1();
	b.show();
	b.show1();
	System.out.print("\n\n\n");
	System.out.println("Inside Employee class");
	c.getdata();
	c.getdata2();
	c.show();
	c.show2();
    System.out.print("\n\n\n");
	System.out.println("Inside Manager class");
	d.getdata();
	d.getdata2();
	d.getdata3();
	d.show();
	d.show2();
	d.show3();
	}
}