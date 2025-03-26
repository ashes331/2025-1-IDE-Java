package proj0326;

public class User {
	
	// 1.속성
	private String name;
	private int age;
	
	// 2.생성자
	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 3.메소드,메뉴 source -> generate getters and setters			
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	//source -> generate toString()
	@Override
	public String toString() {
		return "User [이름 = " + name + ", 나이 = " + age + "]";
	}
}


