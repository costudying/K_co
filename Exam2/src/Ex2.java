public class Ex2 {
	public static void main(String[] args) {
		int su = 9;
		
		if(su%2 != 0) {
			System.out.println( "Ȧ��" );
		} else {
			System.out.println( "¦��");
		}
		
		String str = (su%2 != 0)?"Ȧ��":"¦��";
		    System.out.println(str);
	}
}
