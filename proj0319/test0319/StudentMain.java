package test0319;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", "서울특별시 구로구 고척동", "010-1234-5678", "20241234", "컴퓨터소프트웨어학과");
		Student stu2 = new Student("김지연", "서울특별시 구로구 구로1동", "010-2643-5638", "20243677", "인공지능소프트웨어학과");
		Student stu3 = new Student("박정현", "서울특별시 구로구 신도림동", "010-9081-5671", "20248051", "건축학과");
		
		stu1.print();
		System.out.println();
		stu2.print();
		System.out.println();
		stu3.print();
		System.out.println();
		
		
		
		

	}

}
