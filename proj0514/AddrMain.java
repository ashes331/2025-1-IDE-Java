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
			System.out.println("1. �ּҷ� �Է�");
			System.out.println("2. �ּҷ� �˻�");
			System.out.println("3. �ּҷ� ��ü ��ȸ");
			System.out.println("4. �ּҷ� ����");
			System.out.println("5. �ּҷ� ����");
			System.out.println("0. ����");
			System.out.println("-------------");
			System.out.println("�޴��� �Է��ϼ���: ");
			int in = sc.nextInt(); 
			
			//������ �޴����� �޼ҵ� ���� �߰� (if/else if, switch/case/default ��)
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
	                 System.out.println("���α׷� ����");
	                 sc.close(); // //���α׷��� ������ ���� �־�� ��
	                 return; 
	            default:
	                 System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���. ");
			}
		}
	}
	
	//�Է� 
	public static void addrInput() {
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		String tel = sc.next();
		
		System.out.print("ȸ����� �Է��ϼ���: ");
		String com = sc.next();
		
		LocalDateTime createDate = LocalDateTime.now();

        // Addr ��ü ���� �� addlist�� ����
        Addr addr1 = new Addr(name, tel, com, createDate);
        addlist.add(addr1);
        
        System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
        System.out.println("�Էµ� ����: " + addr1);
	    
	}
	
	//�˻� 
	static private void addrSearch() {
		System.out.println("�˻��� �̸��� �Է��Ͻÿ�: ");
		String name = sc.nextLine();
		
		boolean found = false;
		
        for (Addr addr : addlist) {
            if (addr.getName().equals(name)) {  
                System.out.println("�˻��� ����: " + addr);
                found = true;
            }
        }
        if (!found) {
            System.out.println("�˻��� ����� �����ϴ�.");
        }
    }
        
	
	//��ȸ 
	static void addrJohoi() {
		
		System.out.println("��ü �ּҷ� ���:");
		if (!addlist.isEmpty()) {
	        for (Addr addr : addlist) {
	            System.out.println(addr);
	        }
	    } else {
	        System.out.println("����� �ּҷ��� �����ϴ�.");
	    }
	}
	
	//����
	static void addrUpdate() {
		System.out.println("������ �̸��� �Է��Ͻÿ�: ");
		String name = sc.next();
		
		boolean found = false;
		
	    for (Addr addr : addlist) {
	        if (addr.getName().equals(name)) {
	            found = true;
	            
	            System.out.println("���� ����: " + addr);
	                         
	            // �̸� ����
	            System.out.print("������ �̸��� �Է��ϼ���: ");
	            String newName = sc.next();
	            addr.setName(newName);  
	            
	            // ��ȭ��ȣ ����
	            System.out.print("������ ��ȭ��ȣ�� �Է��ϼ���: ");
	            String newTel = sc.next();
	            addr.setTel(newTel); 

	            // ȸ��� ����
	            System.out.print("������ ȸ����� �Է��ϼ���: ");
	            String newCom = sc.next();
	            addr.setCom(newCom); 
	          
	            // ������ �ð� ���� ����
	            addr.setCreateDate(LocalDateTime.now()); 

	            System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	            System.out.println("������ ����: " + addr);
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("�ش� �̸��� �ּҷ��� �����ϴ�.");
	    }
  
	}
	
	//����
	static void addrDelete() {
		System.out.println("������ �̸��� �Է��Ͻÿ�: ");
		String name = sc.next();
        
        Iterator<Addr> iterator = addlist.iterator();  // Iterator ��ü ����
        boolean found = false;
        
        while (iterator.hasNext()) {
            Addr addr = iterator.next(); 
            if (addr.getName().equals(name)) {
                iterator.remove(); 
                System.out.println(name + " �� �ּҷ��� �����Ǿ����ϴ�.");
                found = true;
                break;
            }
        }
	}
	
}
