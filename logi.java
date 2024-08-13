import java.util.Scanner;

public class logi {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();//4
        b=sc.nextInt();//5
        System.out.println((a&b));//out put four
        System.out.println((a|b));//output 5
        System.out.println((a==b));//false
        System.out.println((a<b));//true
        System.out.println(a>b);//false
        
        
    }
    
}
