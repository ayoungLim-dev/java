import java.util.Scanner;

// ������ Ŭ���� *�߰�
public class Admin{
	static int timeMoney=0; // ��ü �ð� ���� ���� ����
	static int foodMoney=0; // ��ü ���� ���� ���� ����
	static String adminKey = "swu2022"; // [������ ���] ���� �� �Է��� password
	
	Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
	
	// foodList 2���� �迭
	String foodList[][] = {{"������ġ", "5000"}, {"��ġ������", "6500"}, {"�ֵ���", "3000"},
			{"���̽��Ƹ޸�ī��", "2500"},{"�ݶ�, ���̴�", "1500"},{"���̽�ũ��", "1200"},{"����", "800"}};

	void foodChange() { // foodChange �޼ҵ� - ������ �̸��� ���� ���� ���� ( �ð� ������ �߰��� ���� ��ɵ� �� �غ��� )
		for(int i =0; i<foodList.length;i++) { // �޴��� ���
			System.out.print((i+1)+": ");
			for(int j=0;j<foodList[i].length;j++) {
				System.out.print(foodList[i][j]+"\t");
			}
			System.out.println();
		}
		
		try {		
			System.out.print("������ ���� ��ȣ�� �Է����ּ���: ");
			String foodNm = scanner.nextLine(); 
			int food = Integer.parseInt(foodNm); 
			
			if (food < (foodList.length+1)) { // 1~7���� ���� ����Ʈ ����

				System.out.print("���� �̸��� �Է����ּ��� :");
				String foodName = scanner.nextLine();
				foodList[food-1][0] = foodName;
				
				System.out.print("���� ������ �Է����ּ��� :");
				String foodPrice = scanner.next();
				foodList[food-1][1] = foodPrice;
				
				System.out.println("| ���� ���� |");
				
				for(int i =0; i<foodList.length;i++) {
					System.out.print((i+1)+": ");
					for(int j=0;j<foodList[i].length;j++) {
						System.out.print(foodList[i][j]+"\t");
					}
					System.out.println();
				}
				
				scanner.nextLine();
			}
			else {
				System.out.println("���� ������ ������ ������ϴ�.");
			}
		}catch(Exception e) {
			System.out.println("[ERR] �߸� �Է��ϼ̽��ϴ�.");
		}


		

	}
}
