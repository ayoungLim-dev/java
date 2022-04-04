// java 프로그래밍 기초 4주차 예제 2

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); //객체 생성 (생성자)
		
		Scanner scanner = new Scanner(System.in); // 입력 스캐너 객체 생성
		System.out.print(">>");
		
		rect.width = scanner.nextInt(); // scanner의 첫 번째 토큰을 rect 객체 레퍼런스 변수의 width으로 받아와라(int 타입)
		rect.height = scanner.nextInt(); // scanner의 두 번째 토큰을 rect 객체 레퍼런스 변수의 hight으로 받아와라(int 타입) 
		
		System.out.println("사각형의 면적은"+rect.getArea());
		
		scanner.close();
		
	}
	
}
