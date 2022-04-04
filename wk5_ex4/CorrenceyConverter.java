//java 프로그래밍 기초 5주차 예제 4

package wk5_ex4;


class CurrencyConverter {
	
	//한국 원화에 대한 환율
	private static double rate; //static 메소드 안 멤버는 무조건 static이어야 함 
	//rate 는 접근 지정자가 private이기 때문에 같은 클래스 내에서는 사용할 수 있지만, 외부에서는 접근 불가능.
	
	//한국 원화를 달러로 변환
	public static double toDollar(double won) { //static 메소드
		return won/rate; 
		
	}
	
	// 달러를 한국 원화로 변환
	public static double toKWR(double dollar) { //static 메소드
		return dollar*rate;
	}
	
	// 환율 설정. KWR/1$
	public static void setRate(double r) { //static 메소드
		rate = r;
	}
	
	
	
}
