package proj0319;

public class Exam10 {

	public static void main(String[] args) {
		
		Tiger tig1 = new Tiger();
		Tiger tig2 = new Tiger("호랑이", 2);
		Eagle eag1 = new Eagle("독수리", "절벽");
		tig2.move();
		eag1.move();
		
		Animal tig3 = new Tiger();
		Animal eag2 = new Eagle("신촌독수리", "신촌");
		tig3.move();
		eag2.move();

	}

}

// 예제 (3-19, 20)