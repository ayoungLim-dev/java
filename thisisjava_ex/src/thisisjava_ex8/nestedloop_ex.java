// 이것이 자바다 chapter 5 참조 타입 예제 문제
// 예제 8번 - 주어진 배열의 전체 항목의 합과 평균값을 구해보세요. (중첩 for문 이용)

package thisisjava_ex8;

public class nestedloop_ex {
	public static void main(String[] args) {
		// 2차원 배열 값 초기화 되어있는 상태
		int[][] array = {{95, 86},
						{83, 92, 96},
						{78, 83, 93, 87, 88}};
		
		//합 변수와 평균 변수, 나누는 수 선언
		int sum = 0;
		double avg = 0.0;
		double n = 0.0;
		
		// 이중 for문을 이용해 sum에 array 배열 값 하나씩 저장 
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				n++; // array 배열 길이를 double 타입으로 저장
			}
		}
		// 평균 = 합 / 개수
		avg = sum / n;
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
}
