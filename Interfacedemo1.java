
interface Demo{
	void show();
	
}



 class Interfacedemo1 implements Demo{
	 public void show(){
		 System.out.println("in show");
	 }
	 public static void  main(String[] args){
		 Interfacedemo1 a=new Interfacedemo1();
		 a.show();
		 //a.display();
	 }
 }