import java.util.Scanner;/**
 * factorial
 */
public class factorial {
    public static void fact(int n) {
       int fact1=1;
       if (n<0) {
        System.out.println("invalid num: "+n);
        return;
       }else{
        for(int i=n;i>=1;i--){  //decrease value by one by one
            fact1=fact1*i;
        }
        System.out.println("good choie");
    }
       System.out.println(fact1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
        
    }
}