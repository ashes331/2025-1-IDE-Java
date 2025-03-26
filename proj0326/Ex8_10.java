package proj0326;

import java.io.*;

public class Ex8_10 {

	public static void main(String[] args) {
		
		File src = new File("c:\\image\\down.jpg"); // 읽기 (복사할 사진)
		File dest = new File("c:\\key\\downcopy.jpg"); // 쓰기
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}

// 예제 8-10 : 바이너리 파일 복사