/*
java ���α׷��� ���� 6���� ���� 5
1. �迭�� length�ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է� �޾� ����
2. ����� ���Ͽ� ���
*/

public class SkewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0]=new int[3];
		intArray[1]=new int[2];
		intArray[2]=new int[3];
		intArray[3]=new int[2];
		
		for (int i = 0 ; i < intArray.length ; i++) { // 2���� �迭�� ����
			for(int j = 0; j < intArray[i].length; j++) { // 1���� �迭�� ���� = intArray[0~3]�� ����
				intArray[i][j] = ((i+1)*10 + j); // �ʱ�ȭ �ڵ�
				System.out.print(intArray[i][j]+" "); // ��� �ڵ�
			}
			System.out.println(); // �� �� ���� ������ \n 
		}		
	}
}
