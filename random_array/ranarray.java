/*
Ex8. 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입히라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.
*/
package random_array;

import java.util.Scanner;

public class ranarray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		int input = 0; // 개수 입력 받을 변수 선언
		int[] intArray; // 정수 배열 생성
		
		System.out.print("정수 몇 개? ");
		input = scanner.nextInt(); // 입력 받은 토큰을 int 타입으로 input에 저장
		
		intArray = new int[input]; // 배열의 개수 초기화
		
		// for문을 이용해 1~100범위의 난수 배열에 input개 저장
		for (int i =0;i<input;i++) { // input = intArray.length
			int rd = (int)(Math.random()*100+1);
			intArray[i] = rd;
			System.out.print(intArray[i]+" ");
			
			// i+1이 10의 배수이고, input이 10 초과라면 줄바꿈
			if((i+1) % 10 == 0 && input > 10)
				System.out.println("\n");
		} //for문
		
		scanner.close(); // 스캐너 객체 닫기
	} //main
}//class
