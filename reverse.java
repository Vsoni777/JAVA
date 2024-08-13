import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
       int e=0;
       int rem=0;
       int a;
        Scanner sc= new Scanner(System.in);
         a=sc.nextInt();//take input of number of reverse order

    while (a!=0) {
        rem=a%10;
        a=a/10;
        e=e*10+rem;
        //if we use print fun sout in th loop value give 332321 that is garbage
    }if (a==e) {
       System.out.println("hi"); 
    }
    System.out.println(e);        
    }
    
}
