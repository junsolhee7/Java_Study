package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {

		//FPS
		//총알 : 
		//탄창 : 30, 3개
		
		//1. 단발 2. 점사
		//탄창쓸때마다 선택
		int option;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("1.단발 2.점사"+" 를 선택하세요"+ "(" + (3-i)+ ")"+"탄창 남았습니다.");
			option = sc.nextInt();
			
			int inc = 3;
			String sound = "타타탕";
			
			if(option ==1) {
				inc = 1;
				sound ="탕";
			}
			for(int b=0; b<30; b=b+inc) {
				System.out.println(sound);
			}
			
//===================================================================================
//			int count = 10;
//			String sound = "타타탕";
//			
//			if(option==1) {
//				count = 30;
//				sound = "탕";
//			}
//			for(int b=0;b<count;b++) {
//				System.out.println(sound);
//			}
//================================================================================			
//			if(option == 1) {
//				for(int j=0;j<30;j++) {
//					System.out.println("탕"+"("+(j+1)+")");
//				}
//			}else if(option == 2) {
//				for(int j=0;j<10;j++) {
//					System.out.println("타타탕"+"("+(j+1)+")");
//				}
//			}
		}
		System.out.println("탄창을 모두 소진하였습니다.");
	}
}
//ALT + 화살표위아래 = 복붙대신 이동
//깃허브 커밋 자주하기
//시작할때 pull하기