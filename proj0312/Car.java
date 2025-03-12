package proj0312;

public class Car {
	// 1.속성, 필드, 변수선언
	private String color;   // 색상
	private int speed = 0;  // 속도
	
	// 정적 구성 요소 추가 (9 ~ 15줄, 22줄)
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	// 2.생성자
	Car() {}                         // 2-1: 기본 생성자 값이 없는 객체(물체)를 만듦
	Car(String color, int speed) {   // 2-2: 생성자 값을 가지고 있는 객체(물체)를 만듦
		this.color = color;
		this.speed = speed;
		carCount ++;
	}
	
	// 3.할 일, 기능, 메소드
	// 속도 올리기
	int upSpeed(int value1) {
		speed = speed + value1;
		if (speed > 200)
			speed = 200;
		return speed;
	}
	// 속도 내리기
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

// 클래스 예제 (3-7)
// 생성자 코드 추가 및 내용 수정 (3-9)
// 메소드 오버로딩 (3-11)
// 정적 필드, 정적 메소드, 상수 필드 (3-12)