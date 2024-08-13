import java.util.Scanner;

public class five {                 //uniary operation for comparision
   /**
 * @param args
 */
public static void main(String[] args) {
    int a,b;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt(); //input the value
    if (b>a&&b!=a) { //arthmetic logical
        System.out.println("vaule: "+b);   
    } else if(a==b){
        System.out.println("both number are equ6le "+a);
    }
    ++a;//output 6
    System.out.println("increse the value of a :"+a);
    --b;//output 4
    System.out.println("decrease the value of b: "+b);
     } 
}
