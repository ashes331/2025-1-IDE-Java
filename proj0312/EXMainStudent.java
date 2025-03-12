package proj0312;

public class EXMainStudent {

	public static void main(String[] args) {
		
		EXStudent Stu1 = new EXStudent("È«±æµ¿", 20256543, 20);
		EXStudent Stu2 = new EXStudent("±è¼º¿ø", 20241491, 21);
		System.out.println(Stu1.getName() + ", " + Stu1.getStuld() + ", " + Stu1.getAge());
		System.out.println(Stu2.getName() + ", " + Stu2.getStuld() + ", " + Stu2.getAge());
	}

}
