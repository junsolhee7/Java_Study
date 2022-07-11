package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {

		//키보드로부터 인원수를 입력 받아서
		//인원수 만큼 이름을 입력 받아서
		//이름들을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요.");
		int num = sc.nextInt();
		String [] name = new String[num];
		int [] kor = new int[name.length];
		
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"번째 이름을 입력하세요");
			name[i] = sc.next();
		}
		for(int i=0;i<name.length; i++) {
			System.out.println(name[i]+"의 국어점수를 입력하세요");
			kor[i] = sc.nextInt();
		}
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"의 국어점수는 " + kor[i] + " 입니다.");
		}
		int total = 0;
		for(int i=0;i<name.length;i++) {
			total += kor[i];
		}
		System.out.println("국어총점 : "+total);
		//각 학생의 이름별로 국어점수 입력 후 출력
		//반의 국어 총점을 계산하고 출력
	}

}
