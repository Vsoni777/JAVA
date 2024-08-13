public class Bubblesort {
    public static void main(String[] args) {
        int i,j,t;
        int a[]={12,4,6,89,45};
        
        for(i=0;i<5;i++){
          //  a[i]=sc.nextInt();
            System.out.print(" "+a[i]);
        }
        for(i=0;i<5;i++){
            for(j=0;j<4-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println();
        for(i=0;i<5;i++){
            System.out.print(" "+a[i]);
        }
    }
    
}
