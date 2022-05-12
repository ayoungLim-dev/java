package javastudy7;

class Circle implements Shape {
	
	   int radius;
	   
	   public Circle(int radius) {
	      this.radius = radius;
	   }
	   public void draw() {
	      System.out.println("�������� "+radius+"�� ���Դϴ�.");
	   }
	   public double getArea() {
	      return PI*radius*radius;
	   }
	
	public static void main(String []args) {
		Shape donut = new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ "+donut.getArea());
	}

}
