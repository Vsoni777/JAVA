import java.util.Scanner;

public class squre {
    public static int  fun(int x,int n) {
        int  pow=1;
        for(int i=1;i<=n;i++){
            pow*=x;
        }
        return pow;
    }
    public static void main(String[] args) {
        int x,n;
        Scanner a= new Scanner(System.in);
        x=a.nextInt();
        n=a.nextInt();
    int  h= fun(x,n);
      System.out.println("squreroot is: "+h);
        
    }
    
}
