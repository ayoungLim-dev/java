// java ���α׷��� 3���� ����

package scannerTest;

import java.util.Scanner;

public class scannerTest {
	
	public static void main(String[] args) {
		
		//Scanner ���� 1
		System.out.println("Scanner ���� 1���Դϴ�.");
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		// ���α׷� ��, ������ �̸� �����ϴ� ��ó�� ��ġ�� ���ʿ� ���� �־�δ� ������ ����
		
		String name = scanner.next(); // ���ڿ� �б�
		System.out.print("�̸��� "+name+", ");
		
		String city = scanner.next(); // ���ڿ� �б�
		System.out.print("���ô� "+city+", ");
		
		int age = scanner.nextInt(); // ���� �б�
		System.out.print("���̴� "+age+"��, ");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.print("ü���� "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean(); // ���� �б�
		System.out.println("���� ���δ� "+single+"�Դϴ�");
		
		if(single == true)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("���� �ƴմϴ�.");
		
		scanner.nextLine(); //(������ �Լ� ������ �ٸ���) �Է� ���� Ŭ�� �������� ��� - ���ǹ��� �۾�
		// nextLine() : ������ \n�� ������ �� ���ʱ����� ���ڿ��� �޾ƿ��� �Լ�
		
		// Scanner ���� 2
		System.out.println("Scanner ���� 2���Դϴ�.");
		System.out.print("typing anything:");
		
		//String lineTest = scanner.nextLine();
		//System.out.println(lineTest);
		
		//scanner.nextLine()�� �������� hasNext���� ���� ����1�� ������ \n�� String���� �޾ƿ�
		while(scanner.hasNext()) { // ctrl-z = false ��ȯ
			String tokenT = scanner.next();
			System.out.println(tokenT);
		}
		
		scanner.close(); // scanner �ݱ�
	}
}
