package proj0319;
// ���赵,����Ŭ����
public class Car {
	// 1. �Ӽ�,�ʵ�,����
	protected  String color;
	protected int speed;
	
	// 2. ������
	Car() {}
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	// 3. ����,���,�޼ҵ�
	// Source -> generate getters and setters
	// �ӵ��ø���
	void upSpeed(int value) {
		speed = speed + value;
		if(speed > 200)
			speed = 200;
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

// �¿��� Car Ŭ���� 