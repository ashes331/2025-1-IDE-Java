package proj0416;

import java.util.ArrayList;

public class ArrayListEx1{

	public static void main(String[] args) {
		
		ArrayList<String> nameLsit = new ArrayList<String>();
		nameLsit.add("홍길동");
		nameLsit.add("이순신");
		nameLsit.add("동미래");
		nameLsit.add("양관식");
		nameLsit.add("100");
		for (String name : nameLsit) {
			System.out.println(name);
		}
		//=====================================================
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		ageList.add(20);
		ageList.add(21);
		ageList.add(22);
		ageList.add(23);
		for (Integer age : ageList) {
			System.out.println(age);
		}
		//=====================================================
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student st1 = new Student("홍길동", "10000001", "인공지능소프트웨어학과", "자바1");
		studentList.add(st1);
		studentList.add(new Student("이순신", "10000002", "해양과", "지도력향상"));
		studentList.add(new Student("김성원", "20241491", "인공지능소프트웨어학과", "자바2"));
		for (Student one : studentList) {
			System.out.println(one);
		}
		System.out.println(" *** 인공지능소프트웨어학과 학생 목록 *** ");
		for (Student one : studentList) {
			if (one.getDept().equals("인공지능소프트웨어학과"))
				System.out.println(one);
		}
		
	}

}
