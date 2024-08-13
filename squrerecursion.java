public class squrerecursion {
     public static int calsqure(int x,int n) {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int squre_n=calsqure(x, n-1);
        int sq_num=x*squre_n;
        return sq_num;
    }
    public static void main(String[] args) {
        int squre=calsqure(2, 5);
        System.out.println(squre);
    }
}
