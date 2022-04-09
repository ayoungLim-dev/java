/*
java ���α׷��� ���� 6���� ���� 7
-0���� ���� �� �߻��ϴ� ArithmeticException ���� ó��
1. ���� ó�� �� ����
2. try-catch ����� �̿� (������ 0���� ������ ��쿡 "0���� ���� �� �����ϴ�!" ����ϰ� �ٽ� �Է� �޴� ���α׷�)
*/
import java.util.Scanner;
import java.lang.ArithmeticException;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		while(true) { // while���� �̿��� ���ܰ� �߻����� ������ ����, ���ܰ� �߻��ϸ� �ٽ� ����
			// try-catch���� �̿��� '������ ���� 0�� ���' try���� �ٽ� ����ǵ���
			try {
				System.out.print("���������� ���� �Է��Ͻÿ�:");
				int dividend = scanner.nextInt(); // ���������� �� �Է� , nextInt�� ����
				System.out.print("������ ���� �Է��Ͻÿ�:");
				int divisor = scanner.nextInt(); // ������ �Է�. '0'�� �Է����� ���,ArithmeticException ���� ó��
				System.out.println(dividend +"��(��) "+divisor+"�� ������ ���� "+dividend/divisor+"�Դϴ�.");	
				break;
			}catch(ArithmeticException e) { // ���� �߻� �� catch������ ���� ó��
				System.out.println("������ 0���� ���� �� �����ϴ�.");
				continue;
			}
		}
		scanner.close(); // ��ĳ�� ��ü �ݱ�
	}
}
