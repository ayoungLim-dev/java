import java.util.Calendar;

public class Payment{
	static int total_Income = 0; // 시간 당 총 금액
	final int FEE_PER_MINUTE = 100; // 분 당 가격(원)
	final int FEE_PER_HOUR = 5000; // 시간 당 가격(원)
	

	//setIn에서 호출 _입장시간 리턴
	long setCheckIn() {
		Calendar cal = Calendar.getInstance(); // Calendar 객체 생성 (현재 시간 값)
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR는 12시간제이므로, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY 는 24시간제이므로 0-24
		int minute = cal.get(Calendar.MINUTE);		
		int second = cal.get(Calendar.SECOND);
		System.out.println("입장시간: " + year + "년 "+ month +"월 "+day+"일 "+hour + "시 " + minute + "분 "+second+"초");
		return day*60*60*24 + hour*60*60 + minute*60 + second;
	}


	//setOut에서 호출 _퇴장시간 리턴
	long setCheckOut() {
		Calendar cal2 = Calendar.getInstance(); // Calendar 객체 생성 (현재 시간 값)
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH)+1;
		int day2 = cal2.get(Calendar.DAY_OF_MONTH);
		int hour2 = cal2.get(Calendar.HOUR_OF_DAY); //Calendar.HOUR는 12시간제이므로, 0-12 AM, 0-12PM / Calendar.HOUR_OF_DAY 는 24시간제이므로 0-24
		int minute2 = cal2.get(Calendar.MINUTE);		
		int second2 = cal2.get(Calendar.SECOND);
		System.out.println("퇴장시간: " + year2 + "년 "+month2+"월 "+day2+"일 "+hour2 + "시 " + minute2 + "분 "+second2+"초");
		return day2*60*60*24 + hour2*60*60 + minute2*60 + second2;
	}
	
	// 사용시간 계산 startT, endT
	int calculateFee(long startTime, long endTime) {

		int result = (int)(endTime-startTime);
		if(endTime - startTime < 0) // endT / startT 음수라면 양수로 조정 
			return (int)(60 - result);
		System.out.println("사용 시간: "+ result/60/60+"시간 "+result/60 + "분 "+result%60 + "초"); // 사용 시간 출력

		if(result/60 < 1) { // 1시간 미만 사용 시 
			System.out.println("시간 사용 요금: " + FEE_PER_MINUTE*(result/60)+"원");
			total_Income += FEE_PER_MINUTE*(result/60);
		}else { // 1시간 이상 사용 시
			System.out.println("시간 사용 요금: "+(int)((int)(FEE_PER_HOUR*(result/60/60))+ (int)(FEE_PER_MINUTE*(result/60)))+"원");
			total_Income += (int)(FEE_PER_HOUR*(result/60/60))+(int)(FEE_PER_MINUTE*(result/60));
		}
		return 0;
	}

}

