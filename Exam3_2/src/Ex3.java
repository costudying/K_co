
public class Ex3 {
	static int abs(int x) {
		int y;
		if (x < 0) y = -x;
		else y = x;
		return y; //��(value)�� ��ȯ(return)
	}
	public static void main(String[] args) {
		int a = -5, result;
		
		result = abs(a);
		System.out.println(a + "�� ���밪: "+ result);
		System.out.println(10 + "�� ���밪: "+ abs(10));

	}

}
