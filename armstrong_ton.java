import java.util.Scanner;

/**
 * armstrong_ton
 */
public class armstrong_ton {

    public static void main(String[] args) {
        int n,num,rem,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range of number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=0;
            for(num=i;num!=0;num=num/10){
                rem=num%10;
                sum=sum+(rem*rem*rem);
              }
              if(sum==i){
                System.out.println(i+" is armstrong ");
              }
        }
        
        
    }
}