package javastudy7;

interface Shape {
	final double PI =3.14;	// ���
	void draw();			// ������ �׸��� �߻� �޼ҵ�
	double getArea();		// ������ ������ �����ϴ� �߻�޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.println("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}