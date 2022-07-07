package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		//main + ctrl + space = 메인메소드 자동생성
		int num = 10;//지역변수 (메서드안에 변수) 생명주기 = {에서 시작, }에서 종료, 메모리에서 삭제
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-3 숫자 입력");
		int select = sc.nextInt();
		
		if (select == 1) {
			int count = 1;//지역변수 (중괄호안에 변수) = 스택 영역에 생성, 힙 영역 = 인스턴스 변수
			System.out.println(num);
			System.out.println("1 선택");
		}else if (select ==2) {
			int count = 1; //중복아님
			System.out.println("2 선택");
		}else {
			int count = 1; 
			System.out.println("3 선택");
		}
		System.out.println(num);
		//System.out.println(count);
		//else if 로 끝내는방법은 위험하다
		//용어정리필요 이거저거 x 지역변수 num, 전역변수 num o
		
		
	}

}
