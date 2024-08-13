import java.util.Scanner;
public class funcallsumvalue {
    public  static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       c=sum(a,b);
        System.out.println("value of c 5"+c);
    }
    
}
