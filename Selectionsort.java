import java.util.Scanner;
class Selectionsort{
    public static void main(String[] args) {
        int i,j,t;
        int a[]={12,4,6,89,45};
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++){
          //  a[i]=sc.nextInt();
            System.out.print(" "+a[i]);
        }
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(a[i]>a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println();
        for(i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
        
    }
}