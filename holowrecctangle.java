import java.util.Scanner;

public class holowrecctangle {
    public static void main(String[] args) {
        int row,column;
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();       
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1||j==1||i==row||j==column){
        System.out.print("*");
                }else{
                    System.out.print(" ");
                }     
               }
               System.out.println();
       }
    }
    
}
