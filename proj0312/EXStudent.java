package proj0312;

public class EXStudent {
	
	private String name;
	private int stuld;
	private int age;
	
	EXStudent(String name, int stuld, int age) {
		this.name = name;
		this.stuld = stuld;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuld() {
		return stuld;
	}
	public void setStuld(int stuld) {
		this.stuld = stuld;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
