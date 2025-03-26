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
			System.out.println("이름을 입려하세요 (그만 입력 시 종료): ");
			String name = scanner.nextLine();
			if (name.equals("그만")) {
				break;
			}
			System.out.println("나이를 입력하세요: ");
			int age = Integer.parseInt(scanner.nextLine());	 // Inter 변수 바꾸기	
			
			User user1 = new User(name, age);
			userList.add(user1);
		}
		try {
			BufferedWriter bout = new BufferedWriter(new FileWriter(outputFile));
			for (User user : userList) {
				bout.write(user.toString() + "\n"); // 쓰기 저장
				
			}
			bout.close();
			System.out.println(outputFile + "로 작성 완료되었습니다.");
		} catch (IOException e) {
			System.out.println("오류 발생");
		}
		scanner.close();

	}
}
