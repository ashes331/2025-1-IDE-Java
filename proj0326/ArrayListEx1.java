package proj0326;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("홍길동");
		aList.add("이순신");
		aList.add("이제니");
		for (String item : aList) {
			System.out.println(item);
		}

	}

}

// 배열 