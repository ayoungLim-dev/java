/*
Ex7. ������ 10�� �����ϴ� �迭�� ����� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�.
   �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
*/

package random_avg;
/*
 Math.random() : double ������, 0.0�̻� 1.0 �̸� ������ ���� ��ȯ�ϴ� �Լ� 
 Math.random()*10 = 0.0~10.0 �̸� ������ ���� ��ȯ -> ����, +1�� ����� 1~10������ ���� O
*/
public class ranavg {
	public static void main(String[] args) {
		// ���� 10���� �����ϴ� �迭 ����
		int intArray[] = new int[10]; 
		
		// �迭�� ����� ���ϴµ� �ʿ��� �ʵ� ����
		double avg = 0.0;
		int sum = 0;
		double count = 0.0;
		
		System.out.print("������ ������ : ");
		// 
		for(int i = 0; i<intArray.length; i++) {
			// 1~10������ ���� ������ �����ϴ� �ڵ�
			int rd = (int)(Math.random()*10+1);
			intArray[i] = rd; // intArray �迭�� rd �� ���ʴ�� ����ֱ�
			sum = rd; // ���� ������ ��
			count ++;
			System.out.print(intArray[i]+" "); // intArray ���� ���
		}//for��
		
		avg = sum/count; // ��� = �� / ����
		System.out.println("\n����� "+avg+"�Դϴ�."); // ��� ���

	}//main
}//class
