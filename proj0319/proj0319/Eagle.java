package proj0319;
// ���赵(����)
abstract class Animal{
	// 1.�Ӽ�
	protected String name;
	// 2.������
	Animal() {}
	Animal(String name) {
		this.name = name;
	}
	// 3.�޼ҵ�
	abstract void move();
}
//end

//
public class Eagle extends Animal {
	// 1.�Ӽ�
	private String home;
	// 2.������
	Eagle() {}
	Eagle(String name, String home) {
		super(name);
		this.home = home;
	}
	// 3.�޼ҵ�
	// Source -> generate getters and setters
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	@Override
	void move() {
		System.out.println("������ ���ư���.");
	}
}

//

class Tiger extends Animal {
	// 1.�Ӽ�
	protected int age;
	// 2.������
	Tiger() {}
	Tiger(String name, int age) {
		super(name);
		this.age = age;
	}
	// 3.����
	// Source -> generate getters and setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	void move() {
		System.out.println("�׹߷� �̵��Ѵ�.");
	}
	
}

// ���� (3-16, 17, 18)
