import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Next {
    public static void main(String[] args)throws IOException{
        int a,b;
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(i);
       System.out.println("enter first number");
         a=Integer.parseInt(br.readLine());
         System.out.println("enter second number");
         b=Integer.parseInt(br.readLine());

        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    

    
}
}
