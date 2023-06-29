
public class ForLoopDemo {
	
	public static void main(String[] args) {
		System.out.println("Let have a fun");

		for(int i = 0; i<=10;i++) {
			System.out.print(" ");
			
			for(int j=10; j>i ; j--) {
				System.out.print(" ");
				}
			for(int k = 0;k<i;k++) {
				System.out.print("* ");
				}
			System.out.println();
			}
		
		for(int i = 0; i<=10;i++) {
			System.out.print(" ");
			
			for(int k = 0;k<i;k++) {
				System.out.print(" ");
				}
			for(int j=10; j>i ; j--) {
				System.out.print("* ");
				}
			System.out.println();
			}
		}

}
