// java ���α׷��� ���� 4���� ���� 2

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //��ü ���� (������)
		
		Scanner scanner = new Scanner(System.in); // �Է� ��ĳ�� ��ü ����
		System.out.print(">>");
		
		rect.width = scanner.nextInt(); // scanner�� ù ��° ��ū�� rect ��ü ���۷��� ������ width���� �޾ƿͶ�(int Ÿ��)
		rect.height = scanner.nextInt(); // scanner�� �� ��° ��ū�� rect ��ü ���۷��� ������ hight���� �޾ƿͶ�(int Ÿ��) 
		
		System.out.println("�簢���� ������"+rect.getArea());
		
		scanner.close();
		
	}
	
}
