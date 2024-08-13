import java.util.Scanner;
class Lucas{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	int n1=2,n2=1;
	int n3=0;
	System.out.println(n1+""+n2);
	System.out.println("Enter number:");
	int num=s.nextInt();
	for(int i=2;i<=num;i++){
		n3=n1+n2+n3;
		System.out.println(n3);
		n1=n2;
		n2=n2+n1;

	}
}
}