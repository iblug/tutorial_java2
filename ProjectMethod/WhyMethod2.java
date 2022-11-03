import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod2 {

	public static void main(String[] args) throws IOException {

		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("outPut.txt");
		fw.write(twoTimes("b", "*"));
		fw.close();
//		Email.send("eeblug@a.com", "Two Times", twoTimes("cc", "^^"));
		
	}
	public static String twoTimes(String text, String deli) {
		String out = "";
		out = out+deli+"\n";
		out = out+text+"\n";
		out = out+text+"\n";
		
		return out;
	}
	

}
