import java.util.Scanner;

/**
 * oddsum
 */
public class oddsum {

    public static int sum(int v) {
        int Sum=0;
        for(int i=1;i<=v;i++){
            System.out.println("value:outer "+i);
            if((i%2)!=0){
                System.out.println("value: inside"+i);
                // Sum+=i;
                Sum+=i;
            }
            
        }
        // Sum;
        return Sum;
    }
    public static void main(String[] args) {
        int v;
        Scanner sc = new Scanner(System.in);
        v=sc.nextInt();
      int b= oddsum.sum(v);
        System.out.println(" "+b);
    }
}