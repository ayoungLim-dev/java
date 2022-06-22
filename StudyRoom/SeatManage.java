
class SeatManage{
	// boolean타입의 2차원 배열로 스터디룸의 좌석 10개 선언
	boolean[][] setTable = new boolean[2][5];
		

	// SeatManage 메소드 - setTable의 모든 요소를 false로 초기화
	public SeatManage() {
		for(int i=0; i<setTable.length;i++) 
			for(int j=0;j<setTable[i].length;j++)
				setTable[i][j] = false;
	}

	// clear 메소드 - 메뉴의 3. 관리자 -> 2. 전체 좌석 리셋 선택 시 실행
	// 				setTable 모든 요소 false로 재세팅
	void clear() {
		for(int i=0; i<setTable.length;i++) 
			for(int j=0;j<setTable[i].length;j++) 
				setTable[i][j] = false;
	}
	
	// print 메소드 - setTable의 배열 상태 / null 여부 + 좌석 번호
	void print() {
		System.out.println();
		System.out.println("[ 현재 좌석 상태 ]");
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
	// setSeat 메소드 - if setTable요소가 null일 경우 true(V), else C
	// 				  매개변수 x, y는 행과 열
	boolean setSeat(int x, int y) {
		if(setTable[x][y] == false)
			setTable[x][y] = true;
		else
			System.out.println("사용중");
		return true;
	}
	
	// releaseSeat 메소드 - 해당 좌석 번호가 true일 경우, C->V 변경
	void releaseSeat(int x, int y) {
		setTable[x][y] = false;
	}
}
