import java.util.Scanner;

interface inter {
    public void input();
    public void show();
    }
class b implements inter{
    String name;long salary;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter salary");
        salary=sc.nextLong();
    }
   public  void show(){
        System.out.println(name+" "+salary);
    }
}
/**
 * base
 */
public class base {

    public static void main(String[] args) {
        inter r = new b();
        r.input();r.show();
        
    }
}
