package Array;

class ArrayUtil {
	
	//연결 메소드
	//
	public static int [] concat(int[] a, int[] b) {
		
		// 배열 a와 배열 b의 길이를 가리킬 변수 선언
		int al = 0;
		int bl = 0;
		
		// 반복문을 이용해 a 배열의 길이만큼 al 변수 값 더함 -> 배열 a의 길이 = al
		for (int i = 0; i<a.length ; i++)
			al++;
		// 반복문을 이용해 b 배열의 길이만큼 bl 변수 값 더함 -> 배열 b의 길이 = bl
		for (int i = 0; i<b.length ; i++)
			bl++;
		// -> 배열.length처럼 함수를 사용할 때, 변수에 값을 넣어 사용하는 게 컴파일러에 부담이 가지 않음
		
		
		//1. 새로운 배열(c) 생성
		int[] c = new int[al + bl];

		//2. 반복문을 이용해 al(배열 a의 길이)까지 배열 c 원소에 배열 a 원소 집어 넣기 
		for (int i=0;i<al;i++) {
			c[i] = a[i];
		}
		
		// 반복문을 이용해 bl(배열 b의 길이)까지 배열 c 원소에 배열 b 원소 집어 넣기 
		for (int i=0;i<bl;i++) {
			c[al] = b[i];
			al ++; // al의 길이 더해줌 || 이 코드를 안 넣어주면 배열 b의 값이 제대로 c에 들어가지 않음
		}
		
		return c; // 배열 c[]가 아닌 c : 배열의 역할이 아닌 배열의 위치를 레퍼런스하는 역할 
	}
	
	//출력 메소드
	public static void print(int[] a){
		
		int all = a.length; // 배열 a의 길이를 가리킬 변수 all 선언
		
		
		//1. 배열 a의 원소 출력
		System.out.print("[ ");
		for (int i=0;i<all;i++) { 
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");
		
	}
}
