
public class Customer extends Person {
	int seatID; 	// ���� �¼� ��ȣ
	long startTime; // ���� ���� �ð� ����
	long endTime; // ���� ���� �ð� ����
	int foodPay; // ���� ���� ��� ����
	int personalPay; // ���� �ð� ��� ����
	
	Customer(String name){
		// Person Ŭ������ (name�� �Ű������� �ϴ�) ������ ȣ��
		super(name); 
	}
}
