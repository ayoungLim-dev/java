//java ���α׷��� ���� 5���� ���� 1

public class CallByValueTest { //�⺻ Ÿ���� �� ���� - ������ ���� ������� ����
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
