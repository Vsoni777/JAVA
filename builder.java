/**
 * builder
 */
public class builder {

    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Tony");
        System.out.println(a);
        System.out.println(a.charAt(3));
        a.setCharAt(3,'e' );
        System.out.println(a);
        a.insert(2,'n');
        System.out.println(a);
        a.delete(3,5);
        System.out.println(a);
        a.append('y');
        a.append(1);
        System.out.println(a);
        System.out.println(a.length());
        for(int i=0;i<a.length()/2;i++){
            int front=i;
            int end=a.length()-1-i;
            char frontchar=a.charAt(front);
            char endchar=a.charAt(end);
            a.setCharAt(front, endchar);
            a.setCharAt(end, frontchar);

        }
        System.out.println(a);
    }
}