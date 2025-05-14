package proj0514;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static void main(String[] args) {

		while(true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("메뉴를 입력하세요: ");
			int in = sc.nextInt(); 
			
			//선택한 메뉴별로 메소드 실행 추가 (if/else if, switch/case/default 등)
			switch (in) {
	            case 1:
	                 addrInput();
	                 break;
	            case 2:
	                 addrSearch();
	                 break;
	            case 3:
	                 addrJohoi();
	                 break;
	            case 4:
	                 addrUpdate();
	                 break;
	            case 5:
	                 addrDelete();
	                 break;
	            case 0:
	                 System.out.println("프로그램 종료");
	                 sc.close(); // //프로그램이 끝나는 곳에 넣어야 함
	                 return; 
	            default:
	                 System.out.println("잘못된 입력입니다. 다시 입력하세요. ");
			}
		}
	}
	
	//입력 
	public static void addrInput() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		
		System.out.print("전화번호를 입력하세요: ");
		String tel = sc.next();
		
		System.out.print("회사명을 입력하세요: ");
		String com = sc.next();
		
		LocalDateTime createDate = LocalDateTime.now();

        // Addr 객체 생성 후 addlist에 저장
        Addr addr1 = new Addr(name, tel, com, createDate);
        addlist.add(addr1);
        
        System.out.println("입력이 완료되었습니다.");
        System.out.println("입력된 정보: " + addr1);
	    
	}
	
	//검색 
	static private void addrSearch() {
		System.out.println("검색할 이름을 입력하시오: ");
		String name = sc.nextLine();
		
		boolean found = false;
		
        for (Addr addr : addlist) {
            if (addr.getName().equals(name)) {  
                System.out.println("검색된 정보: " + addr);
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색된 결과가 없습니다.");
        }
    }
        
	
	//조회 
	static void addrJohoi() {
		
		System.out.println("전체 주소록 목록:");
		if (!addlist.isEmpty()) {
	        for (Addr addr : addlist) {
	            System.out.println(addr);
	        }
	    } else {
	        System.out.println("저장된 주소록이 없습니다.");
	    }
	}
	
	//수정
	static void addrUpdate() {
		System.out.println("수정할 이름을 입력하시오: ");
		String name = sc.next();
		
		boolean found = false;
		
	    for (Addr addr : addlist) {
	        if (addr.getName().equals(name)) {
	            found = true;
	            
	            System.out.println("현재 정보: " + addr);
	                         
	            // 이름 수정
	            System.out.print("수정할 이름을 입력하세요: ");
	            String newName = sc.next();
	            addr.setName(newName);  
	            
	            // 전화번호 수정
	            System.out.print("수정할 전화번호를 입력하세요: ");
	            String newTel = sc.next();
	            addr.setTel(newTel); 

	            // 회사명 수정
	            System.out.print("수정할 회사명을 입력하세요: ");
	            String newCom = sc.next();
	            addr.setCom(newCom); 
	          
	            // 수정한 시간 새로 갱신
	            addr.setCreateDate(LocalDateTime.now()); 

	            System.out.println("수정이 완료되었습니다.");
	            System.out.println("수정된 정보: " + addr);
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("해당 이름의 주소록이 없습니다.");
	    }
  
	}
	
	//삭제
	static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오: ");
		String name = sc.next();
        
        Iterator<Addr> iterator = addlist.iterator();  // Iterator 객체 생성
        boolean found = false;
        
        while (iterator.hasNext()) {
            Addr addr = iterator.next(); 
            if (addr.getName().equals(name)) {
                iterator.remove(); 
                System.out.println(name + " 의 주소록이 삭제되었습니다.");
                found = true;
                break;
            }
        }
	}
	
}
