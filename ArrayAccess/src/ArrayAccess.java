/*
 java ���α׷��� ���� 6���� ���� 1
1. �迭�� �����ϰ� ��� 5���� �Է� �޾� ����
2. ���� ū ���� ���
*/
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		int intArray[] = new int[5]; // ���� 5���� 1���� �迭 ����
		
		int max =0; // ���� ���� ū ��
		
		System.out.println("����� 5�� �Է��ϼ���: ");
		/*
		for(int i=0;i<5;i++) {
			intArray[i] = scanner.nextInt(); // �Է� ���� ������ �迭�� ����
			if(intArray[i] > max) // intArray[i]�� ���� ���� ū ������ ũ�� 
				max = intArray[i]; // intArray[i]�� max�� ����
		}
		*/	
		// for - each ��
		for(int i : intArray) { // i �� intArray[i]ó�� �ε����� ����Ŵ
			i = scanner.nextInt(); // �Է� ���� ������ �迭�� ����
			if(i > max) // i�� ���� ���� ū ������ ũ�� 
				max = i; // i�� max�� ����
		}		
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		
		scanner.close(); // ��ĳ�� ��ü �ݱ� 
	}
	
}
