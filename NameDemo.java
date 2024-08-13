class Stat{
int id;
static int count;
 Stat(){
 count++;
 id=count;
   }
   void show(){
   System.out.println("ID"+id);
   System.out.println("Count:"+count);
   }
 }
class NameDemo{
public static void main(String [] args){
	Stat a=new Stat();
	a.show();
	Stat b=new Stat();
	Stat c=new Stat();
	a.show();
	b.show();
	c.show();
}
}