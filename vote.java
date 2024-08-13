import java.util.Scanner;

public class vote {
    public static int vote1(int age) {
        if (age>=18) {
            System.out.println("you can vote");
            return 1;
        } else {
            System.out.println("you may not");
            return 0;
        }
    }
    public static void main(String[] args) {
        int age;
        Scanner a = new Scanner(System.in);
        age=a.nextInt();
      int g = vote1(age);
        System.out.println("result: "+g);
    }
    
}
