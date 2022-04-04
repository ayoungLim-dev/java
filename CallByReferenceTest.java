//java ���α׷��� ���� 5���� ���� 2

public class CallByReferenceTest { //��ü ���� - ������ ��ü ����
	int x;
	int y;
	
	CallByReferenceTest(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void swap(CallByReferenceTest test) {
		int tmp;
		tmp=test.x;
		test.x=test.y;
		test.y=tmp;
		System.out.println("in swap()");
		System.out.println("x="+test.x+", y="+test.y);
	}
	
	public static void main(String[] args) {
		
		CallByReferenceTest cbrt=new CallByReferenceTest(3,5);
		
		System.out.println("in main(): before swap");
		System.out.println("x="+cbrt.x+", y="+cbrt.y);
		
		cbrt.swap(cbrt);
		
		System.out.println("in main(): after swap");
		System.out.println("x="+cbrt.x+", y="+cbrt.y);
	}
}
