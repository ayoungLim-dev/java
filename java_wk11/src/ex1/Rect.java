package ex1;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int a, int b) {
		this.width = a; 
		this.height = b;
		
		getArea();
	}
	
	public int getArea() {
		System.out.println( "¸éÀûÀº "+ width * height );
		return 0;
	}
	
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if(width == p.width && height == p.height) 
			return true;
		else
			return false;
	}

}
