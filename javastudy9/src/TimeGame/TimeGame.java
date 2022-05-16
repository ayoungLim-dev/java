package TimeGame;
/*
6. 경과시간을 맞추는 게임을 작성하라. 다음 예시를 참고하면 <Enter> 키를 입력하면 현재 초 시간을 보여주고
여기서 10초에 더 근접하도록 다음 <Enter> 키를 입력한 사람이 이기는 게임이다. 
*/
import java.util.Scanner;
import java.util.Calendar;

public class TimeGame {
	Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
	String str;
	
	public int run() {
		while(!(str = scanner.nextLine()).equals("")); //엔터키를 입력받으면 종료
		Calendar cal = Calendar.getInstance(); // Calendar 객체 생성 (현재 시간 값)
		
		int sec1 = cal.get(Calendar.SECOND); //시작 시각을 초 단위로 저장
		System.out.println("현재 초 시간 = " + sec1);
		
		System.out.print("10초 에상 후 <Enter>키>>");
		
		while(!(str = scanner.nextLine()).equals(""));
		cal = Calendar.getInstance(); // 새로운 현재 시간 값을 받음
		
		int sec2 = cal.get(Calendar.SECOND); //종료 시각을 초 단위로 저장
		System.out.println("현재 초 시간 = " + sec2);
		int result = Math.abs(sec2 - sec1);		// Math.abs() 함수 : 인자값에 대한 절대값을 반환하는 함수, 입력타입 그대로 리턴
		
		if(sec2 - sec1 < 0) return 60 - result; //단위가 넘어가면 조정
		
		return result;
	}
	
	public static void main(String[] args) {
		TimeGame time = new TimeGame(); // time 객체 생성
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		System.out.print("황기태 시작 <Enter>키>>"); // 황기태 
		int Hwang = time.run();
		System.out.print("이재문 시작 <Enter>키>>"); // 이재문
		int Lee = time.run();
		System.out.print("황기태의 결과 " + Hwang + ", 이재문의 결과 " + Lee + ", ");
		if(Math.abs(10 - Hwang) < Math.abs(10 - Lee))
			System.out.println("승자는 황기태");
		else if(Math.abs(10 - Hwang) == Math.abs(10 - Lee))
			System.out.println("무승부");
		else
			System.out.println("승자는 이재문");
		
	}
	

}
