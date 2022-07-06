package com.iu.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		//제어문
		//1.단일 if문
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수 입니다."); //중괄호없을시 한줄만 실행
		}
		if(num < 10) {
			System.out.println(num + "은(는) 10 미만 입니다.");
		}
		
		System.out.println("Finish");

	}

}
