/**
 * number_v
 */
public class number_v {
    static int b=21;//static varible create class aera,but outside of boby and method
    
         int c=34;//instance variable can be declare in method area
    

    public static void main(String[] args) {
        int a=22;//local variable declare in boby or main aera
        System.out.println(a);
        System.out.println(b);
        number_v sc = new number_v();/*to access the instance we want to create class object
        in this new object creation sc.c accessable*/
        sc.c++;
         System.out.println((sc.c));
    }
}