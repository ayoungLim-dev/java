package TimeGame;
/*
6. ����ð��� ���ߴ� ������ �ۼ��϶�. ���� ���ø� �����ϸ� <Enter> Ű�� �Է��ϸ� ���� �� �ð��� �����ְ�
���⼭ 10�ʿ� �� �����ϵ��� ���� <Enter> Ű�� �Է��� ����� �̱�� �����̴�. 
*/
import java.util.Scanner;
import java.util.Calendar;

public class TimeGame {
	Scanner scanner = new Scanner(System.in); // Scanner ��ü ����
	String str;
	
	public int run() {
		while(!(str = scanner.nextLine()).equals("")); //����Ű�� �Է¹����� ����
		Calendar cal = Calendar.getInstance(); // Calendar ��ü ���� (���� �ð� ��)
		
		int sec1 = cal.get(Calendar.SECOND); //���� �ð��� �� ������ ����
		System.out.println("���� �� �ð� = " + sec1);
		
		System.out.print("10�� ���� �� <Enter>Ű>>");
		
		while(!(str = scanner.nextLine()).equals(""));
		cal = Calendar.getInstance(); // ���ο� ���� �ð� ���� ����
		
		int sec2 = cal.get(Calendar.SECOND); //���� �ð��� �� ������ ����
		System.out.println("���� �� �ð� = " + sec2);
		int result = Math.abs(sec2 - sec1);		// Math.abs() �Լ� : ���ڰ��� ���� ���밪�� ��ȯ�ϴ� �Լ�, �Է�Ÿ�� �״�� ����
		
		if(sec2 - sec1 < 0) return 60 - result; //������ �Ѿ�� ����
		
		return result;
	}
	
	public static void main(String[] args) {
		TimeGame time = new TimeGame(); // time ��ü ����
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		
		System.out.print("Ȳ���� ���� <Enter>Ű>>"); // Ȳ���� 
		int Hwang = time.run();
		System.out.print("���繮 ���� <Enter>Ű>>"); // ���繮
		int Lee = time.run();
		System.out.print("Ȳ������ ��� " + Hwang + ", ���繮�� ��� " + Lee + ", ");
		if(Math.abs(10 - Hwang) < Math.abs(10 - Lee))
			System.out.println("���ڴ� Ȳ����");
		else if(Math.abs(10 - Hwang) == Math.abs(10 - Lee))
			System.out.println("���º�");
		else
			System.out.println("���ڴ� ���繮");
		
	}
	

}
