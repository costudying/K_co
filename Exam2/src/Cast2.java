public class Cast2 {
	public static void main(String[] args) {
		System.out.printf( "문자 %c 의 유니코드는 %d \n" ,
				'A', (int) 'A' );
		System.out.printf( "문자 %c 의 유니코드는 %d \n" ,
				'a', (int) 'a' );
		System.out.printf( "문자 %c 의 유니코드는 %d \n" ,
				'0', (int) '0' );
		System.out.printf( "\n" );
		System.out.printf( "문자 %c 의 유니코드는 %d \n" ,
				'A' + 1, (int) ('A'+ 1) );
	}
}
