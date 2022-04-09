/*
java 프로그래밍 기초 6주차 예제 8
-범위를 벗어난 배열의 접근 예외처리 전 실행(ArrayIndexOutOfBoundsException을 처리)
*/
public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5]; // 값이 5개인 int 타입 배열 생성
		intArray[0]=0; // intArray의 첫 번째 배열(intArray[0])을 0으로 초기화
		
		//try-catch문을 이용해 예외 발생 시 catch문으로 예외 처리
		try {
			for(int i=0;i<5;i++) {
				// i가 4일 경우 intArray[5]가 되므로 예외 발생
				intArray[i+1] = i+1+intArray[i];
				System.out.println("intArray["+i+"] = "+intArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			// intArray[4]는 범위를 벗어났으므로 예외 처리
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}
