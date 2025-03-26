package proj0326;

import java.io.*;

public class Ex8_9 { // TextCopyEx

	public static void main(String[] args) {
		try {
			// File src = new File("c:\\key\\dream.txt"); // 원본 파일 경로명
			File dest = new File("c:\\key\\mywaycopy.txt"); // 복사 파일 경로명
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
			System.out.println(src +"파일 복사 완료" + dest.getPath());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 복사 에러~~");
		}
	}
}

// 예제 8-9 : 텍스트 파일 복사 + 버퍼 스트림(8-7 확정 아님!)
