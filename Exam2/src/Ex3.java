public class Ex3 {
	public static void main(String[] args) {
		int month = 6;
		String MtoS;
		
		if(month == 12 || month == 1 || month == 2)
			MtoS = "�ܿ�" ;
		else if(month == 3 || month == 4 || month == 5)
			MtoS = "��" ;
		else if(month == 6 || month == 7 || month == 8)
			MtoS = "����" ;
		else if(month == 9 || month == 10 || month == 11)
			MtoS = "����" ;
		else MtoS = "�ش�Ǵ� ������ �����ϴ�";
		
		System.out.println(month + " ���� " + MtoS);
	}
}
