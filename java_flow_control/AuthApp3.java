
public class AuthApp3 {

	public static void main(String[] args) {

		String[][] users = {
				{"egoing", "1111"},
				{"jeong", "2222"},
				{"gwang", "3333"}
		};
		String inputId = args[0];
		String inputPass = args[1];

		System.out.println("HI.");
		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (
					inputId.equals(current[0]) && 
					inputPass.equals(current[1])
				) {
					isLogined = true;
					break;
				}
		}
		System.out.println("HI.");
		if(isLogined) {
			System.out.println("Master!!");
		}else {
			System.out.println("Who are you?");
		}
	}

}
