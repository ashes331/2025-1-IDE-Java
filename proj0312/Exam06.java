package proj0312;

public class Exam06 {

	public static void main(String[] args) {
		
		try {
			int num1 = 100, num2 = 0;
			System.out.println(num1 / num2);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("��꿡 ������ �ֽ��ϴ�.");
		}

	}

}

// try~catch ���� (���α׷� ���� �� �߻��ϴ� ������ Java�� try~catch���� ���� ó��) (3-6)