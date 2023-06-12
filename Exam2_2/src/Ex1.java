public class Ex1 {
	public static void main(String[] args) {
		String weekDay1[] = new String[7];
		weekDay1[0] = "일";
		weekDay1[1] = "월";
		weekDay1[2] = "화";
		weekDay1[3] = "수";
		weekDay1[4] = "목";
		weekDay1[5] = "금";
		weekDay1[6] = "토";

		String weekDay2[] = { "일", "월", "화","수",
				"목","금","토"};
		
		System.out.println(weekDay1[1] + "요일");
		System.out.println(weekDay2[1] + "요일");
	}
}
