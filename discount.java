import java.util.Scanner;


public class discount {
    public static void main(String[] args) {
        int price,quantity,discount_price;
        Scanner sc = new Scanner(System.in);
        price=sc.nextInt();
        System.out.println("books price is: "+price);
        quantity=sc.nextInt();
        System.out.println("quantity of books: "+quantity);
        if (quantity<20) {
            System.out.println("discount is 5%");
            discount_price=((price*quantity)*5)/100;
            System.out.println("discount price is: "+discount_price);
            
        } else if(quantity<50) {
            System.out.println("discount is 10%");
            discount_price=((price*quantity)*10)/100;
            System.out.println("discount price is: "+discount_price);
            
        }else if(quantity<100){
            System.out.println("discount is 15%");
            discount_price=((price*quantity)*15)/100;
            System.out.println("discount price is: "+discount_price);
        }else if(quantity>=100){
            System.out.println("discount is 5%");
            discount_price=((price*quantity)*15)/100;
            System.out.println("discount price is: "+discount_price);
        }

        
    }
}
