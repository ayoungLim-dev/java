/*
java 프로그래밍 기초 6주차 예제 5
1. 배열의 length필드를 이용하여 배열 크기만큼 정수를 입력 받아 저장
2. 평균을 구하여 출력
*/

public class SkewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0]=new int[3];
		intArray[1]=new int[2];
		intArray[2]=new int[3];
		intArray[3]=new int[2];
		
		for (int i = 0 ; i < intArray.length ; i++) { // 2차원 배열의 길이
			for(int j = 0; j < intArray[i].length; j++) { // 1차원 배열의 길이 = intArray[0~3]의 길이
				intArray[i][j] = ((i+1)*10 + j); // 초기화 코드
				System.out.print(intArray[i][j]+" "); // 출력 코드
			}
			System.out.println(); // 한 행 끝날 때마다 \n 
		}		
	}
}
