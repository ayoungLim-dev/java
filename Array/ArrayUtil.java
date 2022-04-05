package Array;

class ArrayUtil {
	
	//���� �޼ҵ�
	//
	public static int [] concat(int[] a, int[] b) {
		
		// �迭 a�� �迭 b�� ���̸� ����ų ���� ����
		int al = 0;
		int bl = 0;
		
		// �ݺ����� �̿��� a �迭�� ���̸�ŭ al ���� �� ���� -> �迭 a�� ���� = al
		for (int i = 0; i<a.length ; i++)
			al++;
		// �ݺ����� �̿��� b �迭�� ���̸�ŭ bl ���� �� ���� -> �迭 b�� ���� = bl
		for (int i = 0; i<b.length ; i++)
			bl++;
		// -> �迭.lengthó�� �Լ��� ����� ��, ������ ���� �־� ����ϴ� �� �����Ϸ��� �δ��� ���� ����
		
		
		//1. ���ο� �迭(c) ����
		int[] c = new int[al + bl];

		//2. �ݺ����� �̿��� al(�迭 a�� ����)���� �迭 c ���ҿ� �迭 a ���� ���� �ֱ� 
		for (int i=0;i<al;i++) {
			c[i] = a[i];
		}
		
		// �ݺ����� �̿��� bl(�迭 b�� ����)���� �迭 c ���ҿ� �迭 b ���� ���� �ֱ� 
		for (int i=0;i<bl;i++) {
			c[al] = b[i];
			al ++; // al�� ���� ������ || �� �ڵ带 �� �־��ָ� �迭 b�� ���� ����� c�� ���� ����
		}
		
		return c; // �迭 c[]�� �ƴ� c : �迭�� ������ �ƴ� �迭�� ��ġ�� ���۷����ϴ� ���� 
	}
	
	//��� �޼ҵ�
	public static void print(int[] a){
		
		int all = a.length; // �迭 a�� ���̸� ����ų ���� all ����
		
		
		//1. �迭 a�� ���� ���
		System.out.print("[ ");
		for (int i=0;i<all;i++) { 
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");
		
	}
}
