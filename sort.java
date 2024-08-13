/**
 * sort
 */
public class sort {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        for(int i=0;i<n;i++){
        
        int temp;
        for(int i=0;i<n;i++){
            temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        
        }
        for (int g : a) {
            System.out.print(" "+g);
            
        }
    }
}
}
