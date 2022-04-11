/*
Ex7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
   그리고 배열에 든 숫자들과 평균을 출력하라.
*/

package random_avg;
/*
 Math.random() : double 형으로, 0.0이상 1.0 미만 사이의 값을 반환하는 함수 
 Math.random()*10 = 0.0~10.0 미만 사이의 값을 반환 -> 따라서, +1을 해줘야 1~10사이의 범위 O
*/
public class ranavg {
	public static void main(String[] args) {
		// 정수 10개를 저장하는 배열 생성
		int intArray[] = new int[10]; 
		
		// 배열의 평균을 구하는데 필요한 필드 선언
		double avg = 0.0;
		int sum = 0;
		double count = 0.0;
		
		System.out.print("랜덤한 정수들 : ");
		// 
		for(int i = 0; i<intArray.length; i++) {
			// 1~10까지의 랜덤 정수를 생성하는 코드
			int rd = (int)(Math.random()*10+1);
			intArray[i] = rd; // intArray 배열에 rd 값 차례대로 집어넣기
			sum = rd; // 랜덤 정수의 합
			count ++;
			System.out.print(intArray[i]+" "); // intArray 원소 출력
		}//for문
		
		avg = sum/count; // 평균 = 합 / 개수
		System.out.println("\n평균은 "+avg+"입니다."); // 평균 출력

	}//main
}//class
