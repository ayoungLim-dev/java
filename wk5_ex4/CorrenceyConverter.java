//java ���α׷��� ���� 5���� ���� 4

package wk5_ex4;


class CurrencyConverter {
	
	//�ѱ� ��ȭ�� ���� ȯ��
	private static double rate; //static �޼ҵ� �� ����� ������ static�̾�� �� 
	//rate �� ���� �����ڰ� private�̱� ������ ���� Ŭ���� �������� ����� �� ������, �ܺο����� ���� �Ұ���.
	
	//�ѱ� ��ȭ�� �޷��� ��ȯ
	public static double toDollar(double won) { //static �޼ҵ�
		return won/rate; 
		
	}
	
	// �޷��� �ѱ� ��ȭ�� ��ȯ
	public static double toKWR(double dollar) { //static �޼ҵ�
		return dollar*rate;
	}
	
	// ȯ�� ����. KWR/1$
	public static void setRate(double r) { //static �޼ҵ�
		rate = r;
	}
	
	
	
}
