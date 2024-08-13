import java.io.*;

class BuffeerFileRe {
	public static void main(String[] args) throws Exception
	{
	File file=new File("C:/Users/vivek/OneDrive/Desktop/java program/text/textout.txt");
	BufferedReader br=new BufferedReader(new FileReader(file));
	String str;
	while((str=br.readLine())!=null){
		System.out.println(str);
		}
	}
}