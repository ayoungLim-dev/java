//java 프로그래밍 4주차 예제 3

public class Circle {
	
	int radius;
	String name;
	
	public Circle() { //매개 변수 없는 생성자
		radius = 1; name = " "; // radius의 초기값은 1
	}
	
	public Circle(int r, String n) { // 매개 변수 있는 생성자 / 위의 생성자와 이름은 똑같지만 다른 기능의 생성자. -> 오버로딩
		radius = r; name = n;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자"); //Circle 객체 생성, 반지름 10, 이름은 "자바피자" -> 2번째 생성자 실행
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut = new Circle(); // Circle 객체 생성 -> 1번째 생성자 실행 
		donut.name = "도넛피자"; //도넛의 이름은 도넛피자로 초기화 -> 위의 생성자 () 안에 쓰면 실행 오류 = 매개변수 개수 다름
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
	}
}