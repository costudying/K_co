public class Ex3 {
	public static void main(String[] args) {
		int month = 6;
		String MtoS;
		
		if(month == 12 || month == 1 || month == 2)
			MtoS = "겨울" ;
		else if(month == 3 || month == 4 || month == 5)
			MtoS = "봄" ;
		else if(month == 6 || month == 7 || month == 8)
			MtoS = "여름" ;
		else if(month == 9 || month == 10 || month == 11)
			MtoS = "가을" ;
		else MtoS = "해당되는 계절이 없습니다";
		
		System.out.println(month + " 월은 " + MtoS);
	}
}
