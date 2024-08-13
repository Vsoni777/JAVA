import java.util.Scanner;
class TableofAnynum{
	public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter Number :");
	int num=s.nextInt();
	System.out.println(num+"table is:");
	for(int i=1;i<=10;i++){
	System.out.println(i*num);
		}
	}
}