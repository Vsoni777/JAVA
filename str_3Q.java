import java.util.Scanner;
/**
 * str_3Q
 */
public class str_3Q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        String array[]=new String[size];
        int tolen=0;
        for (int i = 0; i <array.length; i++) {//covent 1 index value as well
            array[i]=sc.next();
            tolen+=array[i].length();
            
             }
             System.out.println(tolen);
    }
}