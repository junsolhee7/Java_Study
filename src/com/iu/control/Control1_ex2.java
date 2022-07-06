package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		//정수 입력
		//짝수면 짝수 출력, 홀수면 홀수 출력
		//단, 단일 if문 한번만 작성

		int num1;
		
		System.out.println("정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		String tmp = "홀수";
		if(num1 % 2 == 0) {
			tmp = "짝수";
		}
		System.out.println(num1 + "은 " + tmp + "입니다.");
		
	}

}
