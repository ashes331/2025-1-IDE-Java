package proj0326;

import java.util.Scanner;

public class Ex8_2 {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("�̸��� �Է��ϼ���: ");
        String name = scanner.nextLine();
        
        System.out.print("���̸� �Է��ϼ���: ");
        int age = scanner.nextInt();
        
        System.out.println("�ȳ��ϼ���, " + name + " ��! ����� ���̴� " + age + "���Դϴ�.");
        
        scanner.close();
    }
}
        
// ���� 2: �̸��� ���� scanner �� ����Ͽ� �����
