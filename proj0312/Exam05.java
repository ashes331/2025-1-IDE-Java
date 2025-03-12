package proj0312;

public class Exam05 {
	static int var = 100;
	public static void main(String[] args) {
		
		int var = 0;
		System.out.println(var);
		
		int sum = addFunction(10, 20);
		System.out.println(sum);
	}
	
	static int addFunction(int num1, int num2) {
		int hap;
		hap = num1 + num2 + var;
		return hap;
	}
}

// 전역변수와 지역변수 예제 (3-5)
