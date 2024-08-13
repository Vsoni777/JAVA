public class CommandLine {//run in terminal
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        double per=(a+b+c)*100/300;
        System.out.println("percentage is:"+per);
    }
    
}
