package proj0326;

import java.io.*;
import java.util.*;

public class Ex8_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			FileWriter fout = new FileWriter("c:\\key\\test.txt");
			while(true) {
				String line = sc.nextLine();
				if (line.length() == 0) {
					System.out.println("���� �׸�");
					break;
				}
				//System.out.println(line + "\n");
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO ���� �߻�~");
		}

	}

}

// ���� 8-4 : Ű���� �Է��� ���Ϸ� �����ϱ�
