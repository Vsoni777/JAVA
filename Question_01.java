

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		String s[]= {"sunday","Monday","Tuesday","Wednesday","Thusday","Friday","Saturday"};
		Scanner sc=new Scanner(System.in);
		try {
			int n=sc.nextInt();
			System.out.println(n+"index value day is:"+s[n]);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
