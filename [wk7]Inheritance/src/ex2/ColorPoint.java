package ex2;

/*super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point
의 생성자를 호출*/

class ColorPoint extends Point{
	private String color; // 점의 색
	public ColorPoint(int x, int y, String color) {
	super(x, y); // Point의 생성자 Point(x, y) 호출
	this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
	System.out.print(color);
	showPoint(); // Point 클래스의 showPoint() 호출
	}
}
