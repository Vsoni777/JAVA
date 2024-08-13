import java.util.Scanner;
class palidrome{
    public static void main(String[] args) {

	int n,i,rem,rev=0;
	Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    
	for(i=n;i!=0;i=n/10){4
	    rem=i%10;
		rev=(rev*10)+rem;
	}if(rev==n){
		System.out.println(rev);
	}else{
	System.out.println("not");
	}
}
}