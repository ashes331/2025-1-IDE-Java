package proj0312;

public class Exam07 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		System.out.println(myCar1.getColor() + ", " + myCar1.getSpeed());
		
		Car myCar2 = new Car("흰색", 0);
		Car myCar3 = new Car("빨간색", 0);
		Car iuCar = new Car("초록색", 0);
		Car bkCar = new Car("파란색", 0);
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed());
		System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
		
		bkCar.upSpeed(250);
		System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
		
		// 정적 구성 요소 추가
		System.out.println("생산된 차의 대수(정적 필드) ==> " + Car.carCount);
		System.out.println("생산된 차의 대수(정적 메소드) ==> " + Car.currentCarCount());
		System.out.println("차의 최고 제한 속도 ==> " + Car.MAXSPEED);
		
		System.out.println("PI의 값 ==> " + Math.PI);
		System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));
	}

}

// 인스턴스로 생성 (3-8)
// 생성자 코드 추가 및 내용 수정 (3-10)
// 정적 구성 요소 추가 (3-13 = exam08.java)