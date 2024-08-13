import java.util.Scanner;
//lightspeed calculation
public class seven {
    public static void main(String[] args) {
        long days=1000;
         long distance,second;
        int lightspeed;
        Scanner c = new Scanner(System.in);
        lightspeed= c.nextInt();
        
        second=days*24*60*60;   //second convrte
        distance=lightspeed*second; //calculate distance
        System.out.println("second value: "+second);
        System.out.println("distence value: "+distance);
    }
    
}
