
public class P1 {

	public static void main(String[] args) {
		for (int i = 0; i <=4; i++) {
			for (int k = 1; k <=4-i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
	    }
	}

}
