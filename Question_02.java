class Demo{
	
	int y=10;
	Demo(){//5
		this.m1();
	}
	void m1(){//6
		Demo a=new Demo();
		System.out.println(y);
	}
}
class Question_02 extends Demo{
	int x=10;
	void m1(){
		System.out.println(x);
	}
	Question_02(){}//4
	public static void main(String[] args){//1
		System.out.println("Hello Wrold");//2
		new Question_02();//3
	}
}