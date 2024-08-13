import java.util.Scanner;

public class rev {
 public static void main(String[] args) 
{
	int i,rev=0,rem,n;
	Scanner e= new Scanner(System.in);
    n=e.nextInt();
    
	rem=n%10;
	System.out.println(rem);
	rev=(rev*10)+rem;
	System.out.println(rev);
}

    
}
