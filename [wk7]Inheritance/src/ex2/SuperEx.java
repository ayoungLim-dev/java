package ex2;

/*super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point
의 생성자를 호출*/

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
		}
}
