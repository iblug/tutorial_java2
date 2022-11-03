
public class WhyMethod {

	public static void main(String[] args) {
					// 인자 argument
		printTwoTimes("a", "-");
		printTwoTimes("b", "*");
		printTwoTimes("a", "=");
		printTwoTimes("v", "##");

	}
									// 매개변수 parameter
	public static void printTwoTimes(String text, String deli) {
		System.out.println(deli);
		System.out.println(text);
		System.out.println(text);
	}

}
