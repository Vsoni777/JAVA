import java.io.FileInputStream;
public class Fileinputexa{
	public static void main(String[] args){
	 try{
		//FileInputStream fin=new FileInputStream("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");
	    FileInputStream fin=new FileInputStream("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");    

		int i=fin.read();
		System.out.println((char)i);
	 }catch(Exception e){
			System.out.println(e);
		}
	}
}