import java.util.Scanner;
public class average {
    public static int avg(int a,int b,int c) {
                return (a+b+c)/3;
         }

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       int A= avg(a,b,c);
        System.out.println("Avg is : "+A);
    }
}