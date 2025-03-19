package proj0319;
// 설계도(자식)
public class Automobile extends Car {
	// 1.속성,변수
	private int seatNum;
	// 2.생성자
	Automobile() {}
	Automobile(String color, int speed, int seatNum) {
		super(color, speed);
		this.seatNum = seatNum;
	}
	// 3. 할일,메소드
	// Source -> generate getters and setters
	// 속도올리기
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

// 예제 (3-14)