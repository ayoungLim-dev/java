/*
 java ���α׷��� ���� 6���� ���� 2
1. �迭�� length�ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է� �޾� ����
2. ����� ���Ͽ� ���
*/

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // ���� 5���� �迭 ����
		int sum =0; // �迭�� ��
		
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		System.out.print(intArray.length+"���� �������Է��ϼ���: ");
		
		for(int i : intArray) {
			i = scanner.nextInt(); //�迭�� ������ŭ �Է� �޾�, �����ϴ� �ڵ�
			sum += i; // �迭 ���� ��� ���� ���ϴ� �ڵ�
		}
		
		System.out.println("����� "+(double)sum/intArray.length);
		scanner.close();
	}
}
