public class squrelogn {
    public static int squre(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return squre(x,n/2)*squre(x,n/2);
        }else{
            return squre(x,n/2)*squre(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        int num=squre(2,5);
        System.out.print(num);
    }
    
}
