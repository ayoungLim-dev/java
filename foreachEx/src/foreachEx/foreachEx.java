/*
 java 프로그래밍 기초 6주차 예제 3
1. for - each 문 활용
*/

package foreachEx;

public class foreachEx {
	enum Week{월,화,수,목,금,토,일}; // enum : 고정된 값을 반복할 때 매우 유용
	
	public static void main(String[] args) {
		int []n= {1,2,3,4,5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int sum =0;
		
		//아래 for-each에서 k는 n[0[], n[1] ... n[4]로 반복
		for(int k:n) {
			System.out.print(k+" "); // 반복되는 k값 출력
			sum += k;
		}
		
		System.out.println("합은 "+sum);
		
		//아래 for-each에서 s는 names[0[], names[1] ... names[5]로 반복
		for(String s : names) {
			System.out.print(s+" "); // 반복되는 s값 출력
		}
		System.out.println();
		
		//아래 for-each에서 k는 n[0[], n[1] ... n[4]로 반복
		for(Week day : Week.values()) {
			System.out.print(day+" "); // 반복되는 k값 출력
		}
		System.out.println();
	}
}
