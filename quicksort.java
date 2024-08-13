/**
 * quicksort
 */
public class quicksort {
    public static int partition(int a[],int low,int high) {
        int pivot=a[high];//8
        int i=low-1;//-1
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;//0 1
                int temp=a[i];
                a[i]=a[j];//6
                a[j]=temp;
            }
          }
        i++;
        int temp=a[i];
        a[i]=pivot;
        a[high]=temp;
        return i;
        
    }
    public static void  quicksort(int a[],int low,int high) {
        if(low<high){
            int pivot=partition(a,low,high);
            quicksort(a, low, pivot-1);
            quicksort(a, pivot+1, high);
        }
        
    }

    public static void main(String[] args) {
        int a[]={6,3,9,5,2,8};
        int n=a.length;
        quicksort(a,0,n-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}