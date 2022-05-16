package NowTime;
/*
5. Calendar ��ü�� �����ϸ� ���� �ð��� �� �� �ִ�. ���α׷��� ������ ���� �ð��� ���� 4�ÿ��� �� 12�� �����̸� "Good Morning"��,
	���� 6�� �����̸� "Good Afternoon"��, �� 10�� �����̸� "Good Evening"��, �� ���ķδ� "Good Night"�� ����ϴ� ���α׷��� �ۼ��϶�.
*/

import java.util.Calendar;

public class NowTime {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // Calendar ��ü ���� (���� �ð� ��)
		
		int hour = now.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR�� 12�ð����̹Ƿ�, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY �� 24�ð����̹Ƿ� 0-24
		int minute = now.get(Calendar.MINUTE);		
		System.out.println("���� �ð��� " + hour + "�� " + minute + "���Դϴ�.");
		if(hour > 4 && hour < 12) 
			System.out.println("Good Morning");
		else if(hour >= 12 && hour < 18) 
			System.out.println("Good Afternoon");
		else if(hour >= 18 && hour < 22) 
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");		
	}
}