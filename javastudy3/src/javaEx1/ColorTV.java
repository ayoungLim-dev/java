package javaEx1;

// TV Ŭ������ ��ӹ޴� ColorTV Ŭ����
class ColorTV extends TV {
	// private Ÿ�� color ����
	private int color;
	
	// size�� color�� �Ű� ������ ���� ������
	public ColorTV(int size, int color) {
		super(size); // ���� Ŭ������ TV���� ȣ��
		this.color = color;
	}
	
	// ��� �޼ҵ�
	public void printProperty() {
		System.out.println(getSize()+"��ġ "+color+"�÷�");
	}
}
