public class str2 {
    public static void main(String[] args) {
        String name1="tony";
        String name2="tony";
        if(name1.equals(name2)){//checking equlity
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
        if(name1==name2){
            System.out.println("both are same");
        }else{
            System.out.println("both are not same");
        }
        if(new String(name1)==new String(name2)){
            System.out.println("boht are same");
        }else{
            System.out.println("not");
        }
    }
    
}
