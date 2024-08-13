import java.util.Scanner;

/**
 * findday
 */
public class findday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days=sc.nextInt();
        int num;
        num=days%7;//if want to num value first we want assign it variable
        System.out.println(" "+num);

        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wnesday");
            break;
            case 4:
            System.out.println("thresday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("satrday");
            break;
            case 7:
            System.out.println("sunday");
            default:
            System.out.println("invlid");
                break;
        }
            
        }
    }
