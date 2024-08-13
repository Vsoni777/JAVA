 import java.util.Scanner;
 public class circle {
    public static double d(Double radius) {
        double c=(3.14*radius*radius);
        return c;
    }
    public static void main(String[] args) {
        double radius;
        Scanner a = new Scanner(System.in);
        radius=a.nextInt();
        double s=d(radius);  
        System.out.println("circle: "+s);     
    }
}
