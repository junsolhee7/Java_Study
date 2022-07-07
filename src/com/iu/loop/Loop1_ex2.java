package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {

		//1. 1번 대문자, 2번 소문자
		// 1번이면 A - Z 출력 A:65, Z:90
		// 2번이면 a - z 출력 a:97, z:122
		
		//2. 1부터 10까지의 합을 구하기
		
		//3. ID,PW 입력해서 로그인 판단
		// 최대5번까지 시도 가능
		// 로그인이 성공하면 그즉시 종료
		
		int yID = 1234; //회원가입시 입력한 ID
		int iPw = 5678; //회원가입시 입력한 Pw
		int yID_;
		int iPw_;
		int ok = 1;
		
		
		int select;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번(대문자) 또는 2번(소문자)를 선택하세요");
		select = sc.nextInt();
		int i = 97;
		int j = 123;
		
		if(select==1) {
			i=65;
			j=91;
		}
		for(int c=i;c<j;c++) {
			System.out.println((char)c);
		}
		
//		if(select == 1) {
//			for(int i=65;i<91;i++)
//			System.out.println((char)i);
//		} else if(select == 2) {
//			for(int i=97;i<123;i++) {
//				System.out.println((char)i);
//			}
//		}//1번

		System.out.println(("------------------------"));
		int sum = 0;
		for(int start=1; start<=10; start++) {
			sum +=start;
		}
		System.out.println(sum); //2번
		
		
		System.out.println(("------------------------"));
		for(int f=0; f<5; f++) {
			switch(ok) {
			case 1:
				int g = 5-f;
				System.out.println("ID를 입력하세요\t"+"남은 기회: "+ g);
				yID_ = sc.nextInt();
				System.out.println("PW를 입력하세요");
				iPw_ = sc.nextInt();
				
				if(yID_== yID && iPw == iPw_) {
					ok = 2;
					System.out.println("로그인이 성공하였습니다.");
					
				}else {
					System.out.println("로그인에 실패하였습니다.");
				}
				break;
				
			case 2:
				f=5;
				break;
			}
		}
		
		
		

	}

}
