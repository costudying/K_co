public class Ex2 {
	static void sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("a + b = " + c);
	}
	public static void main(String[] args) {
		int a = 10, b = 20;
		sum(a,b); //Call by Value(���� ���� ȣ��)
		sum(4,5);
	}
}
