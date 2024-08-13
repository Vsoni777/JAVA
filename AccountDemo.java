import java.util.Scanner;//when object are created acc_no is increase
class AccountDemo{
	int acc_no;
	String name;
	int bal;
	static int temp=100;
AccountDemo(){
		temp++;
		acc_no=temp;
		}
	
    void open(){
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter Account holder name:");
	 name=s.nextLine();
	 System.out.println("enter balance");
	 bal=s.nextInt();
	
	}

void enq(){
	System.out.println(acc_no+" "+name+" "+" "+bal);
}
	public static void main(String args[]){
		AccountDemo a1=new AccountDemo();
		a1.open();
		AccountDemo a2=new AccountDemo();
		a2.open();
		AccountDemo a3=new AccountDemo();
		a3.open();
		a1.enq();
		a2.enq();
		a3.enq();
	}
}