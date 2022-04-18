package javaEx1;

// ColorTV 클래스를 상속하는 IPTV 클래스
class IPTV extends ColorTV{
	// private 타입의 ip 선언
	private String ip;
	
	// ip, size, color를 매개 변수로 갖는 생성자 
	public IPTV(String ip, int size, int color) {
		super(size, color); // ColorTV에서 호출
		this.ip = ip;
	}
	
	// 출력 메서드
	public void printProperty1() {
		System.out.print("나의 IPTV는 "+ip+"주소의 ");
		printProperty();
	}
}
