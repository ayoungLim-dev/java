/*
 java 프로그래밍 기초 6주차 예제 2
1. 배열의 length필드를 이용하여 배열 크기만큼 정수를 입력 받아 저장
2. 평균을 구하여 출력
*/

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 값이 5개인 배열 생성
		int sum =0; // 배열의 합
		
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		System.out.print(intArray.length+"개의 정수를입력하세요: ");
		
		for(int i : intArray) {
			i = scanner.nextInt(); //배열의 개수만큼 입력 받아, 저장하는 코드
			sum += i; // 배열 내의 모든 값을 합하는 코드
		}
		
		System.out.println("평균은 "+(double)sum/intArray.length);
		scanner.close();
	}
}
