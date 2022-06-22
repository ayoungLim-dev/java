
class SeatManage{
	// booleanŸ���� 2���� �迭�� ���͵���� �¼� 10�� ����
	boolean[][] setTable = new boolean[2][5];
		

	// SeatManage �޼ҵ� - setTable�� ��� ��Ҹ� false�� �ʱ�ȭ
	public SeatManage() {
		for(int i=0; i<setTable.length;i++) 
			for(int j=0;j<setTable[i].length;j++)
				setTable[i][j] = false;
	}

	// clear �޼ҵ� - �޴��� 3. ������ -> 2. ��ü �¼� ���� ���� �� ����
	// 				setTable ��� ��� false�� �缼��
	void clear() {
		for(int i=0; i<setTable.length;i++) 
			for(int j=0;j<setTable[i].length;j++) 
				setTable[i][j] = false;
	}
	
	// print �޼ҵ� - setTable�� �迭 ���� / null ���� + �¼� ��ȣ
	void print() {
		System.out.println();
		System.out.println("[ ���� �¼� ���� ]");
		for(int i=0;i<setTable.length;i++) {
			for(int j=0;j<setTable[i].length;j++) {
				if (setTable[i][j]==false)
					System.out.print("V");
				else
					System.out.print("C");
				System.out.print("["+(i+1)+(j+1)+"]"+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	// setSeat �޼ҵ� - if setTable��Ұ� null�� ��� true(V), else C
	// 				  �Ű����� x, y�� ��� ��
	boolean setSeat(int x, int y) {
		if(setTable[x][y] == false)
			setTable[x][y] = true;
		else
			System.out.println("�����");
		return true;
	}
	
	// releaseSeat �޼ҵ� - �ش� �¼� ��ȣ�� true�� ���, C->V ����
	void releaseSeat(int x, int y) {
		setTable[x][y] = false;
	}
}
