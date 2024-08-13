/**
 * diamondp
 */
public class diamondp {

    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int space=5;space>=i;space--){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int space=5;space>=i;space--){
                System.out.print("*");
            }
            for(int j=(2*i-1);j>=1;j--){
            System.out.print(" ");
            }
            System.out.println();
            }
        
    }
    
           
    }
