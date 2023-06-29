
public class WhileLoopDemo {
	static int balance = 0;
	static boolean withdrawal;
	public static void main(String[] args) {
		/*
		 * while (balance > 0) { System.out.println("Can I withdraw money ? " +
		 * withdrawel); break; }
		 */
		
		int i=10;
		while (i > 0) {
			System.out.print(i +"\t");
			i--;
		}
		System.out.println();
		i = 0;
		while (i<10) {
			System.out.print(i +"\t");
			i++;
		}
				

	}

}
