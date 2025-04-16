package proj0416;

// 설계도
public class Student {
	// 1.속성=>아룸,학번,학과,과목
	private String name;
	private String hb;
	private String dept;
	private String sub;
	
	// 2.생성자
	Student() {}
	Student(String name, String hb, String dept, String sub) {
		this.name = name;
		this.hb = hb;
		this.dept = dept;
		this.sub = sub;
	}
	
	// 3. 메소드=> 'Source' -> 'getter and setter'
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHb() {
		return hb;
	}
	public void setHb(String hb) {
		this.hb = hb;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Student [name=" + name + ", hb=" + hb + ", dept=" + dept + ", sub=" + sub + "]";
	}
	
}
