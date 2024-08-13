import java.util.Scanner;
class Testd{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int a[][]=new int[3][];
		a[0]=new int[1];
		a[1]=new int[2];
		a[2]=new int[3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}