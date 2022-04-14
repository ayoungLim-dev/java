package ex2;

/*super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point
의 생성자를 호출*/

class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	public Point() {
		this.x = this.y = 0;
		}
		public Point(int x, int y) {
		this.x = x; this.y = y;
		}
		public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
		}
}
