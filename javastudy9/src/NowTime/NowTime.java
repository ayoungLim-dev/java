package NowTime;
/*
5. Calendar 객체를 생성하면 현재 시간을 알 수 있다. 프로그램을 실행한 현재 시간이 새벽 4시에서 낮 12시 이전이면 "Good Morning"을,
	오후 6시 이전이면 "Good Afternoon"을, 밤 10시 이전이면 "Good Evening"을, 그 이후로는 "Good Night"을 출력하는 프로그램을 작성하라.
*/

import java.util.Calendar;

public class NowTime {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // Calendar 객체 생성 (현재 시간 값)
		
		int hour = now.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR는 12시간제이므로, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY 는 24시간제이므로 0-24
		int minute = now.get(Calendar.MINUTE);		
		System.out.println("현재 시간은 " + hour + "시 " + minute + "분입니다.");
		if(hour > 4 && hour < 12) 
			System.out.println("Good Morning");
		else if(hour >= 12 && hour < 18) 
			System.out.println("Good Afternoon");
		else if(hour >= 18 && hour < 22) 
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");		
	}
}