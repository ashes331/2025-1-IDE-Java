package proj0319;

class ICat implements IAnimal {
	
	@Override
	public void eat() {
		System.out.println("������ �����Ѵ�.");
	}	
}
//
class ITiger extends Animal implements IAnimal {

	@Override
	public void eat() {
		System.out.println("������� ��ƸԴ´�.");
	}
	@Override
	void move() {
		System.out.println("�׹߷� �̵��Ѵ�.");	
	}
}
//
public class Exam12 {

	public static void main(String[] args) {
		
		ICat cat1 = new ICat();
		cat1.eat();
		
		ITiger tig1 = new ITiger();
		tig1.eat();
		tig1.move();
	}
}

//���� (3-21)
