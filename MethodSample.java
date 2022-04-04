//java 프로그래밍 기초 5주차 예제 3

public class MethodSample {
	
	int x;
	int y;
	
	MethodSample(){
		this.x=1;
		this.y=2;
	}
	
	int getSum() { //메소드 오버로딩  - 매개변수의 개수가 다름
		return this.x+this.y;
	}
	
	int getSum(int a) { //메소드 오버로딩
		return this.x+a;
	}
	
	int getSum(int a, int b) { //메소드 오버로딩
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodSample ms = new MethodSample();
		
		System.out.println("getSum() 호출");
		System.out.println(ms.getSum());
		
		System.out.println("getSum(int a) 호출");
		System.out.println(ms.getSum(10));
		
		System.out.println("getSum(int a, int b) 호출");
		System.out.println(ms.getSum(10, 7));
		
	}
	
}
