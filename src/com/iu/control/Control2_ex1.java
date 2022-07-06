package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {

		//월급을 입력 (400)
		//1. 정규직 2.계약직 (1,2 입력)
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7% ( = 3.6% )
		//계약직 - 3.3%

		Scanner sc = new Scanner(System.in);
		int pay;
		int form;
		double payFinal;
		
		System.out.println("월급을 입력하세요");
		pay = sc.nextInt();
		System.out.println("고용 형태를 입력하세요. (정규직:1, 계약직:2 )");
		form = sc.nextInt();
		
		if(form == 1) {
			payFinal = pay * 0.964;
			System.out.println("정규직은 3.6% 공제하여 " + (int)payFinal + "원 입니다.");
		} else if(form == 2 ) {
			payFinal = pay * 0.967;
			System.out.println("계약직은 3.3% 공제하여 " + (int)payFinal + "원 입니다.");
		}
		
		
		
		
	}

}
