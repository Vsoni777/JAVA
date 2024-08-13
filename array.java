import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        int []a=new int[6];
        Scanner sc = new Scanner(System.in);  
        //input array element 
        int x=a[0];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        a[3]=sc.nextInt();
        a[4]=sc.nextInt();
        for(int i=0;i<5;i++){
            
            if (a[i]<x) {
                x=a[i];
            System.out.println("found the element i :"+x);//find the index of array element
            }else{
                continue;
            }

        }

        //if we entry 4 time array value in this loop index full msg display
        
        
        
    }
    
}
