package javaEx1;

// ColorTV Ŭ������ ����ϴ� IPTV Ŭ����
class IPTV extends ColorTV{
	// private Ÿ���� ip ����
	private String ip;
	
	// ip, size, color�� �Ű� ������ ���� ������ 
	public IPTV(String ip, int size, int color) {
		super(size, color); // ColorTV���� ȣ��
		this.ip = ip;
	}
	
	// ��� �޼���
	public void printProperty1() {
		System.out.print("���� IPTV�� "+ip+"�ּ��� ");
		printProperty();
	}
}
