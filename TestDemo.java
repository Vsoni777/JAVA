import java.util.Scanner;
class ConvertHourtoSec{
public static void main(String [] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter hour:");
    int hour=s.nextInt();
	int mint=hour*60;
	System.out.println("converted value in minit:"+mint);
	int sec=mint*60;
	System.out.println("converted value in second:"+sec);
	System.out.println("Now converted value in reverse");
	mint=(int)sec/60;
	System.out.println("converted value in second:"+mint);
    hour=(int)mint/60;
	System.out.println("converted value in second:"+hour);
 }
}