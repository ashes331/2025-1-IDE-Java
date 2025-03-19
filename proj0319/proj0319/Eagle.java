package proj0319;
// 설계도(슈퍼)
abstract class Animal{
	// 1.속성
	protected String name;
	// 2.생성자
	Animal() {}
	Animal(String name) {
		this.name = name;
	}
	// 3.메소드
	abstract void move();
}
//end

//
public class Eagle extends Animal {
	// 1.속성
	private String home;
	// 2.생성자
	Eagle() {}
	Eagle(String name, String home) {
		super(name);
		this.home = home;
	}
	// 3.메소드
	// Source -> generate getters and setters
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	@Override
	void move() {
		System.out.println("날개로 날아간다.");
	}
}

//

class Tiger extends Animal {
	// 1.속성
	protected int age;
	// 2.생성자
	Tiger() {}
	Tiger(String name, int age) {
		super(name);
		this.age = age;
	}
	// 3.할일
	// Source -> generate getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	void move() {
		System.out.println("네발로 이동한다.");
	}
	
}

// 예제 (3-16, 17, 18)
