import java.util.Scanner;
class DecreaseArray{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(a[i]+" ");
		}
	}
}