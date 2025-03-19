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
				System.out.println("클릭 리스너입니다.");				
			}
		};		
		obj1.print();
		
		// 데이터 변환
		int a = Integer.parseInt("100");
		double b = Double.parseDouble("100.123");
		
		// 문자열 비교
		String str = "안녕하세요.";
		if (str.equals((String)"안녕하세요")) {
			// 문자열이 같으면 이곳을 수행
		}
	}
}

//예제 (3-22)