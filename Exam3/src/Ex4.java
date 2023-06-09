public class Ex4 {
	public static void main(String[] args) {
		int total = 0;
		
		for (int n = 1; n <= 5; n++) {
			if (n == 3) break;
			total += n;
		}
        System.out.println("ÇÕ°è´Â " + total );
	}
}
