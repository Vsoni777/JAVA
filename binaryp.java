

public class binaryp {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2;j++){
                int sum =i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
