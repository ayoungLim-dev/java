package Phone;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		  
		  //1, ������ ����� �� �Է� �ޱ�
		  System.out.print("�ο� ��>> "); // �ο� �� �Է� �ޱ�
		  int num = scanner.nextInt(); // �Է� ���� ���� ���� -> ���� Ÿ������ ����
		  
		  //2. phone ��ü �迭 ����
		  Phone[] phone = new Phone[num]; //��ü �迭 ����
		  
		  //3. �Է� ���� ���� phone �迭�� ����
		  for (int i=0;i<num;i++) { // for ���� �̿���  �ο� ����� �̸��� ��ȭ ��ȣ �Է� �ޱ�
			  System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>> ");
			  String name = scanner.next(); // �Է� ���� ù��° ��ū�� name ������ ����
			  String tel = scanner.next(); // �Է� ���� �ι�° ��ū�� tel ������ ����
			  scanner.nextLine(); 
			  phone[i] = new Phone(name, tel); // ������ name, tel�� phone �迭�� ����
		  }
		  
		  System.out.println("����Ǿ����ϴ� . . .");
	  
		  //4. �˻� ���ǹ� ����
		  while (true) {
			 System.out.print("�˻��� �̸�>> ");
			 String input= scanner.next(); // �Է� ���� ��ū�� input ������ ����
			  
			 // check ���� ����
			 int check = 1; 
			 
			  //5. equals()�Լ��� ����� �Է� ���ڿ��� �迭�� ���ҿ� ���ٸ� ��ȭ��ȣ ���
			  for (int i=0;i<num;i++) { 
					 if (input.equals(phone[i].name)) {
							System.out.println(input+"�� ��ȣ�� "+phone[i].tel+" �Դϴ�.");
							check --; // check ���� ���� 1�� ���� �ʵ��� 
					 }
					 
			  }
			
			 //5. equals()�Լ��� ����� �Է� ���ڿ��� "�׸�"�� ���ٸ� while�� Ż�� 
			if (input.equals("�׸�")) 
				break;
			
			// check ������ �״�� 1�̶��, (�迭�� ���ҿ� ���� ����) �Է� ���ڿ��� ������ ������ ���
			if (check == 1)
				System.out.println(input+"�� �����ϴ�.");

		  }

	scanner.close(); // ��ĳ�� ��ü �ݱ�

	}
}
