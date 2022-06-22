
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Management {
	// field
	private int currentNo; // ÇöÀç ÀÔÀåÇÏ´Â ¼Õ´ÔÀÇ ¹øÈ£ ÀúÀå
	
	Scanner scanner = new Scanner(System.in); // ½ºÄ³³Ê °´Ã¼ »ı¼º
	
	ArrayList<Customer> cst = new ArrayList<Customer>(10); // »ç¿ëÀÚÀÇ Á¤º¸ ÀúÀå(10)ÇÏ´Â ArrayList<E> 
	//Customer cst[] = new Customer[10];
	SeatManage seatMan=new SeatManage(); // seatManage °´Ã¼ ·¹ÆÛ·±½º
	Payment pay = new Payment(); // Payment °´Ã¼ ·¹ÆÛ·±½º
	Admin admin = new Admin(); // Admin °´Ã¼ ·¹ÆÛ·±½º *Ãß°¡
	
	Management() { // Management ¸Ş¼Òµå - ÇÊµå°ª ÃÊ±âÈ­
		currentNo = 0;
	}
	
	void setIn() { // setIn ¸Ş¼Òµå - menu 1 ¼±ÅÃ ½Ã ½ÇÇà 
		try {
			if((10 - currentNo) == 0) // ³²Àº ÁÂ¼®ÀÌ ¾ø´Ù¸é ¼Õ´Ô X
				System.out.println("³²Àº ÁÂ¼®ÀÌ ¾ø½À´Ï´Ù. ´ÙÀ½¿¡ ÀÌ¿ëÈ÷ÁÖ½Ã±æ ¹Ù¶ø´Ï´Ù.");
			else { // ³²Àº ÁÂ¼®ÀÌ ÀÖ´Ù¸é ¼Õ´Ô O
				System.out.println();
				System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
				String name = scanner.next();
				
				if (name == null || name.length() == 0) { // nullÀÌ°Å³ª nameÀÇ ±æÀÌ°¡ 0ÀÏ ½Ã ´Ù½Ã ÀÔ·Â
					System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ°í, ¿£ÅÍ¸¦ ´­·¯ÁÖ¼¼¿ä.");
					System.out.println();
				}
				// nullÀÌ³ª °ø¹éÀÌ ¾Æ´Ò ½Ã
				else{
					if (name.matches("^[°¡-ÆRa-zA-Z]+$")) {
					// ÀÌ¸§¿¡ ÇÑ±ÛÀÌ³ª ¿µ¾î°¡ ÀÔ·ÂµÇ¾î ÀÖ´Ù¸é	
						seatMan.print();
						//System.out.println("ÇöÀç ³²Àº ÁÂ¼®Àº "+(10 - currentNo)+"ÀÔ´Ï´Ù(V:ºóÁÂ¼®/C:ÂùÁÂ¼®)");
						System.out.println("Âù ÁÂ¼®: "+currentNo+"\t"+"³²Àº ÁÂ¼® : "+(10-currentNo));
						System.out.print("¿øÇÏ´Â ÁÂ¼®À» °í¸£¼¼¿ä : ");
						int seatID = scanner.nextInt();
						
						if ((seatID/100 == 1) || (seatID/100 == 2 )) { // seatID°¡ 1, 2·Î ½ÃÀÛÇÏ´Â ¼¼ÀÚ¸® ¼öÀÏ °æ¿ì
							if (seatMan.setTable[seatID/100-1][(seatID%100)/10-1] == false) { // ÀÔ·Â ÁÂ¼®ÀÌ false
								cst.add(new Customer(name)); // cst ArrayList<E>¿¡ °í°´ ÀÌ¸§ Á¤º¸ Ãß°¡
								cst.get(currentNo).seatID = seatID; // ÇöÀç °í°´ Á¤º¸¸¦ ÀúÀåÇÑ Index(currentNo)¿¡ ÁÂ¼® ¹øÈ£ ÀúÀå
								cst.get(currentNo).startTime = pay.setCheckIn(); // ÇöÀç °í°´ÀÇ ÀÔÀå ½Ã°£ ·¹ÆÛ·±½º ¹× Ãâ·Â
								System.out.println("¼±ÅÃµÇ¾ú½À´Ï´Ù.");
								seatMan.setSeat(seatID/100-1, (seatID%100)/10-1);
								 // °í°´ÀÌ ¼±ÅÃÇÑ ÀÚ¸® true·Î º¯°æ
								
								currentNo++; // °í°´ ¹øÈ£ º¯¼ö Áõ°¡
								
							}
							else // ÀÔ·Â ÁÂ¼®ÀÌ true 
								System.out.println ("»çÀ¶ ÁßÀÎ ÁÂ¼®ÀÔ´Ï´Ù.");
						}
						else if (seatID/100 == 0) {
							if (seatID/10 == 0)
								System.out.println("ÁÂ¼®¹øÈ£¸¦ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
							else {
								if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // ÀÔ·Â ÁÂ¼®ÀÌ false
									cst.add(new Customer(name)); // cst ArrayList<E>¿¡ °í°´ ÀÌ¸§ Á¤º¸ Ãß°¡
									cst.get(currentNo).seatID = seatID; // ÇöÀç °í°´ Á¤º¸¸¦ ÀúÀåÇÑ Index(currentNo)¿¡ ÁÂ¼® ¹øÈ£ ÀúÀå
									cst.get(currentNo).startTime = pay.setCheckIn(); // ÇöÀç °í°´ÀÇ ÀÔÀå ½Ã°£ ·¹ÆÛ·±½º ¹× Ãâ·Â
									System.out.println("¼±ÅÃµÇ¾ú½À´Ï´Ù.");
									seatMan.setSeat(seatID/10-1, seatID%10-1);
									 // °í°´ÀÌ ¼±ÅÃÇÑ ÀÚ¸® true·Î º¯°æ
									
									currentNo++; // °í°´ ¹øÈ£ º¯¼ö Áõ°¡
								}
								else  // ÀÔ·Â ÁÂ¼®ÀÌ true 
									System.out.println ("»çÀ¶ ÁßÀÎ ÁÂ¼®ÀÔ´Ï´Ù.");
							}

						}
						System.out.println();
					}
					else {
						System.out.println("ÀÌ¸§Àº ÇÑ±Û°ú ¿µ¾î(´ë¼Ò¹®ÀÚ)¸¸ °¡´ÉÇÕ´Ï´Ù.");
						System.out.println();
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("¾ø´Â ÁÂ¼®ÀÔ´Ï´Ù.\n");
		}
	}
	
	/*
							else if(cst.size() == 0) { // °í°´ Á¤º¸°¡ ¾ø´Â °æ¿ì
							seatMan.print(); // ÇöÀç ÁÂ¼® »óÅÂ Ãâ·Â
							
							//System.out.println("ÇöÀç ³²Àº ÁÂ¼®Àº "+(10 - currentNo)+"ÀÔ´Ï´Ù(V:ºóÁÂ¼®/C:ÂùÁÂ¼®)");
							System.out.println("Âù ÁÂ¼®: "+currentNo+"\t"+"³²Àº ÁÂ¼® : "+(10-currentNo));
							System.out.print("¿øÇÏ´Â ÁÂ¼®À» °í¸£¼¼¿ä : ");
							int seatID = scanner.nextInt();
							
							if (seatMan.setTable[seatID/10-1][seatID%10-1] == false) { // ÀÔ·Â ÁÂ¼®ÀÌ false
								cst.add(new Customer(name)); // cst ArrayList<E>¿¡ °í°´ ÀÌ¸§ Á¤º¸ Ãß°¡
								cst.get(currentNo).seatID = seatID; // ÇöÀç °í°´ Á¤º¸¸¦ ÀúÀåÇÑ Index(currentNo)¿¡ ÁÂ¼® ¹øÈ£ ÀúÀå
								cst.get(currentNo).startTime = pay.setCheckIn(); // ÇöÀç °í°´ÀÇ ÀÔÀå ½Ã°£ ·¹ÆÛ·±½º ¹× Ãâ·Â
								System.out.println("¼±ÅÃµÇ¾ú½À´Ï´Ù.");
								seatMan.setSeat(seatID/10-1, seatID%10-1);
								 // °í°´ÀÌ ¼±ÅÃÇÑ ÀÚ¸® true·Î º¯°æ
								
								currentNo++; // °í°´ ¹øÈ£ º¯¼ö Áõ°¡
							}
							else // ÀÔ·Â ÁÂ¼®ÀÌ true 
								System.out.println ("»çÀ¶ ÁßÀÎ ÁÂ¼®ÀÔ´Ï´Ù.");
							System.out.println();
						}
	*/
	
	void setOut() { // setOut ¸Ş¼Òµå - menu 2 ¼±ÅÃ ½Ã ½ÇÇà 
		try {
			if (cst.isEmpty()) { // ÀÔÀå ¼Õ´ÔÀÌ ¾øÀ» °æ¿ì
				System.out.println("ÀÔÀå ¼Õ´ÔÀÌ ¾ø½À´Ï´Ù.\n");
			}
			else { // ÀÔÀå ¼Õ´ÔÀÌ ÀÖÀ» °æ¿ì
				System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
				String name2 = scanner.next();
				
				for(int i=0; i<cst.size();i++) {
					if (cst.get(i).name.equals(name2)) { // ÀÔ·ÂÇÑ ÀÌ¸§ÀÌ cst Å¬·¡½º ³»¿¡ ÀúÀåµÇ¾î ÀÖ´Â ÀÌ¸§ÀÏ ¶§
						System.out.println("=======================");
						System.out.println(cst.get(i).name+"´ÔÀÇ ÁÂ¼®¹øÈ£´Â "+cst.get(i).seatID+"¹ø ÀÔ´Ï´Ù.");
						
						seatMan.releaseSeat(cst.get(i).seatID/10-1, cst.get(i).seatID%10-1); // °í°´ ÁÂ¼® false
						total(cst.get(i).name); // total ¸Ş¼Òµå·Î ÀüÃ¼ Á¤»ê
						System.out.println("ÇØÁ¦µÇ¾ú½À´Ï´Ù. ¾È³çÈ÷ °¡½Ê½Ã¿À.");
						cst.remove(i); // cst Å¬·¡½º¿¡¼­ ÅğÀåÇÑ °í°´ÀÇ Á¤º¸ Á¦°Å
						currentNo--; // °í°´ ¹øÈ£ º¯¼ö °¨¼Ò
					}
					else if (!name2.equals(cst.get(i).name)) {
						System.out.println("Ã£´Â ÀÌ¸§ÀÌ ¾ø½À´Ï´Ù.");
						break;
					}
				}
				System.out.println();
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] ¼ıÀÚ¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		}catch(Exception e) {
			System.out.println("[err] Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
	}
	
	void orderFood() { // orderFood ¸Ş¼Òµå - menu 3 ¼±ÅÃ ½Ã ½ÇÇà
		try {
			int num =0; // À½½Ä ¹øÈ£ ÀÔ·Â º¯¼ö
			int sum =0;
			boolean run = true;
			
			if (cst.isEmpty())
				System.out.println("À½½Ä ÁÖ¹®Àº ÀÔÀå ÈÄ¿¡¸¸ °¡´ÉÇÕ´Ï´Ù.");
			else {
				System.out.print("ÁÂ¼® ¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä: ");
				int seat = scanner.nextInt();
				
				for(int k=0;k<cst.size();k++) {
					if(cst.get(k).seatID == seat){
						// ¸Ş´ºÆÇ Ãâ·Â
						System.out.println("===========¸Ş´ºÆÇ===========");
						for(int i =0; i<admin.foodList.length;i++) {
							System.out.print((i+1)+": ");
							for(int j=0;j<admin.foodList[i].length;j++) {
								System.out.print(admin.foodList[i][j]+"\t");
							}
							System.out.println();
						}
						System.out.println("=========================");
						
						while(run) { // 99 ÀÔ·Â ½Ã ¸Ş´º ÀÔ·Â Á¾·á
							System.out.print("¿øÇÏ´Â ¸Ş´ºÀÇ ¹øÈ£¸¦ ÇÑ ¹ø¿¡ ÇÏ³ª¾¿ ÀÔ·ÂÇÏ¼¼¿ä(±×¸¸ ÁÖ¹®ÇÏ½Ã·Á¸é 99 ÀÔ·Â):");
							num = scanner.nextInt();
						
							if (num >= 1 && num <= admin.foodList.length) { // ÀÔ·Â ¼ıÀÚ°¡ ¸Ş´º ¹øÈ£ ¹üÀ§ ³»ÀÏ °æ¿ì
								System.out.println(admin.foodList[num-1][0]+" ¼±ÅÃ: "+admin.foodList[num-1][1]+"¿ø");
								sum += Integer.parseInt(admin.foodList[num-1][1]); // °í°´ÀÇ À½½Ä ¿ä±İ¿¡ À½½Ä °¡°İ ÇÕ
							}
							else if (num == 99){ // 1~ ¹üÀ§ ³»ÀÇ ¼ıÀÚ°¡ ¾Æ´Ò °æ¿ì
								run = false;
							}
							else {
								System.out.println("¾ø´Â ¸Ş´ºÀÔ´Ï´Ù.");
	
							}
						}
						System.out.println(cst.get(k).name+"´ÔÀÇ À½½Ä ÁÖ¹® ±İ¾×Àº: "+sum+"¿øÀÔ´Ï´Ù.");
						cst.get(k).foodPay += sum;
						break;
					}
				}
			}
			
			System.out.println();
		}catch(InputMismatchException e) {
			System.out.println("[err] ¼ıÀÚ¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		}catch(Exception e) {
			System.out.println("[err] Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
	}

	
	void admin() { // admin ¸Ş¼Òµå - menu 4 ¼±ÅÃ ½Ã ½ÇÇà 
		int num = 0;
		int err = 0;
		try {
			System.out.print("ºñ¹Ğ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä:");
			String key = scanner.next();
			
			if(err==3) {
				System.out.println("ºñ¹Ğ¹øÈ£¸¦ 3È¸ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
				System.out.println("º¸¾È ¸ğµå°¡ ½ÇÇàµË´Ï´Ù");
				while(true) {
					System.out.println("*************************");
				}
			}
			else if((err >=0) && (err < 2)) {
				if(!key.equals(Admin.adminKey)) {
					System.out.println("ºñ¹Ğ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
					err ++;
					System.out.println("ºñ¹Ğ¹øÈ£ " + err+"È¸ ¿À·ù(3È¸ ¿À·ù½Ã ÇÁ·Î±×·¥ º¸¾È ¸ğµå È°¼ºÈ­)");
					System.out.println();
				}
				
				else {
					while(num != 6) { // 5 ÀÔ·Â ½Ã °ü¸®ÀÚ ¸ğµå Á¾·á			
						System.out.println(); // 2Ä­ \n
						System.out.println("[ °ü¸®ÀÚ ¸ğµå ]");
						System.out.println();
						System.out.println("1. ÇöÀç ÁÂ¼® »óÅÂ º¸±â");
						System.out.println("2. ÀüÃ¼ ÁÂ¼® ¸®¼ÂÇÏ±â");
						System.out.println("3. ¼Õ´Ô ÇöÈ² º¸±â");
						System.out.println("4. ÃÑ ¼öÀÔ È®ÀÎÇÏ±â");
						System.out.println("5. À½½Ä ¼öÁ¤ÇÏ±â");
						System.out.println("6. °ü¸®ÀÚ ¸ğµå Á¾·á");
						System.out.print("-->");
						num = scanner.nextInt();
						
						switch (num) {
							case 1:
								seatMan.print();
								System.out.println("Âù ÁÂ¼®: "+currentNo+"\t"+"³²Àº ÁÂ¼® : "+(10-currentNo));
								break;
							case 2:
								//ÀÌ¹Ì ÀÖ´Â ¼Õ´Ô Á¤»ê
								if(cst.isEmpty()) {
									System.out.println("ÃÊ±âÈ­ÇÒ ÁÂ¼®ÀÌ ¾ø½À´Ï´Ù.");
									break;
								}
								else {
									System.out.print("ÀüÃ¼ ÁÂ¼®À» ¸®¼ÂÇÏ½Ã°Ú½À´Ï±î?[y,n] :"); // ÁÂ¼®À» ¸®¼ÂÇÒ °ÍÀÎÁö È®ÀÎ
									String an = scanner.next();
									if(an.equals("y") || an.equals("Y")) { // y,Y ÀÔ·Â ½Ã ÁÂ¼® ¸®¼Â *Ãß°¡
										System.out.println("ÀüÃ¼ ÁÂ¼®À» ¸®¼ÂÇÕ´Ï´Ù.");
										System.out.println("~¾ÆÁ÷ Á¤»êÇÏÁö ¾ÊÀº ¼Õ´Ô ¾È³»~"); // ¸®¼Â Àü ¹ÌÅğÀå ¼Õ´Ô Á¤»ê
										for(int i = 0; i<cst.size();i++) {
											System.out.println("[ "+cst.get(i).name+"´Ô ] ("+cst.get(i).seatID+")");
											total(cst.get(i).name);
										}
										
										seatMan.clear(); // ÁÂ¼® Å×ÀÌºí ÃÊ±âÈ­
										cst.clear(); // °í°´ Á¤º¸ ÃÊ±âÈ­
										currentNo = 0; // °í°´ ¹øÈ£ ÃÊ±âÈ­
										
										System.out.println("\n¸ğµç ÁÂ¼®ÀÌ ÇØÁ¦µÇ¾ú½À´Ï´Ù.\n");
									}
									else if (an.equals("n") || an.equals("N")) { // n,N ÀÔ·Â ½Ã µÚ·Î °¡±â
										System.out.println("Ãë¼ÒÇÏ¿´½À´Ï´Ù.");
										break;
									}
									else {
										System.out.println("y(Y), n(N) Áß¿¡ ÇÏ³ª¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
									}

									break;
									
								}
							case 3:
								if(cst.size()==0) { // ÀÔÀå °í°´ÀÌ ¾øÀ» °æ¿ì
									System.out.println("¼Õ´ÔÀÌ ¾ø½À´Ï´Ù.");
								}else { 
									System.out.println("| ÁÂ¼®¹øÈ£ \t ÀÌ¸§ |");
									System.out.println("-----------------------");
									for(int i=0;i<cst.size();i++) {
										System.out.println((i+1)+": "+cst.get(i).seatID+"\t"+cst.get(i).name);
									}
								}
								System.out.println();
								break;
							case 4:
								System.out.println("½Ã°£ ¼öÀÍ: "+Admin.timeMoney+"¿ø"); // ÃÑ ½Ã°£ ¼öÀÍ *Ãß°¡
								System.out.println("À½½Ä ¼öÀÍ: "+Admin.foodMoney+"¿ø"); // ÃÑ À½½Ä ¼öÀÍ
								System.out.println("-->ÃÑ ¼öÀÍ: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"¿ø"); // ÃÑ ¼öÀÍ
								System.out.println();
								break;
							case 5:
								admin.foodChange();
								break;
							case 6:
								System.out.println("°ü¸®ÀÚ ¸ğµå¸¦ Á¾·áÇÕ´Ï´Ù.");
								break;
							default : // ¼öÁ¤?
								System.out.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
					}
				}
					System.out.println();
			}
			
			}
		}catch(InputMismatchException e) {
			System.out.println("[err] ¼ıÀÚ¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		}catch(Exception e) {
			System.out.println("[err] Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
	}
	
	void adminEnd() {
		try {
			int err=0;
			while(true) {
				System.out.print("ºñ¹Ğ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä:");
				String key = scanner.next();
				
				if(err==3) {
					System.out.println("ºñ¹Ğ¹øÈ£¸¦ 3È¸ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
					System.out.println("º¸¾È ¸ğµå°¡ ½ÇÇàµË´Ï´Ù");
					while(true) {
						System.out.println("*************************");
					}
				}
				else if((err >=0) && (err < 2)) {
					if(!key.equals(Admin.adminKey)) {
						System.out.println("ºñ¹Ğ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇØÁÖ¼¼¿ä.");
						err ++;
						System.out.println("ºñ¹Ğ¹øÈ£ " + err+"È¸ ¿À·ù(3È¸ ¿À·ù½Ã ÇÁ·Î±×·¥ º¸¾È ¸ğµå È°¼ºÈ­)");
						System.out.println();
					}
					else {
						if(cst.size()>0) { // y,Y ÀÔ·Â ½Ã ÁÂ¼® ¸®¼Â *Ãß°¡
							System.out.println("¾ÆÁ÷ ÅğÀåÇÏÁö ¾ÊÀº ¼Õ´ÔÀÌ ÀÖ½À´Ï´Ù.");
							System.out.print("Á¾·áÇÏ½Ã°Ú½À´Ï±î? (Y/N):");
							String an = scanner.next();
							if (an.equals("y") || an.equals("Y")) {
								System.out.println("ÀÔÀå ¼Õ´Ô Á¤»ê ÈÄ ÇÁ·Î±×·¥À» ÀÚµ¿ Á¾·áÇÕ´Ï´Ù.");
								for(int i = 0; i<cst.size();i++) {
									System.out.println("[ "+cst.get(i).name+"´Ô ] ("+cst.get(i).seatID+")");
									total(cst.get(i).name);
								}
								
								seatMan.clear(); // ÁÂ¼® Å×ÀÌºí ÃÊ±âÈ­
								cst.clear(); // °í°´ Á¤º¸ ÃÊ±âÈ­
								currentNo = 0; // °í°´ ¹øÈ£ ÃÊ±âÈ­
								
								System.out.println();
								System.out.println("½Ã°£ ¼öÀÍ: "+Admin.timeMoney+"¿ø"); // ÃÑ ½Ã°£ ¼öÀÍ *Ãß°¡
								System.out.println("À½½Ä ¼öÀÍ: "+Admin.foodMoney+"¿ø"); // ÃÑ À½½Ä ¼öÀÍ
								System.out.println("-->ÃÑ ¼öÀÍ: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"¿ø"); // ÃÑ ¼öÀÍ
								break;
							}
							else if(an.equals("n") || an.equals("N")) {
								System.out.println("ÇÁ·Î±×·¥ Á¾·á¸¦ Ãë¼ÒÇÕ´Ï´Ù");
								break;
							}
							else {
								System.out.println("y(Y), n(N) Áß¿¡ ÇÏ³ª¸¸ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
							}
							
						}
						else if(cst.size()==0) {
							System.out.println();
							System.out.println("½Ã°£ ¼öÀÍ: "+Admin.timeMoney+"¿ø"); // ÃÑ ½Ã°£ ¼öÀÍ *Ãß°¡
							System.out.println("À½½Ä ¼öÀÍ: "+Admin.foodMoney+"¿ø"); // ÃÑ À½½Ä ¼öÀÍ
							System.out.println("-->ÃÑ ¼öÀÍ: "+((int)Admin.timeMoney+(int)Admin.foodMoney)+"¿ø"); // ÃÑ ¼öÀÍ
							System.out.println("ÇÁ·Î±×·¥À» Á¾·áÇÕ´Ï´Ù.");
							break;
						}
					}
				}

			}
			
		}catch(InputMismatchException e) {
			System.out.println("[err] ¼ıÀÚ¸¸ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
		}catch(Exception e) {
			System.out.println("[err] Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}

	}

	
	
	void total(String guest) { // total ¸Ş¼Òµå - °³ÀÎ ½Ã°£ ¿ä±İ ¹× °³ÀÎ À½½Ä ¿ä±İ µî ÃÑ °è»ê *Ãß°¡
		//ÆÄ¶ó¹ÌÅÍ ÇÊ¿ä¼º? ¼öÁ¤ ÇÊ¿ä
		for(int i=0; i<cst.size();i++) {
			if(cst.get(i).name.equals(guest)) { // °í°´ Á¤º¸ Å½»ö
				cst.get(i).endTime = pay.setCheckOut(); // ÅğÀå ½Ã°£ Ã¼Å© ¹× Ãâ·Â
				pay.calculateFee(cst.get(i).startTime, cst.get(i).endTime); // ½Ã°£ °è»ê
				cst.get(i).personalPay = Payment.total_Income; // ÀÌ°Ô ÃÖ¼±ÀÎ°¡?
				System.out.println("À½½Ä ¿ä±İ: "+cst.get(i).foodPay+"¿ø"); // °³ÀÎ À½½Ä ¿ä±İ
				System.out.println("-->ÃÑ ¿ä±İ: "+(int)((int)cst.get(i).personalPay+(int)cst.get(i).foodPay)+"¿ø");
				Admin.foodMoney += cst.get(i).foodPay; // ÃÑ À½½Ä ¿ä±İ ÇÕ
			}
		}
		
		Admin.timeMoney += Payment.total_Income; // ÃÑ ½Ã°£ ¿ä±İ
		Payment.total_Income =0; // total_Income Áßº¹ ¹æÁö¸¦ À§ÇÑ ÀçÃÊ±âÈ­
		System.out.println();
	}
}