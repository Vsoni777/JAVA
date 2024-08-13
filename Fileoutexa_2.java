import java.io.FileOutputStream;
public class Fileoutexa_2{
	public static void main(String[] args){
		try{
		FileOutputStream fout=new FileOutputStream("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");
		String msg="Welcome to dubai....99.";
		byte[] b=msg.getBytes();
		fout.write(b);
		fout.close();
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
}