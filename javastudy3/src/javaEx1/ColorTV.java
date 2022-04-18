package javaEx1;

// TV 클래스를 상속받는 ColorTV 클래스
class ColorTV extends TV {
	// private 타입 color 선언
	private int color;
	
	// size와 color를 매개 변수로 갖는 생성자
	public ColorTV(int size, int color) {
		super(size); // 슈퍼 클래스인 TV에서 호출
		this.color = color;
	}
	
	// 출력 메소드
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}
