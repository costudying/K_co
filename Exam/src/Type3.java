public class Type3 {
	public static void main(String[] args) {
		char value1 = 'A';
		char value2 = '가';
		char value3 = '0';
		char value4 = ' ';
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		// 10진 정수(Deciaml) 코드, 유니코드로 대입
		char value5 = 65; 
		char value6 = 0xac00;
		char value7 = 48; // '\u0030'
		char value8 = 32;	
		System.out.println(value5); //A
		System.out.println(value6); //가
		System.out.println(value7); //0
		System.out.println(value8); //space
		System.out.println();
	}
}
