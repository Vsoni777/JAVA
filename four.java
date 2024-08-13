import java.util.Scanner;

 //arthmetic operation
public class four {

    public static void main(String[] args) {
        int a,b,c,num;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        num=sc.nextInt();
        switch (num) {          //switch case for user choice
            case 1:
                c=a+b;
                System.out.println("addition: "+c);
                break;
            case 2:
                c=a*b;
                System.out.println("multipication: "+c);
                break;
            case 3:
                c=a/b;
                System.out.println("divition: "+c);
                break;
            case 4:
                c=a%b;
                System.out.println("reminder: "+c);
                break;
            case 5:
                c=a-b;
                System.out.println("subtraction: "+c);
            default:
                System.out.println("you have wrong choice");
                break;
        }
        
    }
}