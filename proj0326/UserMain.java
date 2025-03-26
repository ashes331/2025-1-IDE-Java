package proj0326;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class UserMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<User> userList = new ArrayList<User>();
		String outputFile = "./UserOutput0326.txt";
		
		while (true) {
			System.out.println("�̸��� �Է��ϼ��� (�׸� �Է� �� ����): ");
			String name = scanner.nextLine();
			if (name.equals("�׸�")) {
				break;
			}
			System.out.println("���̸� �Է��ϼ���: ");
			int age = Integer.parseInt(scanner.nextLine());	 // Inter ���� �ٲٱ�	
			
			User user1 = new User(name, age);
			userList.add(user1);
		}
		try {
			BufferedWriter bout = new BufferedWriter(new FileWriter(outputFile));
			for (User user : userList) {
				bout.write(user.toString() + "\n"); // ���� ����
				
			}
			bout.close();
			System.out.println(outputFile + "�� �ۼ� �Ϸ�Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� �߻�");
		}
		scanner.close();

	}
}
