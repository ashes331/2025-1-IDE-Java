package proj0319;
// ���赵(�ڽ�)
public class Automobile extends Car {
	// 1.�Ӽ�,����
	private int seatNum;
	// 2.������
	Automobile() {}
	Automobile(String color, int speed, int seatNum) {
		super(color, speed);
		this.seatNum = seatNum;
	}
	// 3. ����,�޼ҵ�
	// Source -> generate getters and setters
	// �ӵ��ø���
	void upSpeed(int value) {
		speed = speed + value;
		if(speed > 300)
			speed = 300;
	}
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	
	

}

// ���� (3-14)