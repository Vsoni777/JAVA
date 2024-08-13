public class Bitwise {
    public static void main(String[] args) {
        /*int n=2,i=1;
        System.out.println((n<<i));
        System.out.println((n>>i));
        
        System.out.println((n&i));0010+0001=0
        System.out.println((n|i));0010+0001=3
        */
        int x=5,pos=3;
        int bitmask=1<<pos;//8
        if((bitmask&x)==0){
            System.out.println("bit is zero");
        }else
        System.out.println("not");
        int num=bitmask|x;
        System.out.println(" "+num);
        
     
     
    }
    
}
