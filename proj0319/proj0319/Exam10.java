package proj0319;

public class Exam10 {

	public static void main(String[] args) {
		
		Tiger tig1 = new Tiger();
		Tiger tig2 = new Tiger("ȣ����", 2);
		Eagle eag1 = new Eagle("������", "����");
		tig2.move();
		eag1.move();
		
		Animal tig3 = new Tiger();
		Animal eag2 = new Eagle("���̵�����", "����");
		tig3.move();
		eag2.move();

	}

}

// ���� (3-19, 20)