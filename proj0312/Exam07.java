package proj0312;

public class Exam07 {

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		System.out.println(myCar1.getColor() + ", " + myCar1.getSpeed());
		
		Car myCar2 = new Car("���", 0);
		Car myCar3 = new Car("������", 0);
		Car iuCar = new Car("�ʷϻ�", 0);
		Car bkCar = new Car("�Ķ���", 0);
		System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed());
		System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
		System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
		System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
		
		bkCar.upSpeed(250);
		System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
		
		// ���� ���� ��� �߰�
		System.out.println("����� ���� ���(���� �ʵ�) ==> " + Car.carCount);
		System.out.println("����� ���� ���(���� �޼ҵ�) ==> " + Car.currentCarCount());
		System.out.println("���� �ְ� ���� �ӵ� ==> " + Car.MAXSPEED);
		
		System.out.println("PI�� �� ==> " + Math.PI);
		System.out.println("3�� 5���� ==> " + Math.pow(3, 5));
	}

}

// �ν��Ͻ��� ���� (3-8)
// ������ �ڵ� �߰� �� ���� ���� (3-10)
// ���� ���� ��� �߰� (3-13 = exam08.java)