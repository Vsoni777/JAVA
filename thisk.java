class A{
    int rollno;String name;
    A(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
        
    }
    void disply(){
        System.out.println(name+" "+rollno);
    }


}
/**
 * inher
 */
public class thisk {

    public static void main(String[] args) {
        A a=new A(102,"vivek");
        a.disply();
    }
}