package proj0312;

public class Exam06 {

	public static void main(String[] args) {
		
		try {
			int num1 = 100, num2 = 0;
			System.out.println(num1 / num2);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("계산에 문제가 있습니다.");
		}

	}

}

// try~catch 예제 (프로그램 실행 중 발생하는 오류를 Java는 try~catch문을 통해 처리) (3-6)