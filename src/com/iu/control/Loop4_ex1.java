package com.iu.control;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {

		// 분과 초 입력
		// ex) 1,15 -> 1분15초 후 멈춤 (break)
		int minute;
		int second;
		Scanner sc = new Scanner(System.in);
		System.out.println("분을 입력하세요");
		minute = sc.nextInt();
		System.out.println("초를 입력하세요");
		second = sc.nextInt();
		
		for(int m=0; m<60; m++) {
			for(int s=0; s<60; s++) {
				System.out.println(m+"분 : "+s+" 초");
				if(m==minute && s==second) {
					m=60;
					s=60;
				}
			}
		}

	}

}
