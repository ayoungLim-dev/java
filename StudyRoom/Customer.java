
public class Customer extends Person {
	int seatID; 	// 고객의 좌석 번호
	long startTime; // 고객의 입장 시간 변수
	long endTime; // 고객의 퇴장 시간 변수
	int foodPay; // 고객의 음식 요금 변수
	int personalPay; // 고객의 시간 요금 변수
	
	Customer(String name){
		// Person 클래스이 (name을 매개변수로 하는) 생성자 호출
		super(name); 
	}
}
