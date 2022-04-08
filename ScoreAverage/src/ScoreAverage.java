/*
java 프로그래밍 기초 6주차 예제 4
1. 2차원 배열로 4년 평점 구하기
2. 2차원 배열 정의
*/

public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4}, // 1학년 1, 2학기 평점
							{3.5, 3.6}, // 2학년 1, 2학기 평점
							{3.7, 4.0}, // 3학년 1, 2학기 평점
							{4.1, 4.2}};// 4학년 1, 2학기 평점
		
		double sum = 0;
		for(int year=0;year<score.length;year++) { // 각 학년별로 반복
			for (int term = 0; term<score[year].length;term++) // 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
		}
		int n = score.length; // 배열의 행 개수 , 4
		int m = score[0].length; // 배열의 열 개수 , 2
		System.out.println("The total average is "+sum/(n*m));
	}
}
