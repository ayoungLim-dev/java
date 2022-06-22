import java.util.Calendar;

public class Payment{
	static int total_Income = 0; // �ð� �� �� �ݾ�
	final int FEE_PER_MINUTE = 100; // �� �� ����(��)
	final int FEE_PER_HOUR = 5000; // �ð� �� ����(��)
	

	//setIn���� ȣ�� _����ð� ����
	long setCheckIn() {
		Calendar cal = Calendar.getInstance(); // Calendar ��ü ���� (���� �ð� ��)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR�� 12�ð����̹Ƿ�, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY �� 24�ð����̹Ƿ� 0-24
		int minute = cal.get(Calendar.MINUTE);		
		int second = cal.get(Calendar.SECOND);
		System.out.println("����ð�: " + year + "�� "+ month +"�� "+day+"�� "+hour + "�� " + minute + "�� "+second+"��");
		return day*60*60*24 + hour*60*60 + minute*60 + second;
	}


	//setOut���� ȣ�� _����ð� ����
	long setCheckOut() {
		Calendar cal2 = Calendar.getInstance(); // Calendar ��ü ���� (���� �ð� ��)
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH)+1;
		int day2 = cal2.get(Calendar.DAY_OF_MONTH);
		int hour2 = cal2.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR�� 12�ð����̹Ƿ�, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY �� 24�ð����̹Ƿ� 0-24
		int minute2 = cal2.get(Calendar.MINUTE);		
		int second2 = cal2.get(Calendar.SECOND);
		System.out.println("����ð�: " + year2 + "�� "+month2+"�� "+day2+"�� "+hour2 + "�� " + minute2 + "�� "+second2+"��");
		return day2*60*60*24 + hour2*60*60 + minute2*60 + second2;
	}
	
	// ���ð� ��� startT, endT
	int calculateFee(long startTime, long endTime) {

		int result = (int)(endTime-startTime);
		if(endTime - startTime < 0) // endT / startT ������� ����� ���� 
			return (int)(60 - result);
		System.out.println("��� �ð�: "+ result/60/60+"�ð� "+result/60 + "�� "+result%60 + "��"); // ��� �ð� ���

		if(result/60 < 1) { // 1�ð� �̸� ��� �� 
			System.out.println("�ð� ��� ���: " + FEE_PER_MINUTE*(result/60)+"��");
			total_Income += FEE_PER_MINUTE*(result/60);
		}else { // 1�ð� �̻� ��� ��
			System.out.println("�ð� ��� ���: "+(int)((int)(FEE_PER_HOUR*(result/60/60))+ (int)(FEE_PER_MINUTE*(result/60)))+"��");
			total_Income += (int)(FEE_PER_HOUR*(result/60/60))+(int)(FEE_PER_MINUTE*(result/60));
		}
		return 0;
	}

}

