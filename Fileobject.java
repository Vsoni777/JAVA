import java.io.File;

class Fileobject{
  public static void main(String[] args){
	  try{
	  File a=new File("C:/Users/vivek/OneDrive/Desktop/java program/text/textdov.txt");
	  System.out.println("return file name"+a.getName());
	  System.out.println("return file full  path"+a.getPath());
	  System.out.println("return file parent path"+a.getParent());
	  System.out.println("return file exist"+a.exists());
	  
	   a.createNewFile();
	   	  System.out.println("after creation"+a.exists());

	  }catch(Exception e){
		  System.out.println(e);
	  }
  }
}