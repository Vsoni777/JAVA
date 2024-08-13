class Animal{
    String color="white";
}
class dog extends Animal{
    String color="Black";
    void show(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class superk {
    public static void main(String[] args) {
        dog d=new dog();
        d.show();
    }
    
}
