import java.util.Scanner;
class ValueScope{
	int id;
	String name;
public static void main(String [] arg){
	ValueScope t=new ValueScope();
	Scanner sc=new Scanner(System.in);
	t.id=sc.nextInt();
	t.name=sc.nextLine();
	System.out.println(t.id);
	System.out.println(t.name);

}
}