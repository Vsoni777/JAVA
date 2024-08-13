import java.util.Scanner;
public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          String a=new String();//create object
          String g=new String();
          a=sc.next();
          g=sc.next();
          System.out.println(a.hashCode());
          System.out.println(a.charAt(2));
          System.out.println(g.concat(a));
          System.out.println(a.toUpperCase());
          System.out.println(a.codePointAt(0));
          System.out.println(g.toLowerCase());

    }
    
}
