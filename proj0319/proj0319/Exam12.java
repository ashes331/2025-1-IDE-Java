package proj0319;

class ICat implements IAnimal {
	
	@Override
	public void eat() {
		System.out.println("생선을 좋아한다.");
	}	
}
//
class ITiger extends Animal implements IAnimal {

	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹는다.");
	}
	@Override
	void move() {
		System.out.println("네발로 이동한다.");	
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

//예제 (3-21)
