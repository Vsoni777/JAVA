 
 import java.io.FileOutputStream;  

 public class Fileoutputexa{
	public static void main(String[] args){
		try{
			FileOutputStream obj=new FileOutputStream("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");
			obj.write(46);
			obj.close();
			System.out.println("Success in file store object");
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
 
 }