import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){  //if we decreasement triangle base print upside
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
