package java_ex;

import java.util.Scanner;
import java.util.Random; //랜덤 함수 - 예제 8

public class java_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* #01 code 근무시간에 따른 임금 계산 */
		 
		System.out.println("2022년도 최저시급은 9,160원 입니다.");
		System.out.print("하루 근무시간을 입력하세요: ");
		Scanner scn=new Scanner(System.in);	//입력용 스캐너 객체 생성
		
		int your_pay = scn.nextInt(); // 정수 타입으로 리턴
		int pay=your_pay*9160; // 근무시간 * 2022년 최저시급
		
		if (your_pay<=8)
			System.out.println("당신의 하루 임금은 "+pay+"원 입니다.");
		else 
			System.out.println("당신의 하루 임금은 "+pay*1.5+"원 입니다.");

		System.out.println();
		
		
		/*#02 code 소득세 계산

		System.out.println("연 소득에 따른 소득세를 계산해드립니다.");
		System.out.print("연 소득(과세 표준)을 만 원 단위로 입력해주세요: ");
		Scanner scn=new Scanner(System.in);	//입력용 스캐너 객체 생성
		
		float income = scn.nextFloat(); // 실수 타입으로 리턴
		
		if (income<=1000)
			System.out.println("당신의 소득세는 "+income*0.09+"만원입니다.");
		else if (income<=4000)
			System.out.println("당신의 소득세는 "+income*0.18+"만원입니다.");
		else if (income<=8000)
			System.out.println("당신의 소득세는 "+income*0.27+"만원입니다.");
		else //8000만원 초과
			System.out.println("당신의 소득세는 "+income*0.36+"만원입니다.");
		
		System.out.println();
		*/
		
		/*#03 code 점수에 따른 학점 계산
		
		System.out.println("점수를 입력하면 학점 계산을 해드립니다.");
		System.out.print("점수를 입력하세요. : ");
		Scanner scn = new Scanner(System.in); //입력용 스캐너 객체 생성
		
		int grade = scn.nextInt(); // 정수 타입으로 리턴
		
		if (grade >= 95)
			System.out.println("당신의 학점은 A+ 입니다.");
		else if (grade >= 90)
			System.out.println("당신의 학점은 A 입니다.");
		else if (grade >= 85)
			System.out.println("당신의 학점은 B+ 입니다.");
		else if (grade >= 80)
			System.out.println("당신의 학점은 B 입니다.");
		else if (grade >= 75)
			System.out.println("당신의 학점은 C+ 입니다.");
		else if (grade >= 70)
			System.out.println("당신의 학점은 C 입니다.");
		else  //grade가 70 미만인 경우
			System.out.println("당신의 학점은 D 혹은 F 입니다.");
		
		System.out.println();
		
		*/
		
		/*#04 code n을 입력받아 1부터 n까지의 합
		
		System.out.println("숫자를 입력하면 1부터 해당 숫자까지의 합을 출력합니다.");
		System.out.print("숫자를 입력하세요: ");
		Scanner scn = new Scanner(System.in); // 입력용 스캐너 객체 생성
		
		int n = scn.nextInt(); // 정수 타입으로 리턴
		int sum = 0;
		
		for(int i=0; i <= n; i++) {
			sum += i;
		}//for문을 이용해 1-n의 합 변수에 저장
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
		System.out.println();
	
		*/
		 
		/*#05 code n을 입력받아 n의 구구단 출력
		
		System.out.println("원하는 숫자를 입력하면 해당 숫자의 구구단을 출력합니다.");
		System.out.print("원하는 숫자를 입력하세요: ");
		Scanner scn = new Scanner(System.in); // 입력용 스캐너 객체 생성
		
		int n = scn.nextInt(); // 정수 타입으로 리턴
		int i = 1; 
		
		System.out.printf("[ %d단 ]\n", n);
		
		while(i<=9) {
			System.out.printf(" %d X %d = %d |", n, i, n*i); //printf 문으로 %d 사용
			i +=1; 
		}
		
		System.out.println();
	
		*/
		
		/*#06 code 이중 for문을 이용한 1-9단 구구단 출력

		for (int i=1; i<=9; i++) { // for문을 이용해 1-9단 출력 
			System.out.printf("%d단 |", i);
			for (int j=1; j<=9; j++) { // 이중 for문을 이용해 1-9단의 곱셈을 반복
				System.out.printf(" %d x %d = %d |", i, j, i*j);
			}
			System.out.println("\n");
		}
	
		System.out.println();
		*/
		
		/*#07 code 이중 for문을 이용한 * 사각형 출력

		System.out.println("*으로 사각형을 만드려고 합니다.");
		System.out.print("만들고자 하는 사각형의 가로와 세로 길이를 빈칸으로 분리하여 입력하세요(2 이상): ");
		Scanner scn=new Scanner(System.in);	//입력용 스캐너 객체 생성
		
		int w = scn.nextInt(); // [사각형의 가로 길이]를 정수 타입으로 리턴
		int h = scn.nextInt(); // [사각형의 세로 길이]를 정수 타입으로 리턴
		
		for(int i=1;i<=h;i++) { // for문을 이용해 사각형의 세로 줄 출력
			System.out.print("\n");
			for(int j=1;j<=w;j++) { // 이중 for문을 이용해 사각형의 가로 줄 출력
				System.out.print("*");
			}
		}
		System.out.println();
		*/	
		
		/*#08 code 프로그램이 정한 숫자 맞추기
			
		Random rd = new Random(); // 랜덤 숫자 객체 생성
		int answer = rd.nextInt(15); // 15까지의 수 중 랜덤 숫자를 정수 타입으로 리턴
		
		Scanner scn = new Scanner(System.in); // 입력용 스캐너 객체 생성
		
		int user_answer; // 정답 입력 변수
		int n = 0; // 정답 입력 횟수 변수
		do { // do-while 문을 이용한 숫자 맞추기 게임 
			System.out.println("숫자 맞추기 게임입니다.");
			System.out.print("숫자를 입력하세요 :");

			user_answer = scn.nextInt(); // 정답 입력 변수 토큰을 정수 타입으로 리턴
			if (user_answer > answer) { //if문을 이용해 입력 숫자와 정답 비교
				System.out.println("입력하신 숫자보다 작습니다.");
				n++;
			}
			else if (user_answer < answer) { //if문을 이용해 입력 숫자와 정답 비교
				System.out.println("입력하신 숫자보다 큽니다.");
				n++;
				}
			else { // 입력 숫자와 정답이 같은 경우
				System.out.println("정답입니다~~~");
				n++;
				}
		}while(user_answer != answer);
		
		System.out.println(n+"번만에 정답을 맞추셨습니다. ^^");
		
		System.out.println();
		 */
		
		/*#09 code 평균 점수 구하기
		
		System.out.println("점수를 입력하면 평균을 구해드립니다.");
		Scanner scn = new Scanner(System.in); //입력용 스캐너 객체 생성
		
		int student = 0; // 학생 수 변수
		int total = 0; // 학생들 점수의 합 변수
		
		while(true) {
			
			System.out.print("학생의 점수를 입력하세요. :");
			int grade = scn.nextInt(); // 학생들의 점수를 정수 타입으로 리턴
			
			if (grade < 0) //학생 점수가 음수일 경우 while문 탈출
				break;
			else { // 학생 점수가 0, 양수일 경우 
				student ++; // 학생 수 변수 +1
				total += grade; // 점수의 합 변수에 점수 합셈
				continue; // continue문을 이용해 while문 처음으로 리턴
			}
		}
		
		System.out.println("학생들의 점수 평균은 "+total/student+"점입니다.");	
		
		System.out.println();
		
		*/
		
		
		/*#10 code 1-1000 중 짝수의 합
		
		int i = 0;
		int sum = 0; // 합 변수
		
		while (i<=1000) { //while 문으로 0부터 1000까지 반복
			i += 1; 
			if (i%2==1) { //if문을 이용해 i가 홀수일 경우, while 문 처음으로 리턴
				continue;
			}
			sum += i; // 합 변수에 i 합셈
		}
		
		System.out.println("1부터 1000까지의 수 중, 짝수의 합은 "+sum+"입니다.");
		*/
		
		scn.close();	//스캐너 닫기
	}

}