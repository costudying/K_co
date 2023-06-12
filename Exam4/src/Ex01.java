class Point1 { //클래스 정의
	int x; // 멤버 필드(변수)
	int y; // 멤버 필드(변수)
};
public class Ex01 {
    public static void main(String[] args) {
		Point1 pt1 = new Point1(); // 객체 생성문
		pt1.x= 10;
		pt1.y= 20;
		System.out.println(pt1.x + ", " + pt1.y);
	}
}
