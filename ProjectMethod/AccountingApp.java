class Accounting {
	public double valueOfSupply;
	public static double vatRate = 0.1;

	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class AccountingApp {

	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		Accounting a2 = new Accounting(15000.0);

		System.out.println("valueOfSupply : " + a1.valueOfSupply);
		System.out.println("valueOfSupply : " + a2.valueOfSupply);
		System.out.println("vat : " + a1.getVAT());
		System.out.println("vat : " + a2.getVAT());
		System.out.println("total : " + a1.getTotal());
		System.out.println("total : " + a2.getTotal());

	}

}
