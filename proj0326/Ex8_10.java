package proj0326;

import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		
		File src = new File("c:\\image\\down.jpg"); // �б� (������ ����)
		File dest = new File("c:\\key\\downcopy.jpg"); // ����
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}

	}

}

// ���� 8-10 : ���̳ʸ� ���� ����