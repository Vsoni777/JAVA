

class A extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			for(int j=2;j>=i;j--) {
				try {
				Thread.sleep(2000);
				
				System.out.print("*");
				}catch(Exception e) {}
			}
			System.out.println();
		}
	}
}
public class Question1 {
	public static void main(String[] args) {
		A a=new A();
		a.start();
	}
}

