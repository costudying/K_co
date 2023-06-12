
public class Quiz1 {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			for (int k = 1; k <=i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=6-i; k++) {
				System.out.print("*");
			}
			System.out.println();
	    }
	}
}
