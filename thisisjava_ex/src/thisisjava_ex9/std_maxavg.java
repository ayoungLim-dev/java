// �̰��� �ڹٴ� chapter 5 ���� Ÿ�� ���� ����
// ���� 9�� - ������ Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��̴�. ���� ����� ���� �˸°� �ۼ��Ͽ���.

package thisisjava_ex9;
import java.util.Scanner;

public class std_maxavg {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
		
		// while ���� �̿��� run == false �� ������ �ݺ�
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. �л� �� | 2. ���� �Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("-----------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			// �Է� ���� ���� int Ÿ������ ����
			
			if(selectNo == 1) { // �Է� ���ڰ� 1�� ��� �л� �� ����
				System.out.print("�л� �� > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // �л� ���� ������ ���� �迭 ����
				scanner.nextLine();
			} //if(selectNo == 1) 
			
			else if(selectNo == 2) { // �Է� ���ڰ� 2�� ��� ���� �Է� �ޱ�
				//for���� �̿��� �л� ����ŭ ���� ����
				for (int i = 0; i < studentNum ; i++) {
					System.out.print("���� �Է� > ");
					//�Է� ���� �� scores �迭�� ���ʴ�� ����
					scores[i] = scanner.nextInt();
				}
				scanner.nextLine();
			} //else if(selectNo == 2)
			
			else if (selectNo == 3) { // �Է� ���ڰ� 3�� ��� ���� ����Ʈ �����ֱ�
				System.out.println("_____��������Ʈ______");
				// for ���� �̿��� scores�迭 ����
				for (int i = 0; i < scores.length ; i++) {
					System.out.println(scores[i]);
				}
			} //else if (selectNo == 3)
			
			else if (selectNo == 4) { // �Է� ���ڰ� 4�� ��� ���� �м��ϱ�
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				double n = 0.0;
				// for ���� �̿��� �ְ� ���� ���ϱ�
				for (int i = 0; i < scores.length ; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i]; // ����� ���� �� ���ϱ�
					n++; // ����� ���� ������ �� double Ÿ������ ���ϱ�
				}
				avg = sum / n; // ��� ���ϱ�
				System.out.println("�ְ� ������ "+max+"���Դϴ�.");
				System.out.println("��� ������ "+avg+"���Դϴ�.");
			} //else if (selectNo == 4)
			
			else if (selectNo == 5) { // �Է� ���ڰ� 5�� ��� while�� Ż���ϱ�
				run = false;
			} //else if (selectNo == 5)
		}
		scanner.close(); //��ĳ�� ��ü �ݱ�
	}
}
