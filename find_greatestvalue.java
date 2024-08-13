/**
 * change_string
 */
import java.util.Scanner;
public class find_greatestvalue {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a>b) {
            if(a>c){
                System.out.println(a);
            }
            
        } else if (b>a) {
            if (b>c) {
                System.out.println(b);
            }
        }else if(c>a){
            if(c>b){
                System.out.println(c);
            }
        }

    }
}