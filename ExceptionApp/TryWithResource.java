import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		// try with resource statements
		try(FileWriter f = new FileWriter("data.txt")){
			f.write("Hello");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
