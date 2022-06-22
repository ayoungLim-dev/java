
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Management {
	// field
	private int currentNo; // ���� �����ϴ� �մ��� ��ȣ ����
	
	Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ����
	
	ArrayList<Customer> cst = new ArrayList<Customer>(10); // ������� ���� ����(10)�ϴ� ArrayList<E> 
	//Customer cst[] = new Customer[10];
	SeatManage seatMan=new SeatManage(); // seatManage ��ü ���۷���
	Payment pay = new Payment(); // Payment ��ü ���۷���
	Admin admin = new Admin(); // Admin ��ü ���۷��� *�߰�
	
	Management() { // Management �޼ҵ� - �ʵ尪 �ʱ�ȭ
		currentNo = 0;
	}
	
	void setIn() { // setIn �޼ҵ� - menu 1 ���� �� ���� 
		try {
			if((10 - currentNo) == 0) // ���� �¼��� ���ٸ� �մ� X
				System.out.println("���� �¼��� �����ϴ�. ������ �̿����ֽñ� �ٶ��ϴ�.");
			else { // ���� �¼��� �ִٸ� �մ� O
				System.out.println();
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = scanner.next();
				
				if (name == null || name.length() == 0) { // null�̰ų� name�� ���̰� 0�� �� �ٽ� �Է�
					System.out.println("�̸��� �Է��ϰ�, ���͸� �����ּ���.");
					System.out.println();
				}
				// null�̳� ������ �ƴ� ��
				else{
					if (name.matches("^[��-�Ra-zA-Z]+$")) {
					// �̸��� �ѱ��̳� ��� �ԷµǾ� �ִٸ�	
						seatMan.print();
						//System.out.println("���� ���� �¼��� "+(10 - currentNo)+"�Դϴ�(V:���¼�/C:���¼�)");
						System.out.println("�� �¼�: "+currentNo+"\t"+"���� �¼� : "+(10-currentNo));
						System.out.print("���ϴ� �¼��� ������ : ");
						int seatID = scanner.nextInt();
						
						if ((seatID/100 == 1) || (seatID/100 == 2 )) { // seatID�� 1, 2�� �����ϴ� ���ڸ� ���� ���
							if (seatMan.setTable[seatID/100-1][(seatID%100)/10-1] == false) { // �Է� �¼��� false
								cst.add(new Customer(name)); // cst ArrayList<E>�� �� �̸� ���� �߰�
								cst.get(currentNo).seatID = seatID; // ���� �� ������ ������ Index(currentNo)�� �¼� ��ȣ ����
								cst.get(currentNo).startTime = pay.setCheckIn(); // ���� ���� ���� �ð� ���۷��� �� ���
								System.out.println("���õǾ����ϴ�.");
								seatMan.setSeat(seatID/100-1, (seatID%100)/10-1);
								 // ���� ������ �ڸ� true�� ����
								
								currentNo++; // �� ��ȣ ���� ����
								
							}
							else // �Է� �¼��� true 
								System.out.println ("���� ���� �¼��Դϴ�.");
						}
						else if (seatID/100 == 0) {
							if (seatID/10 == 0)
								System.out.println("�¼���ȣ�� �߸� �Է��ϼ̽��ϴ�.");
							else {
								if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // �Է� �¼��� false
									cst.add(new Customer(name)); // cst ArrayList<E>�� �� �̸� ���� �߰�
									cst.get(currentNo).seatID = seatID; // ���� �� ������ ������ Index(currentNo)�� �¼� ��ȣ ����
									cst.get(currentNo).startTime = pay.setCheckIn(); // ���� ���� ���� �ð� ���۷��� �� ���
									System.out.println("���õǾ����ϴ�.");
									seatMan.setSeat(seatID/10-1, seatID%10-1);
									 // ���� ������ �ڸ� true�� ����
									
									currentNo++; // �� ��ȣ ���� ����
								}
								else  // �Է� �¼��� true 
									System.out.println ("���� ���� �¼��Դϴ�.");
							}

						}
						System.out.println();
					}
					else {
						System.out.println("�̸��� �ѱ۰� ����(��ҹ���)�� �����մϴ�.");
						System.out.println();
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("���� �¼��Դϴ�.\n");
		}
	}
	
	/*
							else if(cst.size() == 0) { // �� ������ ���� ���
							seatMan.print(); // ���� �¼� ���� ���
							
							//System.out.println("���� ���� �¼��� "+(10 - currentNo)+"�Դϴ�(V:���¼�/C:���¼�)");
							System.out.println("�� �¼�: "+currentNo+"\t"+"���� �¼� : "+(10-currentNo));
							System.out.print("���ϴ� �¼��� ������ : ");
							int seatID = scanner.nextInt();
							
							if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // �Է� �¼��� false
								cst.add(new Customer(name)); // cst ArrayList<E>�� �� �̸� ���� �߰�
								cst.get(currentNo).seatID = seatID; // ���� �� ������ ������ Index(currentNo)�� �¼� ��ȣ ����
								cst.get(currentNo).startTime = pay.setCheckIn(); // ���� ���� ���� �ð� ���۷��� �� ���
								System.out.println("���õǾ����ϴ�.");
								seatMan.setSeat(seatID/10-1, seatID%10-1);
								 // ���� ������ �ڸ� true�� ����
								
								currentNo++; // �� ��ȣ ���� ����
							}
							else // �Է� �¼��� true 
								System.out.println ("���� ���� �¼��Դϴ�.");
							System.out.println();
						}
	*/
	
	void setOut() { // setOut �޼ҵ� - menu 2 ���� �� ���� 
		try {
			if (cst.isEmpty()) { // ���� �մ��� ���� ���
				System.out.println("���� �մ��� �����ϴ�.\n");
			}
			else { // ���� �մ��� ���� ���
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name2 = scanner.next();
				
				for(int i=0; i<cst.size();i++) {
					if (cst.get(i).name.equals(name2)) { // �Է��� �̸��� cst Ŭ���� ���� ����Ǿ� �ִ� �̸��� ��
						System.out.println("=======================");
						System.out.println(cst.get(i).name+"���� �¼���ȣ�� "+cst.get(i).seatID+"�� �Դϴ�.");
						
						seatMan.releaseSeat(cst.get(i).seatID/10-1, cst.get(i).seatID%10-1); // �� �¼� false
						total(cst.get(i).name); // total �޼ҵ�� ��ü ����
						System.out.println("�����Ǿ����ϴ�. �ȳ��� ���ʽÿ�.");
						cst.remove(i); // cst Ŭ�������� ������ ���� ���� ����
						currentNo--; // �� ��ȣ ���� ����
					}
					else if (!name2.equals(cst.get(i).name)) {
						System.out.println("ã�� �̸��� �����ϴ�.");
						break;
					}
				}
				System.out.println();
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] ���ڸ� �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("[err] �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	void orderFood() { // orderFood �޼ҵ� - menu 3 ���� �� ����
		try {
			int num =0; // ���� ��ȣ �Է� ����
			int sum =0;
			boolean run = true;
			
			if (cst.isEmpty())
				System.out.println("���� �ֹ��� ���� �Ŀ��� �����մϴ�.");
			else {
				System.out.print("�¼� ��ȣ�� �Է��ϼ���: ");
				int seat = scanner.nextInt();
				
				for(int k=0;k<cst.size();k++) {
					if(cst.get(k).seatID == seat){
						// �޴��� ���
						System.out.println("===========�޴���===========");
						for(int i =0; i<admin.foodList.length;i++) {
							System.out.print((i+1)+": ");
							for(int j=0;j<admin.foodList[i].length;j++) {
								System.out.print(admin.foodList[i][j]+"\t");
							}
							System.out.println();
						}
						System.out.println("=========================");
						
						while(run) { // 99 �Է� �� �޴� �Է� ����
							System.out.print("���ϴ� �޴��� ��ȣ�� �� ���� �ϳ��� �Է��ϼ���(�׸� �ֹ��Ͻ÷��� 99 �Է�):");
							num = scanner.nextInt();
						
							if (num >= 1 && num <= admin.foodList.length) { // �Է� ���ڰ� �޴� ��ȣ ���� ���� ���
								System.out.println(admin.foodList[num-1][0]+" ����: "+admin.foodList[num-1][1]+"��");
								sum += Integer.parseInt(admin.foodList[num-1][1]); // ���� ���� ��ݿ� ���� ���� ��
							}
							else if (num == 99){ // 1~ ���� ���� ���ڰ� �ƴ� ���
								run = false;
							}
							else {
								System.out.println("���� �޴��Դϴ�.");
	
							}
						}
						System.out.println(cst.get(k).name+"���� ���� �ֹ� �ݾ���: "+sum+"���Դϴ�.");
						cst.get(k).foodPay += sum;
						break;
					}
				}
			}
			
			System.out.println();
		}catch(InputMismatchException e) {
			System.out.println("[err] ���ڸ� �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("[err] �߸� �Է��ϼ̽��ϴ�.");
		}
	}

	
	void admin() { // admin �޼ҵ� - menu 4 ���� �� ���� 
		int num = 0;
		int err = 0;
		try {
			System.out.print("��й�ȣ�� �Է����ּ���:");
			String key = scanner.next();
			
			if(err==3) {
				System.out.println("��й�ȣ�� 3ȸ �߸� �Է��ϼ̽��ϴ�.");
				System.out.println("���� ��尡 ����˴ϴ�");
				while(true) {
					System.out.println("*************************");
				}
			}
			else if((err >=0) && (err < 2)) {
				if(!key.equals(Admin.adminKey)) {
					System.out.println("��й�ȣ�� �ƴմϴ�. �ٽ� �Է����ּ���.");
					err ++;
					System.out.println("��й�ȣ " + err+"ȸ ����(3ȸ ������ ���α׷� ���� ��� Ȱ��ȭ)");
					System.out.println();
				}
				
				else {
					while(num != 6) { // 5 �Է� �� ������ ��� ����			
						System.out.println(); // 2ĭ \n
						System.out.println("[ ������ ��� ]");
						System.out.println();
						System.out.println("1. ���� �¼� ���� ����");
						System.out.println("2. ��ü �¼� �����ϱ�");
						System.out.println("3. �մ� ��Ȳ ����");
						System.out.println("4. �� ���� Ȯ���ϱ�");
						System.out.println("5. ���� �����ϱ�");
						System.out.println("6. ������ ��� ����");
						System.out.print("-->");
						num = scanner.nextInt();
						
						switch (num) {
							case 1:
								seatMan.print();
								System.out.println("�� �¼�: "+currentNo+"\t"+"���� �¼� : "+(10-currentNo));
								break;
							case 2:
								//�̹� �ִ� �մ� ����
								if(cst.isEmpty()) {
									System.out.println("�ʱ�ȭ�� �¼��� �����ϴ�.");
									break;
								}
								else {
									System.out.print("��ü �¼��� �����Ͻðڽ��ϱ�?[y,n] :"); // �¼��� ������ ������ Ȯ��
									String an = scanner.next();
									if(an.equals("y") || an.equals("Y")) { // y,Y �Է� �� �¼� ���� *�߰�
										System.out.println("��ü �¼��� �����մϴ�.");
										System.out.println("~���� �������� ���� �մ� �ȳ�~"); // ���� �� ������ �մ� ����
										for(int i = 0; i<cst.size();i++) {
											System.out.println("[ "+cst.get(i).name+"�� ] ("+cst.get(i).seatID+")");
											total(cst.get(i).name);
										}
										
										seatMan.clear(); // �¼� ���̺� �ʱ�ȭ
										cst.clear(); // �� ���� �ʱ�ȭ
										currentNo = 0; // �� ��ȣ �ʱ�ȭ
										
										System.out.println("\n��� �¼��� �����Ǿ����ϴ�.\n");
									}
									else if (an.equals("n") || an.equals("N")) { // n,N �Է� �� �ڷ� ����
										System.out.println("����Ͽ����ϴ�.");
										break;
									}
									else {
										System.out.println("y(Y), n(N) �߿� �ϳ��� �Է����ּ���.");
									}

									break;
									
								}
							case 3:
								if(cst.size()==0) { // ���� ���� ���� ���
									System.out.println("�մ��� �����ϴ�.");
								}else { 
									System.out.println("| �¼���ȣ \t �̸� |");
									System.out.println("-----------------------");
									for(int i=0;i<cst.size();i++) {
										System.out.println((i+1)+": "+cst.get(i).seatID+"\t"+cst.get(i).name);
									}
								}
								System.out.println();
								break;
							case 4:
								System.out.println("�ð� ����: "+Admin.timeMoney+"��"); // �� �ð� ���� *�߰�
								System.out.println("���� ����: "+Admin.foodMoney+"��"); // �� ���� ����
								System.out.println("-->�� ����: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"��"); // �� ����
								System.out.println();
								break;
							case 5:
								admin.foodChange();
								break;
							case 6:
								System.out.println("������ ��带 �����մϴ�.");
								break;
							default : // ����?
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
				}
					System.out.println();
			}
			
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] ���ڸ� �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("[err] �߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	void adminEnd() {
		try {
			int err=0;
			while(true) {
				System.out.print("��й�ȣ�� �Է����ּ���:");
				String key = scanner.next();
				
				if(err==3) {
					System.out.println("��й�ȣ�� 3ȸ �߸� �Է��ϼ̽��ϴ�.");
					System.out.println("���� ��尡 ����˴ϴ�");
					while(true) {
						System.out.println("*************************");
					}
				}
				else if((err >=0) && (err < 2)) {
					if(!key.equals(Admin.adminKey)) {
						System.out.println("��й�ȣ�� �ƴմϴ�. �ٽ� �Է����ּ���.");
						err ++;
						System.out.println("��й�ȣ " + err+"ȸ ����(3ȸ ������ ���α׷� ���� ��� Ȱ��ȭ)");
						System.out.println();
					}
					else {
						if(cst.size()>0) { // y,Y �Է� �� �¼� ���� *�߰�
							System.out.println("���� �������� ���� �մ��� �ֽ��ϴ�.");
							System.out.print("�����Ͻðڽ��ϱ�? (Y/N):");
							String an = scanner.next();
							if (an.equals("y") || an.equals("Y")) {
								System.out.println("���� �մ� ���� �� ���α׷��� �ڵ� �����մϴ�.");
								for(int i = 0; i<cst.size();i++) {
									System.out.println("[ "+cst.get(i).name+"�� ] ("+cst.get(i).seatID+")");
									total(cst.get(i).name);
								}
								
								seatMan.clear(); // �¼� ���̺� �ʱ�ȭ
								cst.clear(); // �� ���� �ʱ�ȭ
								currentNo = 0; // �� ��ȣ �ʱ�ȭ
								
								System.out.println();
								System.out.println("�ð� ����: "+Admin.timeMoney+"��"); // �� �ð� ���� *�߰�
								System.out.println("���� ����: "+Admin.foodMoney+"��"); // �� ���� ����
								System.out.println("-->�� ����: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"��"); // �� ����
								break;
							}
							else if(an.equals("n") || an.equals("N")) {
								System.out.println("���α׷� ���Ḧ ����մϴ�");
								break;
							}
							else {
								System.out.println("y(Y), n(N) �߿� �ϳ��� �Է����ּ���.");
							}
							
						}
						else if(cst.size()==0) {
							System.out.println();
							System.out.println("�ð� ����: "+Admin.timeMoney+"��"); // �� �ð� ���� *�߰�
							System.out.println("���� ����: "+Admin.foodMoney+"��"); // �� ���� ����
							System.out.println("-->�� ����: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"��"); // �� ����
							System.out.println("���α׷��� �����մϴ�.");
							break;
						}
					}
				}

			}
			
		}catch(InputMismatchException e) {
			System.out.println("[err] ���ڸ� �Է��� �ּ���.");
		}catch(Exception e) {
			System.out.println("[err] �߸� �Է��ϼ̽��ϴ�.");
		}

	}

	
	
	void total(String guest) { // total �޼ҵ� - ���� �ð� ��� �� ���� ���� ��� �� �� ��� *�߰�
		//�Ķ���� �ʿ伺? ���� �ʿ�
		for(int i=0; i<cst.size();i++) {
			if(cst.get(i).name.equals(guest)) { // �� ���� Ž��
				cst.get(i).endTime = pay.setCheckOut(); // ���� �ð� üũ �� ���
				pay.calculateFee(cst.get(i).startTime, cst.get(i).endTime); // �ð� ���
				cst.get(i).personalPay = Payment.total_Income; // �̰� �ּ��ΰ�?
				System.out.println("���� ���: "+cst.get(i).foodPay+"��"); // ���� ���� ���
				System.out.println("-->�� ���: "+(int)((int)cst.get(i).personalPay+(int)cst.get(i).foodPay)+"��");
				Admin.foodMoney += cst.get(i).foodPay; // �� ���� ��� ��
			}
		}
		
		Admin.timeMoney += Payment.total_Income; // �� �ð� ���
		Payment.total_Income =0; // total_Income �ߺ� ������ ���� ���ʱ�ȭ
		System.out.println();
	}
}