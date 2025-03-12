package proj0312;

public class Car {
	// 1.�Ӽ�, �ʵ�, ��������
	private String color;   // ����
	private int speed = 0;  // �ӵ�
	
	// ���� ���� ��� �߰� (9 ~ 15��, 22��)
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	// 2.������
	Car() {}                         // 2-1: �⺻ ������ ���� ���� ��ü(��ü)�� ����
	Car(String color, int speed) {   // 2-2: ������ ���� ������ �ִ� ��ü(��ü)�� ����
		this.color = color;
		this.speed = speed;
		carCount ++;
	}
	
	// 3.�� ��, ���, �޼ҵ�
	// �ӵ� �ø���
	int upSpeed(int value1) {
		speed = speed + value1;
		if (speed > 200)
			speed = 200;
		return speed;
	}
	// �ӵ� ������
	int downSpeed(int value2) {
		speed = speed - value2;
		if (speed < 0)
			speed = 0;
		return speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

// Ŭ���� ���� (3-7)
// ������ �ڵ� �߰� �� ���� ���� (3-9)
// �޼ҵ� �����ε� (3-11)
// ���� �ʵ�, ���� �޼ҵ�, ��� �ʵ� (3-12)