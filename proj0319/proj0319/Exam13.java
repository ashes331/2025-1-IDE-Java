package proj0319;

interface ClickLis {
	void print();
}
//
public class Exam13 {

	public static void main(String[] args) {
		
		ClickLis obj1 = new ClickLis() {
			
			@Override
			public void print() {
				System.out.println("Ŭ�� �������Դϴ�.");				
			}
		};		
		obj1.print();
		
		// ������ ��ȯ
		int a = Integer.parseInt("100");
		double b = Double.parseDouble("100.123");
		
		// ���ڿ� ��
		String str = "�ȳ��ϼ���.";
		if (str.equals((String)"�ȳ��ϼ���")) {
			// ���ڿ��� ������ �̰��� ����
		}
	}
}

//���� (3-22)