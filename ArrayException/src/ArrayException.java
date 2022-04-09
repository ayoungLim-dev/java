/*
java ���α׷��� ���� 6���� ���� 8
-������ ��� �迭�� ���� ����ó�� �� ����(ArrayIndexOutOfBoundsException�� ó��)
*/
public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5]; // ���� 5���� int Ÿ�� �迭 ����
		intArray[0]=0; // intArray�� ù ��° �迭(intArray[0])�� 0���� �ʱ�ȭ
		
		//try-catch���� �̿��� ���� �߻� �� catch������ ���� ó��
		try {
			for(int i=0;i<5;i++) {
				// i�� 4�� ��� intArray[5]�� �ǹǷ� ���� �߻�
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"] = "+intArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			// intArray[4]�� ������ ������Ƿ� ���� ó��
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
	}
}
