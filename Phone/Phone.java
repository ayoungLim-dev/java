package Phone;

class Phone {
	  // name , tel 필드
	  String name;
	  String tel; // - 포함으로 int 타입이 아닌 String 타입 선언
	  
	  // Phone 기본 생성자
	  public Phone() {
	  }
	  
	  // 인수로 name과 tel을 받는 생성자 생성
	  public Phone(String name, String tel) {
	       this.name=name; // this 레퍼런스를 이용해 인수로 받은 걸 객체의 멤버변수에 넣어줌 
	       this.tel=tel;
	  }

}