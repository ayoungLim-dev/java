
import java.util.Scanner;

public class Menu {
	public static void main(String[]args) {

		//Management 클래스 객체 레퍼런스 선언
		Management menu = new Management();
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		String num;
		boolean run = true;
		while (run) { // 입력받은 숫자 num이 4라면 while문 탈출하고 프로그램 종료
			try {
				
				System.out.println("[LaLaLa StudyRoom]");
				System.out.println("1. 입장");
				System.out.println("2. 퇴장");
				System.out.println("3. 음식주문");
				System.out.println("4. 관리자");
				System.out.println("5. 프로그램 종료");
				System.out.print("--> ");

				num = scanner.nextLine(); // 입력받을 숫자 변수 선언
				
				// null, 공백일시
				if (num == null || num.length() == 0 ) {
					System.out.println("숫자를 입력하고, 엔터를 눌러주세요.");
					System.out.println();
				}
				// null이나 공백이 아닐 시
				else {
					for (int i = 0; i < num.length(); i++) {
						int c = (int) num.charAt(i);
						// 문자 or " "(공백) 입력 시
						if ((c < 48 || c > 57) || (num.contains(" "))) {
							System.out.println("문자를 입력하셨습니다.");
							System.out.println();
							break;
						}
						else { // 숫자 입력 
							switch(num) {
							case "1" :
								menu.setIn(); // 입장
								break;
							case "2" :
								menu.setOut(); // 퇴장
								break;
							case "3" :
								menu.orderFood(); // 음식 주문
								break;
							case "4" :
								menu.admin(); // 관리자 모드
								break;
							case "5" :
								menu.adminEnd(); // 종료
								run = false;
								break;
							default : 
								System.out.println("잘못 입력하셨습니다.");
								System.out.println();
							}
						}
					}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("");
			break;
		}
			
		}
		scanner.close(); // 스캐너 객체 닫기
		}	
}


