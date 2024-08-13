
public class findfibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1;
        System.out.print(" "+n1);
        find(n1,n2);
    }
        public static int find(int n1,int n2) {
            
        
        for(int i=1;i<=10;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
             }
             return 1;
        }
    }
    
