package proj0312;

public class Exam04 {

	public static void main(String[] args) {
			
			int one[] = new int[3];
			for (int i = 0; i < one.length; i++) {
				one[i] = 10 * i;
			}
			
			String two[] = {"�ϳ�", "��", "��"};
			for (String item : two) {
				System.out.println(item);
			}
			
			int j = 0;
			while(j < one.length) {
				System.out.println(one[j]);
				j++;
			}
	
		}

}

// for, while ���� (3-4)