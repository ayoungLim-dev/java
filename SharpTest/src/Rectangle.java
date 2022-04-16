class Rectangle extends Shape{
	private int width, height;
	
	public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}
