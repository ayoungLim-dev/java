package java_ex;

import java.util.Scanner;
import java.util.Random; //���� �Լ� - ���� 8

public class java_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* #01 code �ٹ��ð��� ���� �ӱ� ��� */
		 
		System.out.println("2022�⵵ �����ñ��� 9,160�� �Դϴ�.");
		System.out.print("�Ϸ� �ٹ��ð��� �Է��ϼ���: ");
		Scanner scn=new Scanner(System.in);	//�Է¿� ��ĳ�� ��ü ����
		
		int your_pay = scn.nextInt(); // ���� Ÿ������ ����
		int pay=your_pay*9160; // �ٹ��ð� * 2022�� �����ñ�
		
		if (your_pay<=8)
			System.out.println("����� �Ϸ� �ӱ��� "+pay+"�� �Դϴ�.");
		else 
			System.out.println("����� �Ϸ� �ӱ��� "+pay*1.5+"�� �Դϴ�.");

		System.out.println();
		
		
		/*#02 code �ҵ漼 ���

		System.out.println("�� �ҵ濡 ���� �ҵ漼�� ����ص帳�ϴ�.");
		System.out.print("�� �ҵ�(���� ǥ��)�� �� �� ������ �Է����ּ���: ");
		Scanner scn=new Scanner(System.in);	//�Է¿� ��ĳ�� ��ü ����
		
		float income = scn.nextFloat(); // �Ǽ� Ÿ������ ����
		
		if (income<=1000)
			System.out.println("����� �ҵ漼�� "+income*0.09+"�����Դϴ�.");
		else if (income<=4000)
			System.out.println("����� �ҵ漼�� "+income*0.18+"�����Դϴ�.");
		else if (income<=8000)
			System.out.println("����� �ҵ漼�� "+income*0.27+"�����Դϴ�.");
		else //8000���� �ʰ�
			System.out.println("����� �ҵ漼�� "+income*0.36+"�����Դϴ�.");
		
		System.out.println();
		*/
		
		/*#03 code ������ ���� ���� ���
		
		System.out.println("������ �Է��ϸ� ���� ����� �ص帳�ϴ�.");
		System.out.print("������ �Է��ϼ���. : ");
		Scanner scn = new Scanner(System.in); //�Է¿� ��ĳ�� ��ü ����
		
		int grade = scn.nextInt(); // ���� Ÿ������ ����
		
		if (grade >= 95)
			System.out.println("����� ������ A+ �Դϴ�.");
		else if (grade >= 90)
			System.out.println("����� ������ A �Դϴ�.");
		else if (grade >= 85)
			System.out.println("����� ������ B+ �Դϴ�.");
		else if (grade >= 80)
			System.out.println("����� ������ B �Դϴ�.");
		else if (grade >= 75)
			System.out.println("����� ������ C+ �Դϴ�.");
		else if (grade >= 70)
			System.out.println("����� ������ C �Դϴ�.");
		else  //grade�� 70 �̸��� ���
			System.out.println("����� ������ D Ȥ�� F �Դϴ�.");
		
		System.out.println();
		
		*/
		
		/*#04 code n�� �Է¹޾� 1���� n������ ��
		
		System.out.println("���ڸ� �Է��ϸ� 1���� �ش� ���ڱ����� ���� ����մϴ�.");
		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner scn = new Scanner(System.in); // �Է¿� ��ĳ�� ��ü ����
		
		int n = scn.nextInt(); // ���� Ÿ������ ����
		int sum = 0;
		
		for(int i=0; i <= n; i++) {
			sum += i;
		}//for���� �̿��� 1-n�� �� ������ ����
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		
		System.out.println();
	
		*/
		 
		/*#05 code n�� �Է¹޾� n�� ������ ���
		
		System.out.println("���ϴ� ���ڸ� �Է��ϸ� �ش� ������ �������� ����մϴ�.");
		System.out.print("���ϴ� ���ڸ� �Է��ϼ���: ");
		Scanner scn = new Scanner(System.in); // �Է¿� ��ĳ�� ��ü ����
		
		int n = scn.nextInt(); // ���� Ÿ������ ����
		int i = 1; 
		
		System.out.printf("[ %d�� ]\n", n);
		
		while(i<=9) {
			System.out.printf(" %d X %d = %d |", n, i, n*i); //printf ������ %d ���
			i +=1; 
		}
		
		System.out.println();
	
		*/
		
		/*#06 code ���� for���� �̿��� 1-9�� ������ ���

		for (int i=1; i<=9; i++) { // for���� �̿��� 1-9�� ��� 
			System.out.printf("%d�� |", i);
			for (int j=1; j<=9; j++) { // ���� for���� �̿��� 1-9���� ������ �ݺ�
				System.out.printf(" %d x %d = %d |", i, j, i*j);
			}
			System.out.println("\n");
		}
	
		System.out.println();
		*/
		
		/*#07 code ���� for���� �̿��� * �簢�� ���

		System.out.println("*���� �簢���� ������� �մϴ�.");
		System.out.print("������� �ϴ� �簢���� ���ο� ���� ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���(2 �̻�): ");
		Scanner scn=new Scanner(System.in);	//�Է¿� ��ĳ�� ��ü ����
		
		int w = scn.nextInt(); // [�簢���� ���� ����]�� ���� Ÿ������ ����
		int h = scn.nextInt(); // [�簢���� ���� ����]�� ���� Ÿ������ ����
		
		for(int i=1;i<=h;i++) { // for���� �̿��� �簢���� ���� �� ���
			System.out.print("\n");
			for(int j=1;j<=w;j++) { // ���� for���� �̿��� �簢���� ���� �� ���
				System.out.print("*");
			}
		}
		System.out.println();
		*/	
		
		/*#08 code ���α׷��� ���� ���� ���߱�
			
		Random rd = new Random(); // ���� ���� ��ü ����
		int answer = rd.nextInt(15); // 15������ �� �� ���� ���ڸ� ���� Ÿ������ ����
		
		Scanner scn = new Scanner(System.in); // �Է¿� ��ĳ�� ��ü ����
		
		int user_answer; // ���� �Է� ����
		int n = 0; // ���� �Է� Ƚ�� ����
		do { // do-while ���� �̿��� ���� ���߱� ���� 
			System.out.println("���� ���߱� �����Դϴ�.");
			System.out.print("���ڸ� �Է��ϼ��� :");

			user_answer = scn.nextInt(); // ���� �Է� ���� ��ū�� ���� Ÿ������ ����
			if (user_answer > answer) { //if���� �̿��� �Է� ���ڿ� ���� ��
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
				n++;
			}
			else if (user_answer < answer) { //if���� �̿��� �Է� ���ڿ� ���� ��
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
				n++;
				}
			else { // �Է� ���ڿ� ������ ���� ���
				System.out.println("�����Դϴ�~~~");
				n++;
				}
		}while(user_answer != answer);
		
		System.out.println(n+"������ ������ ���߼̽��ϴ�. ^^");
		
		System.out.println();
		 */
		
		/*#09 code ��� ���� ���ϱ�
		
		System.out.println("������ �Է��ϸ� ����� ���ص帳�ϴ�.");
		Scanner scn = new Scanner(System.in); //�Է¿� ��ĳ�� ��ü ����
		
		int student = 0; // �л� �� ����
		int total = 0; // �л��� ������ �� ����
		
		while(true) {
			
			System.out.print("�л��� ������ �Է��ϼ���. :");
			int grade = scn.nextInt(); // �л����� ������ ���� Ÿ������ ����
			
			if (grade < 0) //�л� ������ ������ ��� while�� Ż��
				break;
			else { // �л� ������ 0, ����� ��� 
				student ++; // �л� �� ���� +1
				total += grade; // ������ �� ������ ���� �ռ�
				continue; // continue���� �̿��� while�� ó������ ����
			}
		}
		
		System.out.println("�л����� ���� ����� "+total/student+"���Դϴ�.");	
		
		System.out.println();
		
		*/
		
		
		/*#10 code 1-1000 �� ¦���� ��
		
		int i = 0;
		int sum = 0; // �� ����
		
		while (i<=1000) { //while ������ 0���� 1000���� �ݺ�
			i += 1; 
			if (i%2==1) { //if���� �̿��� i�� Ȧ���� ���, while �� ó������ ����
				continue;
			}
			sum += i; // �� ������ i �ռ�
		}
		
		System.out.println("1���� 1000������ �� ��, ¦���� ���� "+sum+"�Դϴ�.");
		*/
		
		scn.close();	//��ĳ�� �ݱ�
	}

}