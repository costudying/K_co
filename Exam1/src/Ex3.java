public class Ex3 {
	public static void main(String[] args) {
		int value1 = 3;
		
		{
			int value2 = 5;
			System.out.println(value1); //3
			System.out.println(value2); //5
		}

		System.out.println(value1); //3
		//System.out.println(value2); // ����(Error)
	}
}
