import java.io.*;
class Deletefile{
	public static void main(String[] args){
			File file=new File("C:/Users/vivek/OneDrive/Desktop/java program/text/textdov.txt");
			System.out.println("file exists"+file.exists());
		if(file.delete()){
			System.out.println("delete successfully");
		}else{
			System.out.println("not");
		}
	}
}