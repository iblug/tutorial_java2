public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {
			System.out.println(scores[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds!!");
		}
		System.out.println(2);
		try {
			System.out.println(2/0);
		} catch(ArithmeticException e) {
			System.out.println("Miss Arithmetic!!");
		}
		
		try {
			System.out.println(3);
//			System.out.println(scores[3]);
			System.out.println(4);			//에러 발생시 실행 기회 없음!
			System.out.println(2/0);
			System.out.println(5);
		}catch (ArithmeticException e) {					// 예외 우선순위!!
			System.out.println("Miss Arithmetic!! " + e.getMessage());
			e.printStackTrace();
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Out of Bounds!!");
//		}
		catch(Exception e) {
		System.out.println("Error!!");
		}
		
		System.out.println(6);
	}
}
