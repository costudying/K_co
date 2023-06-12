public class H1 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= 6-i; k++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			for(int k = 1; k <= 6-i; k++) {
				System.out.print(" ");
			}
		System.out.println();
		}
    }
}
