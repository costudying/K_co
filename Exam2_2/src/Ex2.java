
public class Ex2 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,6,7};
		
		System.out.println(arr.length); // �迭 ����

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//for each �̿�
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}

}
