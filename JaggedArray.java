import java.util.Scanner;
class JaggedArray{
public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	int a[][]=new int[3][];
	a[0]=new int[4];
	a[1]=new int[3];
	a[2]=new int[2];//creat odd number of 2d array
	for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
	a[i][j]=s.nextInt();
	}
	}
	for(int i=0;i<a.length;i++){
	for(int j=0;j<a[i].length;j++){
	System.out.print(a[i][j]);
	}
	System.out.println();
	}
}
}