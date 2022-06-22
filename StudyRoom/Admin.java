import java.util.Scanner;

// 관리자 클래스 *추가
public class Admin{
	static int timeMoney=0; // 전체 시간 수익 저장 변수
	static int foodMoney=0; // 전체 음식 수익 저장 변수
	static String adminKey = "swu2022"; // [관리자 모드] 실행 시 입력할 password
	
	Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	
	// foodList 2차원 배열
	String foodList[][] = {{"샌드위치", "5000"}, {"김치볶음밥", "6500"}, {"핫도그", "3000"},
			{"아이스아메리카노", "2500"},{"콜라, 사이다", "1500"},{"아이스크림", "1200"},{"생수", "800"}};

	void foodChange() { // foodChange 메소드 - 음식의 이름과 가격 수정 가능 ( 시간 남으면 추가나 삭제 기능도 함 해보자 )
		for(int i =0; i<foodList.length;i++) { // 메뉴판 출력
			System.out.print((i+1)+": ");
			for(int j=0;j<foodList[i].length;j++) {
				System.out.print(foodList[i][j]+"\t");
			}
			System.out.println();
		}
		
		try {		
			System.out.print("수정할 음식 번호를 입력해주세요: ");
			String foodNm = scanner.nextLine(); 
			int food = Integer.parseInt(foodNm); 
			
			if (food < (foodList.length+1)) { // 1~7개의 음식 리스트 범위

				System.out.print("음식 이름을 입력해주세요 :");
				String foodName = scanner.nextLine();
				foodList[food-1][0] = foodName;
				
				System.out.print("음식 가격을 입력해주세요 :");
				String foodPrice = scanner.next();
				foodList[food-1][1] = foodPrice;
				
				System.out.println("| 수정 사항 |");
				
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
				System.out.println("음식 갯수의 범위를 벗어났습니다.");
			}
		}catch(Exception e) {
			System.out.println("[ERR] 잘못 입력하셨습니다.");
		}


		

	}
}
