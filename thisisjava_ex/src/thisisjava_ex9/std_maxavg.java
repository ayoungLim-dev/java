// 이것이 자바다 chapter 5 참조 타입 예제 문제
// 예제 9번 - 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램이다. 실행 결과를 보고 알맞게 작성하여라.

package thisisjava_ex9;
import java.util.Scanner;

public class std_maxavg {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		// while 문을 이용해 run == false 될 때까지 반복
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			// 입력 받은 값을 int 타입으로 받음
			
			if(selectNo == 1) { // 입력 숫자가 1인 경우 학생 수 묻기
				System.out.print("학생 수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // 학생 수를 개수로 갖는 배열 생성
				scanner.nextLine();
			} //if(selectNo == 1) 
			
			else if(selectNo == 2) { // 입력 숫자가 2인 경우 점수 입력 받기
				//for문을 이용해 학생 수만큼 점수 묻기
				for (int i = 0; i < studentNum ; i++) {
					System.out.print("점수 입력 > ");
					//입력 받은 값 scores 배열에 차례대로 저장
					scores[i] = scanner.nextInt();
				}
				scanner.nextLine();
			} //else if(selectNo == 2)
			
			else if (selectNo == 3) { // 입력 숫자가 3인 경우 점수 리스트 보여주기
				System.out.println("_____점수리스트______");
				// for 문을 이용해 scores배열 나열
				for (int i = 0; i < scores.length ; i++) {
					System.out.println(scores[i]);
				}
			} //else if (selectNo == 3)
			
			else if (selectNo == 4) { // 입력 숫자가 4인 경우 점수 분석하기
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				double n = 0.0;
				// for 문을 이용해 최고 점수 구하기
				for (int i = 0; i < scores.length ; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i]; // 평균을 구할 합 더하기
					n++; // 평균을 구할 나누는 수 double 타입으로 구하기
				}
				avg = sum / n; // 평균 구하기
				System.out.println("최고 점수는 "+max+"점입니다.");
				System.out.println("평균 점수는 "+avg+"점입니다.");
			} //else if (selectNo == 4)
			
			else if (selectNo == 5) { // 입력 숫자가 5인 경우 while문 탈출하기
				run = false;
			} //else if (selectNo == 5)
		}
		scanner.close(); //스캐너 객체 닫기
	}
}
