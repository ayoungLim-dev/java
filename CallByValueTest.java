//java 프로그래밍 기초 5주차 예제 1

public class CallByValueTest { //기본 타입의 값 전달 - 실인자 값은 변경되지 않음
	void swap(int a, int b) {
		int tmp=0;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("in swap()");
		System.out.println("a="+a+", b="+b);
	}
	
	public static void main(String[] args) {
		int x=3, y=5;
		CallByValueTest cbvt=new CallByValueTest();
		
		System.out.println("in main(): before swap");
		System.out.println("x="+x+", y="+y);
		cbvt.swap(x, y);
		System.out.println("in main(): after swap");
		System.out.println("x="+x+", y="+y);
		
	}
}
