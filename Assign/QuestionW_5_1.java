import java.util.Scanner;

public class QuestionW_5_1 {
    public static void main(String[] args) {
        String s[]={"sunday","monday","tuesday","Wanesday","thursday","friday","saturday"};
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter index value");
            int n=sc.nextInt();
            System.out.println(n+"inndex value"+s[n]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
