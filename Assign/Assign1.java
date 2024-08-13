import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assign1 {
	public static void main(String []args) throws IOException{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		System.out.println("Eter first number:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Eter second number:");
		int b=Integer.parseInt(br.readLine());
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
	}
	

}

