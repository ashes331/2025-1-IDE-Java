package proj0326;

import java.io.*;

public class Ex8_9 { // TextCopyEx

	public static void main(String[] args) {
		try {
			// File src = new File("c:\\key\\dream.txt"); // ���� ���� ��θ�
			File dest = new File("c:\\key\\mywaycopy.txt"); // ���� ���� ��θ�
			String src = "c:\\key\\myway.txt"; 		
			
			FileReader fr = new FileReader(src);
			BufferedReader bin = new BufferedReader(fr);
			BufferedWriter bout = new BufferedWriter(new FileWriter(dest));
			// FileWriter fw = new FileWriter(dest);
			
			int c;
			while((c = bin.read()) != -1) { 
				bout.write((char)c); 
			}
			
			fr.close();
			bin.close();
			System.out.println(src +"���� ���� �Ϸ�" + dest.getPath());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���� ���� ����~~");
		}
	}
}

// ���� 8-9 : �ؽ�Ʈ ���� ���� + ���� ��Ʈ��(8-7 Ȯ�� �ƴ�!)
