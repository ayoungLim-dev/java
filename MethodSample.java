//java ���α׷��� ���� 5���� ���� 3

public class MethodSample {
	
	int x;
	int y;
	
	MethodSample(){
		this.x=1;
		this.y=2;
	}
	
	int getSum() { //�޼ҵ� �����ε�  - �Ű������� ������ �ٸ�
		return this.x+this.y;
	}
	
	int getSum(int a) { //�޼ҵ� �����ε�
		return this.x+a;
	}
	
	int getSum(int a, int b) { //�޼ҵ� �����ε�
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodSample ms = new MethodSample();
		
		System.out.println("getSum() ȣ��");
		System.out.println(ms.getSum());
		
		System.out.println("getSum(int a) ȣ��");
		System.out.println(ms.getSum(10));
		
		System.out.println("getSum(int a, int b) ȣ��");
		System.out.println(ms.getSum(10, 7));
		
	}
	
}
