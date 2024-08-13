import java.io.FileInputStream;
public class FileInputexa_2{
	public static void main(String[] args){
	 try{
		FileInputStream fin=new FileInputStream("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");    
		int i=0;
		while((i=fin.read())!=-1){
			System.out.println((char)i);
			}
			fin.close();
		}catch(Exception e){
		System.out.println(e);
		}
	}
}