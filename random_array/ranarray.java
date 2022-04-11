/*
Ex8. ������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����) ���� �迭�� �����ϰ�,
�̰��� 1���� 100���� ������ ������ �����ϰ� ��������. �迭���� ���� ���� ������ �ϰ� �迭�� ����϶�.
*/
package random_array;

import java.util.Scanner;

public class ranarray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		int input = 0; // ���� �Է� ���� ���� ����
		int[] intArray; // ���� �迭 ����
		
		System.out.print("���� �� ��? ");
		input = scanner.nextInt(); // �Է� ���� ��ū�� int Ÿ������ input�� ����
		
		intArray = new int[input]; // �迭�� ���� �ʱ�ȭ
		
		// for���� �̿��� 1~100������ ���� �迭�� input�� ����
		for (int i =0;i<input;i++) { // input = intArray.length
			int rd = (int)(Math.random()*100+1);
			intArray[i] = rd;
			System.out.print(intArray[i]+" ");
			
			// i+1�� 10�� ����̰�, input�� 10 �ʰ���� �ٹٲ�
			if((i+1) % 10 == 0 && input > 10)
				System.out.println("\n");
		} //for��
		
		scanner.close(); // ��ĳ�� ��ü �ݱ�
	} //main
}//class
