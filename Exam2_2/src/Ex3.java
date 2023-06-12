
public class Ex3 {

	public static void main(String[] args) {
		int[] ar = { 79, 88, 91, 55, 95};
		int tot = 0;
		double avg;
		
		for (int i =0; i < 5; i++)
			tot += ar[i];
		
		avg = (double) tot / 5;
		
		System.out.println( "ÃÑÇÕ = "+ tot);
		System.out.println( "Æò±Õ = "+ avg);
	}

}
