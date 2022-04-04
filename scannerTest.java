// java 프로그래밍 3주차 예제

package scannerTest;

import java.util.Scanner;

public class scannerTest {
	
	public static void main(String[] args) {
		
		//Scanner 예제 1
		System.out.println("Scanner 예제 1번입니다.");
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		// 프로그램 전, 변수를 미리 선언하는 것처럼 위치를 앞쪽에 많이 넣어두는 경향이 있음
		
		String name = scanner.next(); // 문자열 읽기
		System.out.print("이름은 "+name+", ");
		
		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 "+city+", ");
		
		int age = scanner.nextInt(); // 정수 읽기
		System.out.print("나이는 "+age+"살, ");
		
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.print("체중은 "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 "+single+"입니다");
		
		if(single == true)
			System.out.println("독신입니다.");
		else
			System.out.println("독신 아닙니다.");
		
		scanner.nextLine(); //(원래의 함수 목적관 다르게) 입력 버퍼 클린 목적으로 사용 - 무의미한 작업
		// nextLine() : 마지막 \n을 버리고 그 앞쪽까지의 문자열을 받아오는 함수
		
		// Scanner 예제 2
		System.out.println("Scanner 예제 2번입니다.");
		System.out.print("typing anything:");
		
		//String lineTest = scanner.nextLine();
		//System.out.println(lineTest);
		
		//scanner.nextLine()을 안적으면 hasNext에서 앞쪽 예제1의 마지막 \n을 String으로 받아옴
		while(scanner.hasNext()) { // ctrl-z = false 반환
			String tokenT = scanner.next();
			System.out.println(tokenT);
		}
		
		scanner.close(); // scanner 닫기
	}
}
