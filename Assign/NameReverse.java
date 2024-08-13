import java.util.Scanner;
class NameReverse{
public static void main(String [] args){
	Scanner c=new Scanner(System.in);
	char ch;
	String name,nstr="";
	 name=c.nextLine();
	for(int i=0;i<name.length();i++){
		ch=name.charAt(i);
		nstr=ch+nstr;
	}
	System.out.print(nstr);
	}
}