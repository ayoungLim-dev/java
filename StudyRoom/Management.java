
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Management {
	// field
	private int currentNo; // 현재 입장하는 손님의 번호 저장
	
	Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
	
	ArrayList<Customer> cst = new ArrayList<Customer>(10); // 사용자의 정보 저장(10)하는 ArrayList<E> 
	//Customer cst[] = new Customer[10];
	SeatManage seatMan=new SeatManage(); // seatManage 객체 레퍼런스
	Payment pay = new Payment(); // Payment 객체 레퍼런스
	Admin admin = new Admin(); // Admin 객체 레퍼런스 *추가
	
	Management() { // Management 메소드 - 필드값 초기화
		currentNo = 0;
	}
	
	void setIn() { // setIn 메소드 - menu 1 선택 시 실행 
		try {
			if((10 - currentNo) == 0) // 남은 좌석이 없다면 손님 X
				System.out.println("남은 좌석이 없습니다. 다음에 이용히주시길 바랍니다.");
			else { // 남은 좌석이 있다면 손님 O
				System.out.println();
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.next();
				
				if (name == null || name.length() == 0) { // null이거나 name의 길이가 0일 시 다시 입력
					System.out.println("이름을 입력하고, 엔터를 눌러주세요.");
					System.out.println();
				}
				// null이나 공백이 아닐 시
				else{
					if (name.matches("^[가-힣a-zA-Z]+$")) {
					// 이름에 한글이나 영어가 입력되어 있다면	
						seatMan.print();
						//System.out.println("현재 남은 좌석은 "+(10 - currentNo)+"입니다(V:빈좌석/C:찬좌석)");
						System.out.println("찬 좌석: "+currentNo+"\t"+"남은 좌석 : "+(10-currentNo));
						System.out.print("원하는 좌석을 고르세요 : ");
						int seatID = scanner.nextInt();
						
						if ((seatID/100 == 1) || (seatID/100 == 2 )) { // seatID가 1, 2로 시작하는 세자리 수일 경우
							if (seatMan.setTable[seatID/100-1][(seatID%100)/10-1] == false) { // 입력 좌석이 false
								cst.add(new Customer(name)); // cst ArrayList<E>에 고객 이름 정보 추가
								cst.get(currentNo).seatID = seatID; // 현재 고객 정보를 저장한 Index(currentNo)에 좌석 번호 저장
								cst.get(currentNo).startTime = pay.setCheckIn(); // 현재 고객의 입장 시간 레퍼런스 및 출력
								System.out.println("선택되었습니다.");
								seatMan.setSeat(seatID/100-1, (seatID%100)/10-1);
								 // 고객이 선택한 자리 true로 변경
								
								currentNo++; // 고객 번호 변수 증가
								
							}
							else // 입력 좌석이 true 
								System.out.println ("사융 중인 좌석입니다.");
						}
						else if (seatID/100 == 0) {
							if (seatID/10 == 0)
								System.out.println("좌석번호를 잘못 입력하셨습니다.");
							else {
								if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // 입력 좌석이 false
									cst.add(new Customer(name)); // cst ArrayList<E>에 고객 이름 정보 추가
									cst.get(currentNo).seatID = seatID; // 현재 고객 정보를 저장한 Index(currentNo)에 좌석 번호 저장
									cst.get(currentNo).startTime = pay.setCheckIn(); // 현재 고객의 입장 시간 레퍼런스 및 출력
									System.out.println("선택되었습니다.");
									seatMan.setSeat(seatID/10-1, seatID%10-1);
									 // 고객이 선택한 자리 true로 변경
									
									currentNo++; // 고객 번호 변수 증가
								}
								else  // 입력 좌석이 true 
									System.out.println ("사융 중인 좌석입니다.");
							}

						}
						System.out.println();
					}
					else {
						System.out.println("이름은 한글과 영어(대소문자)만 가능합니다.");
						System.out.println();
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("없는 좌석입니다.\n");
		}
	}
	
	/*
							else if(cst.size() == 0) { // 고객 정보가 없는 경우
							seatMan.print(); // 현재 좌석 상태 출력
							
							//System.out.println("현재 남은 좌석은 "+(10 - currentNo)+"입니다(V:빈좌석/C:찬좌석)");
							System.out.println("찬 좌석: "+currentNo+"\t"+"남은 좌석 : "+(10-currentNo));
							System.out.print("원하는 좌석을 고르세요 : ");
							int seatID = scanner.nextInt();
							
							if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // 입력 좌석이 false
								cst.add(new Customer(name)); // cst ArrayList<E>에 고객 이름 정보 추가
								cst.get(currentNo).seatID = seatID; // 현재 고객 정보를 저장한 Index(currentNo)에 좌석 번호 저장
								cst.get(currentNo).startTime = pay.setCheckIn(); // 현재 고객의 입장 시간 레퍼런스 및 출력
								System.out.println("선택되었습니다.");
								seatMan.setSeat(seatID/10-1, seatID%10-1);
								 // 고객이 선택한 자리 true로 변경
								
								currentNo++; // 고객 번호 변수 증가
							}
							else // 입력 좌석이 true 
								System.out.println ("사융 중인 좌석입니다.");
							System.out.println();
						}
	*/
	
	void setOut() { // setOut 메소드 - menu 2 선택 시 실행 
		try {
			if (cst.isEmpty()) { // 입장 손님이 없을 경우
				System.out.println("입장 손님이 없습니다.\n");
			}
			else { // 입장 손님이 있을 경우
				System.out.print("이름을 입력하세요 : ");
				String name2 = scanner.next();
				
				for(int i=0; i<cst.size();i++) {
					if (cst.get(i).name.equals(name2)) { // 입력한 이름이 cst 클래스 내에 저장되어 있는 이름일 때
						System.out.println("=======================");
						System.out.println(cst.get(i).name+"님의 좌석번호는 "+cst.get(i).seatID+"번 입니다.");
						
						seatMan.releaseSeat(cst.get(i).seatID/10-1, cst.get(i).seatID%10-1); // 고객 좌석 false
						total(cst.get(i).name); // total 메소드로 전체 정산
						System.out.println("해제되었습니다. 안녕히 가십시오.");
						cst.remove(i); // cst 클래스에서 퇴장한 고객의 정보 제거
						currentNo--; // 고객 번호 변수 감소
					}
					else if (!name2.equals(cst.get(i).name)) {
						System.out.println("찾는 이름이 없습니다.");
						break;
					}
				}
				System.out.println();
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] 숫자만 입력해 주세요.");
		}catch(Exception e) {
			System.out.println("[err] 잘못 입력하셨습니다.");
		}
	}
	
	void orderFood() { // orderFood 메소드 - menu 3 선택 시 실행
		try {
			int num =0; // 음식 번호 입력 변수
			int sum =0;
			boolean run = true;
			
			if (cst.isEmpty())
				System.out.println("음식 주문은 입장 후에만 가능합니다.");
			else {
				System.out.print("좌석 번호를 입력하세요: ");
				int seat = scanner.nextInt();
				
				for(int k=0;k<cst.size();k++) {
					if(cst.get(k).seatID == seat){
						// 메뉴판 출력
						System.out.println("===========메뉴판===========");
						for(int i =0; i<admin.foodList.length;i++) {
							System.out.print((i+1)+": ");
							for(int j=0;j<admin.foodList[i].length;j++) {
								System.out.print(admin.foodList[i][j]+"\t");
							}
							System.out.println();
						}
						System.out.println("=========================");
						
						while(run) { // 99 입력 시 메뉴 입력 종료
							System.out.print("원하는 메뉴의 번호를 한 번에 하나씩 입력하세요(그만 주문하시려면 99 입력):");
							num = scanner.nextInt();
						
							if (num >= 1 && num <= admin.foodList.length) { // 입력 숫자가 메뉴 번호 범위 내일 경우
								System.out.println(admin.foodList[num-1][0]+" 선택: "+admin.foodList[num-1][1]+"원");
								sum += Integer.parseInt(admin.foodList[num-1][1]); // 고객의 음식 요금에 음식 가격 합
							}
							else if (num == 99){ // 1~ 범위 내의 숫자가 아닐 경우
								run = false;
							}
							else {
								System.out.println("없는 메뉴입니다.");
	
							}
						}
						System.out.println(cst.get(k).name+"님의 음식 주문 금액은: "+sum+"원입니다.");
						cst.get(k).foodPay += sum;
						break;
					}
				}
			}
			
			System.out.println();
		}catch(InputMismatchException e) {
			System.out.println("[err] 숫자만 입력해 주세요.");
		}catch(Exception e) {
			System.out.println("[err] 잘못 입력하셨습니다.");
		}
	}

	
	void admin() { // admin 메소드 - menu 4 선택 시 실행 
		int num = 0;
		int err = 0;
		try {
			System.out.print("비밀번호를 입력해주세요:");
			String key = scanner.next();
			
			if(err==3) {
				System.out.println("비밀번호를 3회 잘못 입력하셨습니다.");
				System.out.println("보안 모드가 실행됩니다");
				while(true) {
					System.out.println("*************************");
				}
			}
			else if((err >=0) && (err < 2)) {
				if(!key.equals(Admin.adminKey)) {
					System.out.println("비밀번호가 아닙니다. 다시 입력해주세요.");
					err ++;
					System.out.println("비밀번호 " + err+"회 오류(3회 오류시 프로그램 보안 모드 활성화)");
					System.out.println();
				}
				
				else {
					while(num != 6) { // 5 입력 시 관리자 모드 종료			
						System.out.println(); // 2칸 \n
						System.out.println("[ 관리자 모드 ]");
						System.out.println();
						System.out.println("1. 현재 좌석 상태 보기");
						System.out.println("2. 전체 좌석 리셋하기");
						System.out.println("3. 손님 현황 보기");
						System.out.println("4. 총 수입 확인하기");
						System.out.println("5. 음식 수정하기");
						System.out.println("6. 관리자 모드 종료");
						System.out.print("-->");
						num = scanner.nextInt();
						
						switch (num) {
							case 1:
								seatMan.print();
								System.out.println("찬 좌석: "+currentNo+"\t"+"남은 좌석 : "+(10-currentNo));
								break;
							case 2:
								//이미 있는 손님 정산
								if(cst.isEmpty()) {
									System.out.println("초기화할 좌석이 없습니다.");
									break;
								}
								else {
									System.out.print("전체 좌석을 리셋하시겠습니까?[y,n] :"); // 좌석을 리셋할 것인지 확인
									String an = scanner.next();
									if(an.equals("y") || an.equals("Y")) { // y,Y 입력 시 좌석 리셋 *추가
										System.out.println("전체 좌석을 리셋합니다.");
										System.out.println("~아직 정산하지 않은 손님 안내~"); // 리셋 전 미퇴장 손님 정산
										for(int i = 0; i<cst.size();i++) {
											System.out.println("[ "+cst.get(i).name+"님 ] ("+cst.get(i).seatID+")");
											total(cst.get(i).name);
										}
										
										seatMan.clear(); // 좌석 테이블 초기화
										cst.clear(); // 고객 정보 초기화
										currentNo = 0; // 고객 번호 초기화
										
										System.out.println("\n모든 좌석이 해제되었습니다.\n");
									}
									else if (an.equals("n") || an.equals("N")) { // n,N 입력 시 뒤로 가기
										System.out.println("취소하였습니다.");
										break;
									}
									else {
										System.out.println("y(Y), n(N) 중에 하나만 입력해주세요.");
									}

									break;
									
								}
							case 3:
								if(cst.size()==0) { // 입장 고객이 없을 경우
									System.out.println("손님이 없습니다.");
								}else { 
									System.out.println("| 좌석번호 \t 이름 |");
									System.out.println("-----------------------");
									for(int i=0;i<cst.size();i++) {
										System.out.println((i+1)+": "+cst.get(i).seatID+"\t"+cst.get(i).name);
									}
								}
								System.out.println();
								break;
							case 4:
								System.out.println("시간 수익: "+Admin.timeMoney+"원"); // 총 시간 수익 *추가
								System.out.println("음식 수익: "+Admin.foodMoney+"원"); // 총 음식 수익
								System.out.println("-->총 수익: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"원"); // 총 수익
								System.out.println();
								break;
							case 5:
								admin.foodChange();
								break;
							case 6:
								System.out.println("관리자 모드를 종료합니다.");
								break;
							default : // 수정?
								System.out.println("잘못 입력하셨습니다.");
					}
				}
					System.out.println();
			}
			
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] 숫자만 입력해 주세요.");
		}catch(Exception e) {
			System.out.println("[err] 잘못 입력하셨습니다.");
		}
	}
	
	void adminEnd() {
		try {
			int err=0;
			while(true) {
				System.out.print("비밀번호를 입력해주세요:");
				String key = scanner.next();
				
				if(err==3) {
					System.out.println("비밀번호를 3회 잘못 입력하셨습니다.");
					System.out.println("보안 모드가 실행됩니다");
					while(true) {
						System.out.println("*************************");
					}
				}
				else if((err >=0) && (err < 2)) {
					if(!key.equals(Admin.adminKey)) {
						System.out.println("비밀번호가 아닙니다. 다시 입력해주세요.");
						err ++;
						System.out.println("비밀번호 " + err+"회 오류(3회 오류시 프로그램 보안 모드 활성화)");
						System.out.println();
					}
					else {
						if(cst.size()>0) { // y,Y 입력 시 좌석 리셋 *추가
							System.out.println("아직 퇴장하지 않은 손님이 있습니다.");
							System.out.print("종료하시겠습니까? (Y/N):");
							String an = scanner.next();
							if (an.equals("y") || an.equals("Y")) {
								System.out.println("입장 손님 정산 후 프로그램을 자동 종료합니다.");
								for(int i = 0; i<cst.size();i++) {
									System.out.println("[ "+cst.get(i).name+"님 ] ("+cst.get(i).seatID+")");
									total(cst.get(i).name);
								}
								
								seatMan.clear(); // 좌석 테이블 초기화
								cst.clear(); // 고객 정보 초기화
								currentNo = 0; // 고객 번호 초기화
								
								System.out.println();
								System.out.println("시간 수익: "+Admin.timeMoney+"원"); // 총 시간 수익 *추가
								System.out.println("음식 수익: "+Admin.foodMoney+"원"); // 총 음식 수익
								System.out.println("-->총 수익: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"원"); // 총 수익
								break;
							}
							else if(an.equals("n") || an.equals("N")) {
								System.out.println("프로그램 종료를 취소합니다");
								break;
							}
							else {
								System.out.println("y(Y), n(N) 중에 하나만 입력해주세요.");
							}
							
						}
						else if(cst.size()==0) {
							System.out.println();
							System.out.println("시간 수익: "+Admin.timeMoney+"원"); // 총 시간 수익 *추가
							System.out.println("음식 수익: "+Admin.foodMoney+"원"); // 총 음식 수익
							System.out.println("-->총 수익: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"원"); // 총 수익
							System.out.println("프로그램을 종료합니다.");
							break;
						}
					}
				}

			}
			
		}catch(InputMismatchException e) {
			System.out.println("[err] 숫자만 입력해 주세요.");
		}catch(Exception e) {
			System.out.println("[err] 잘못 입력하셨습니다.");
		}

	}

	
	
	void total(String guest) { // total 메소드 - 개인 시간 요금 및 개인 음식 요금 등 총 계산 *추가
		//파라미터 필요성? 수정 필요
		for(int i=0; i<cst.size();i++) {
			if(cst.get(i).name.equals(guest)) { // 고객 정보 탐색
				cst.get(i).endTime = pay.setCheckOut(); // 퇴장 시간 체크 및 출력
				pay.calculateFee(cst.get(i).startTime, cst.get(i).endTime); // 시간 계산
				cst.get(i).personalPay = Payment.total_Income; // 이게 최선인가?
				System.out.println("음식 요금: "+cst.get(i).foodPay+"원"); // 개인 음식 요금
				System.out.println("-->총 요금: "+(int)((int)cst.get(i).personalPay+(int)cst.get(i).foodPay)+"원");
				Admin.foodMoney += cst.get(i).foodPay; // 총 음식 요금 합
			}
		}
		
		Admin.timeMoney += Payment.total_Income; // 총 시간 요금
		Payment.total_Income =0; // total_Income 중복 방지를 위한 재초기화
		System.out.println();
	}
}