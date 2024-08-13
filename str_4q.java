import java.util.Scanner;
public class str_4q {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.next();
    String result="";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='@'){//break at this position
            break;
        }else{
            result+=str.charAt(i);
        }
    }
    System.out.println(result);
    
}    
}
