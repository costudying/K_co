public class Ex5 {
	public static void main(String[] args) {
		int score = 88;
		char grade;
		
		switch (score / 10) {//조건식에 char, int, String만 가능
		case 10 : grade = 'A'; break;
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
        default: grade ='F';
		}
		
		System.out.println("학점은 " + grade);
	}
}
