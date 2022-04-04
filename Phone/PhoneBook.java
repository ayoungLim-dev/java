package Phone;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		  
		  //1, 저장할 사람의 수 입력 받기
		  System.out.print("인원 수>> "); // 인원 수 입력 받기
		  int num = scanner.nextInt(); // 입력 받은 숫자 문자 -> 숫자 타입으로 저장
		  
		  //2. phone 객체 배열 생성
		  Phone[] phone = new Phone[num]; //객체 배열 생성
		  
		  //3. 입력 받은 정보 phone 배열에 저장
		  for (int i=0;i<num;i++) { // for 문을 이용해  인원 수대로 이름과 전화 번호 입력 받기
			  System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
			  String name = scanner.next(); // 입력 받은 첫번째 토큰을 name 변수에 저장
			  String tel = scanner.next(); // 입력 받은 두번째 토큰을 tel 변수에 저장
			  scanner.nextLine(); 
			  phone[i] = new Phone(name, tel); // 저장한 name, tel을 phone 배열에 저장
		  }
		  
		  System.out.println("저장되었습니다 . . .");
	  
		  //4. 검색 조건문 생성
		  while (true) {
			 System.out.print("검색할 이름>> ");
			 String input= scanner.next(); // 입력 받은 토큰을 input 변수에 저장
			  
			 // check 변수 설정
			 int check = 1; 
			 
			  //5. equals()함수를 사용해 입력 문자열이 배열의 원소와 같다면 전화번호 출력
			  for (int i=0;i<num;i++) { 
					 if (input.equals(phone[i].name)) {
							System.out.println(input+"의 번호는 "+phone[i].tel+" 입니다.");
							check --; // check 변수 값이 1이 되지 않도록 
					 }
					 
			  }
			
			 //5. equals()함수를 사용해 입력 문자열이 "그만"과 같다면 while문 탈출 
			if (input.equals("그만")) 
				break;
			
			// check 변수가 그대로 1이라면, (배열의 원소와 같지 않음) 입력 문자열의 정보가 없음을 출력
			if (check == 1)
				System.out.println(input+"이 없습니다.");

		  }

	scanner.close(); // 스캐너 객체 닫기

	}
}
