interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2){
		return v1+v2;
	}
	public void print() {
		System.out.println("This is Realcal!!");
	}
}
class AdvancedPrint implements Printable{
	public void print() {
		System.out.println("This is Realcal!!");
	}
}
public class InterfaceApp {
	public static void main(String[] args) {
		RealCal c = new RealCal();
		Printable d = new AdvancedPrint();
		
		System.out.println(c.sum(2,1));
		c.print();
		System.out.println(c.PI);
		
		d.print();
	}
}
