import java.util.Scanner;

class Animal{
    void show(){
        System.out.println("enter animal details:");
    }
}
class Dog extends Animal{
    void disply(){
        Scanner sc = new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println("dog is black color and breed is"+name);
    }
}




public class singleinher {
    public static void main(String[] args) {
        Dog s=new Dog();
        s.show();s.disply();
    }
    
}
