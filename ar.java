import java.util.Scanner;
//for each loop visit one value at a time

public class ar {
    /**
     * @param args
     */
    public static void main(String[] args) {
       int a[]=new int[4];
       Scanner sc = new Scanner(System.in);
        for(int x:a){
            x=sc.nextInt();
            System.out.print(x);
        }
    }
    
}
