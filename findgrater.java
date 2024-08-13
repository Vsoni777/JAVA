import java.util.Scanner;

/**
 * findgrater
 */
public class findgrater {
public static int Find(int a,int b) {
    return (a>b)?a:b;
}
    public static void main(String[] args) {
        int a,b;
        Scanner c = new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
       int d= Find(a,b);
       System.out.println("value: "+d);
    }
}