/*
java 프로그래밍 기초 6주차 예제 7
-0으로 나눌 때 발생하는 ArithmeticException 예외 처리
1. 예외 처리 전 실행
2. try-catch 블록을 이용 (정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!" 출력하고 다시 입력 받는 프로그램)
*/
import java.util.Scanner;
import java.lang.ArithmeticException;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		while(true) { // while문을 이용해 예외가 발생하지 않으면 종료, 예외가 발생하면 다시 실행
			// try-catch문을 이용해 '나누는 수가 0일 경우' try문이 다시 실행되도록
			try {
				System.out.print("나누어지는 수를 입력하시오:");
				int dividend = scanner.nextInt(); // 나누어지는 수 입력 , nextInt로 받음
				System.out.print("나누는 수를 입력하시오:");
				int divisor = scanner.nextInt(); // 나누는 입력. '0'을 입력했을 경우,ArithmeticException 예외 처리
				System.out.println(dividend +"를(을) "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");	
				break;
			}catch(ArithmeticException e) { // 예외 발생 시 catch문으로 예외 처리
				System.out.println("정수를 0으로 나눌 수 없습니다.");
				continue;
			}
		}
		scanner.close(); // 스캐너 객체 닫기
	}
}
