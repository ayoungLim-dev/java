
import java.util.Scanner;

public class Menu {
	public static void main(String[]args) {

		//Management Ŭ���� ��ü ���۷��� ����
		Management menu = new Management();
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		String num;
		boolean run = true;
		while (run) { // �Է¹��� ���� num�� 4��� while�� Ż���ϰ� ���α׷� ����
			try {
				
				System.out.println("[LaLaLa StudyRoom]");
				System.out.println("1. ����");
				System.out.println("2. ����");
				System.out.println("3. �����ֹ�");
				System.out.println("4. ������");
				System.out.println("5. ���α׷� ����");
				System.out.print("--> ");

				num = scanner.nextLine(); // �Է¹��� ���� ���� ����
				
				// null, �����Ͻ�
				if (num == null || num.length() == 0 ) {
					System.out.println("���ڸ� �Է��ϰ�, ���͸� �����ּ���.");
					System.out.println();
				}
				// null�̳� ������ �ƴ� ��
				else {
					for (int i = 0; i < num.length(); i++) {
						int c = (int) num.charAt(i);
						// ���� or " "(����) �Է� ��
						if ((c < 48 || c > 57) || (num.contains(" "))) {
							System.out.println("���ڸ� �Է��ϼ̽��ϴ�.");
							System.out.println();
							break;
						}
						else { // ���� �Է� 
							switch(num) {
							case "1" :
								menu.setIn(); // ����
								break;
							case "2" :
								menu.setOut(); // ����
								break;
							case "3" :
								menu.orderFood(); // ���� �ֹ�
								break;
							case "4" :
								menu.admin(); // ������ ���
								break;
							case "5" :
								menu.adminEnd(); // ����
								run = false;
								break;
							default : 
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
								System.out.println();
							}
						}
					}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("");
			break;
		}
			
		}
		scanner.close(); // ��ĳ�� ��ü �ݱ�
		}	
}


