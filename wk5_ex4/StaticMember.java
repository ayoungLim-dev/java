//java ���α׷��� ���� 5���� ���� 4

package wk5_ex4;

import java.util.Scanner;

public class StaticMember{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		System.out.print("ȯ��(1�޷�): ");
		double rate = scanner.nextDouble(); // ��ĳ�� ��ü�� �޾ƿ��� ���� Double Ÿ������ �о��
		CurrencyConverter.setRate(rate); //�̱� �޷� ȯ�� ����
		
		
		//String.format("%.2f",CurrencyConverter.toDollar(1000000));
		System.out.println("�鸸���� $"+CurrencyConverter.toDollar(1000000)+"�Դϴ�.");
		
		System.out.println("$100�� "+CurrencyConverter.toKWR(100)+"���Դϴ�.");
		scanner.close();
	}
}
