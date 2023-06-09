public class Ex2 {
	public static void main(String[] args) {
		int su = 9;
		
		if(su%2 != 0) {
			System.out.println( "È¦¼ö" );
		} else {
			System.out.println( "Â¦¼ö");
		}
		
		String str = (su%2 != 0)?"È¦¼ö":"Â¦¼ö";
		    System.out.println(str);
	}
}
