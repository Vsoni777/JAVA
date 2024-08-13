/**
 * Recursion1
 */
public class Recursion1 {
    public static void printnum(int i,int n,int fact) {
        //if we declare sum+=i this it increase the value sum+10=55
        if(i==n){
            fact*=i;//this behave it's condition 55+10=65
            System.out.println(fact);
            return;//return main
        }
        fact*=i;
        printnum(i+1, n, fact);
    }

    public static void main(String[] args) {
        printnum(1,5,1);//method is static so we donot need to create obj and obj is calling with method
    }
}