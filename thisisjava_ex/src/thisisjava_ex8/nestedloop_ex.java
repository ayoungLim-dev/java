// �̰��� �ڹٴ� chapter 5 ���� Ÿ�� ���� ����
// ���� 8�� - �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���غ�����. (��ø for�� �̿�)

package thisisjava_ex8;

public class nestedloop_ex {
	public static void main(String[] args) {
		// 2���� �迭 �� �ʱ�ȭ �Ǿ��ִ� ����
		int[][] array = {{95, 86},
						{83, 92, 96},
						{78, 83, 93, 87, 88}};
		
		//�� ������ ��� ����, ������ �� ����
		int sum = 0;
		double avg = 0.0;
		double n = 0.0;
		
		// ���� for���� �̿��� sum�� array �迭 �� �ϳ��� ���� 
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				n++; // array �迭 ���̸� double Ÿ������ ����
			}
		}
		// ��� = �� / ����
		avg = sum / n;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
}
