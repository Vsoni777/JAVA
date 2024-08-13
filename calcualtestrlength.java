import java.util.Scanner;

public class calcualtestrlength {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();//inputsize 
        String []name=new String[size];//to take size of array 
        int total_length=0;
        for(int i=0;i<size;i++){
            name[i]=sc.next();
            total_length+=name[i].length();//calculate array length
        } 
        System.out.println(total_length);     
    }
}
