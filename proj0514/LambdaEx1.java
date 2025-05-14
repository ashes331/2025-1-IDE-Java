package proj0514;

interface MyFunction { // �Լ��� �������̽�
	int calc(int x, int y);  // ���ٽ����� ������ �߻� �޼ҵ�
}

public class LambdaEx1 {

	public static void main(String[] args) {
		
		MyFunction add = (x, y) -> { return x + y; }; // ���ٽ�
		MyFunction minus = (x, y) -> x - y; // ���ٽ�, {}�� return ����
		MyFunction multiply = (x, y) -> x * y;
		MyFunction divide = (x, y) -> x / y;
		MyFunction mod = (x, y) -> x % y;
		
		System.out.println(add.calc(1, 2));  // �� ���ϱ�
		System.out.println(minus.calc(1, 2));  // �� ���ϱ�
		System.out.println(multiply.calc(1, 2));  // �� ���ϱ�
		System.out.println(divide.calc(1, 2));  // ���� �� ���ϱ�
		System.out.println(mod.calc(1, 2));  // ������ ���ϱ�

	}

}
