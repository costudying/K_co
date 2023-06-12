
public class Ex1 {

	public static void main(String[] args) {
		outer: for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(j > i) {
					System.out.println();
					continue outer;
					//outer로 지정된 for 블록으로 제어 이동
				}
				System.out.print(" " + (i*j));
				
			}
		}
	}

}
