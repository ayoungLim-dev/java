//java 프로그래밍 기초 5주차 예제 4

package wk5_ex4;

import java.util.Scanner;

public class StaticMember{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		System.out.print("환율(1달러): ");
		double rate = scanner.nextDouble(); // 스캐너 객체로 받아오는 값을 Double 타입으로 읽어옴
		CurrencyConverter.setRate(rate); //미국 달러 환율 설정
		
		
		//String.format("%.2f",CurrencyConverter.toDollar(1000000));
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		
		System.out.println("$100는 "+CurrencyConverter.toKWR(100)+"원입니다.");
		scanner.close();
	}
}
