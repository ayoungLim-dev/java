package ex1;

public class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
		}
	
	public static void main(String [] args) {
		Shape a = new Shape();
		a.paint();
		Shape b = new Circle(); //upcasting
		b.paint();
	}
}
