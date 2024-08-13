class PloyDemo{
 void show(){
 System.out.println("1");
 }
 void show(){          //give error
 System.out.println("2");
 }
 public static void main(String[] args){
 PloyDemo a=new PloyDemo();
 a.show();
 }
}