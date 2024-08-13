interface Squre{
	int p=2;
	 double Squre2(double x);
}
class SquImp implements Squre{
	public double Squre2(double x){
		return Math.pow(x,p);
	}
}
class Squre1{
	public static void main(String [] args){
		SquImp s=new SquImp();
		System.out.println("value i power"+s.Squre2(5));
	}
} 