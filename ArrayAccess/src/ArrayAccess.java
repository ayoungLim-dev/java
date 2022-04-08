/*
 java 프로그래밍 기초 6주차 예제 1
1. 배열을 생성하고 양수 5개를 입력 받아 저장
2. 제일 큰 수를 출력
*/
import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		int intArray[] = new int[5]; // 값이 5개인 1차원 배열 생성
		
		int max =0; // 현재 가장 큰 수
		
		System.out.println("양수를 5개 입력하세요: ");
		/*
		for(int i=0;i<5;i++) {
			intArray[i] = scanner.nextInt(); // 입력 받은 정수를 배열에 저장
			if(intArray[i] > max) // intArray[i]가 현재 가장 큰 수보다 크면 
				max = intArray[i]; // intArray[i]를 max로 변경
		}
		*/	
		// for - each 문
		for(int i : intArray) { // i 가 intArray[i]처럼 인덱스값 가리킴
			i = scanner.nextInt(); // 입력 받은 정수를 배열에 저장
			if(i > max) // i가 현재 가장 큰 수보다 크면 
				max = i; // i를 max로 변경
		}		
		System.out.println("가장 큰 수는 "+max+"입니다.");
		
		scanner.close(); // 스캐너 객체 닫기 
	}
	
}
