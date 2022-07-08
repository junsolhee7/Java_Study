package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 1234;
		int id;
		int pw;
		//ID입력, PW입력
		//로그인 판단, 로그인이 성공하면 종료
		//실패하면 다시입력
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("ID를 입력하세요");
				id = sc.nextInt();
				System.out.println("PW를 입력하세요");
				pw = sc.nextInt();
				if (id == yId && pw == yPw) {
					check = false;
					System.out.println("로그인에 성공하였습니다.");
				}else {
					System.out.println("로그인에 실패하였습니다.");;
				}
				break;
			default :
				check = !check;
				System.out.println("종료합니다.");
				
			}//switch의 끝
			
		}//while의 끝
		boolean hunt = true;
		if(check == false) {
			System.out.println("1.사냥");
			System.out.println("2.종료");
			int selectHunt = sc.nextInt();
			switch(selectHunt) {
			case 1:
				System.out.println("사냥을 시작합니다.");
	
				int level = 1;
				int reqExp = 30;
				int exp = 0;
				int kill = 0;
				int gold = 0;
				boolean levelUp = true;
				
				for(level = 1; level<16; level++) {
					reqExp = level * 30;
					while(levelUp) {
						kill++;
						exp += 10;
						System.out.println("현재 레벨:" + level + "  몬스터를 "+ kill +" 마리 사냥했습니다." + " 현재 경험치 : " + exp + 
								" 전체 경험치 : "+ reqExp + " 현재 gold : " + gold);
						if(reqExp <= exp) {
							System.out.println("레벨업 하였습니다! =============================================="
									+ "==========================");
							
							exp = 0;
							kill = 0;
							if(level == 4) {
								System.out.println("축하합니다! 5레벨 보상으로 1000gold가 지급되었습니다.");
								gold += 1000;
							} else if(level == 9) {
								System.out.println("축하합니다! 10레벨 보상으로 2000gold가 지급되었습니다.");
								gold += 2000;
							} else if(level == 14) {
								gold += 3000;
								System.out.println("축하합니다! 15레벨 보상으로 3000gold가 지급되었습니다.");
								System.out.println("현재 레벨:" + ++level +" 현재 gold : " + gold);
								levelUp = false;
							}
							break;
						}//if문의 끝
						
					}//while문의 끝
				}//for문의 끝
				
				break;
			default:
				System.out.println("종료합니다.");
			}
		}
		
		
		//=====================================================
		//로그인을 안했으면 프로그램이 종료
		//로그인을 성공했으면 게임 시작(사냥,종료 선택)
		//RPG
		//시작레벨은 1
		//만렙 15
		//gold : 1000
		//모든 몬스터의 경험치는 동일 10
		//1 -> 2 : 3마리
		//2 -> 3 : 6마리
		//3 -> 4 : 9마리
		//4 -> 5 : 12마리
		//...
		//14 -> 15 :
		//5렙달성시 축하금 1000gold 지급
		//10렙달성시 축하금 2000gold 지급
		//15렙달성시 축하금 3000gold 지급
		//종료
		
		

	}

}
//do while 잘 쓰이지 않음