import  java.util.Scanner;
class ReverseDemo{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int a[][]=new int[3][3];
System.out.println("Input:");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
			a[i][j]=s.nextInt();
			}
	 }
System.out.println("Output:");
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
	 }
System.out.println("Reverse order:");
	for(int i=0;i<3;i++){
	for(int j=2;j>=0;j--){
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
	 }
  }
}