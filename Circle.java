//java ���α׷��� 4���� ���� 3

public class Circle {
	
	int radius;
	String name;
	
	public Circle() { //�Ű� ���� ���� ������
		radius = 1; name = " "; // radius�� �ʱⰪ�� 1
	}
	
	public Circle(int r, String n) { // �Ű� ���� �ִ� ������ / ���� �����ڿ� �̸��� �Ȱ����� �ٸ� ����� ������. -> �����ε�
		radius = r; name = n;
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����"); //Circle ��ü ����, ������ 10, �̸��� "�ڹ�����" -> 2��° ������ ����
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		Circle donut = new Circle(); // Circle ��ü ���� -> 1��° ������ ���� 
		donut.name = "��������"; //������ �̸��� �������ڷ� �ʱ�ȭ -> ���� ������ () �ȿ� ���� ���� ���� = �Ű����� ���� �ٸ�
		area = donut.getArea();
		System.out.println(donut.name + "�� ������" + area);
	}
}