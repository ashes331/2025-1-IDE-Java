package proj0416;

import java.util.ArrayList;

public class ArrayListEx1{

	public static void main(String[] args) {
		
		ArrayList<String> nameLsit = new ArrayList<String>();
		nameLsit.add("ȫ�浿");
		nameLsit.add("�̼���");
		nameLsit.add("���̷�");
		nameLsit.add("�����");
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
		Student st1 = new Student("ȫ�浿", "10000001", "�ΰ����ɼ���Ʈ�����а�", "�ڹ�1");
		studentList.add(st1);
		studentList.add(new Student("�̼���", "10000002", "�ؾ��", "���������"));
		studentList.add(new Student("�輺��", "20241491", "�ΰ����ɼ���Ʈ�����а�", "�ڹ�2"));
		for (Student one : studentList) {
			System.out.println(one);
		}
		System.out.println(" *** �ΰ����ɼ���Ʈ�����а� �л� ��� *** ");
		for (Student one : studentList) {
			if (one.getDept().equals("�ΰ����ɼ���Ʈ�����а�"))
				System.out.println(one);
		}
		
	}

}
