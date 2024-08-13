import java.util.Scanner;
class BasicSalary{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter baisc Salary");
		int b_salary=s.nextInt();
		float hra,da;
		double t_salary;
		if(b_salary<1500){
			hra=(b_salary*10)/100;
			da=(b_salary*90)/100;
			System.out.println("Hra is :"+hra);
			System.out.println("Da is :"+da);
			t_salary=b_salary+hra+da;
			System.out.println("total salary is:"+t_salary);
			}
		if(b_salary>1500){
			hra=500;
			da=(b_salary*98)/100;
			System.out.println("Hra is :"+hra);
			System.out.println("Da is :"+da);
			t_salary=b_salary+hra+da;
			System.out.println("total salary is:"+t_salary);
		}
	}
}