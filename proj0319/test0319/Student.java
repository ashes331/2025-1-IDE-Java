package test0319;

public class Student extends Person implements PrintInterface {
	private String stuId;   
    private String jeongong; 

    public Student(String name, String addr, String phone, String stuId, String jeongong) {
        super(name, addr, phone); 
        this.stuId = stuId;
        this.jeongong = jeongong;
    }
    
    //
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getJeongong() {
		return jeongong;
	}

	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}

	@Override
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("주소: " + addr);
		System.out.println("전화번호; " + phone);
		System.out.println("학번: " + stuId);
		System.out.println("전공: " + jeongong);
	}
}
