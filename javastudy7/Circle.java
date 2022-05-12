package javastudy7;

class Circle implements Shape {
	
	   int radius;
	   
	   public Circle(int radius) {
	      this.radius = radius;
	   }
	   public void draw() {
	      System.out.println("반지름이 "+radius+"인 원입니다.");
	   }
	   public double getArea() {
	      return PI*radius*radius;
	   }
	
	public static void main(String []args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}

}
