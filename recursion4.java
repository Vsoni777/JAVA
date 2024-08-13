
public class recursion4 {
    public static void  Permutation(String str,permt) {
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            string newstr=str.substring(0, i)+str.substring(i+1);
            calpermutation(newstr,permt+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        Permutation(str,"");
    
    }
    
}
