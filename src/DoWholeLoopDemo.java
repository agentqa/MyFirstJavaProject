
public class DoWholeLoopDemo {

	static int balance = 100;
	static boolean withdrawal;
	
	public static void main(String[] args) {

		// withdrawal is false by default 
		do {
			System.out.println("Can I withdraw money ? " + withdrawal);
			break;
		}while(balance > 0);

	}

}
