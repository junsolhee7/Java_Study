package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
	
		//2 (입력받기)
		char ch; // => c,       z+1 ->a
		int num;
		Scanner sc = new Scanner(System.in);
		
		//char test = 'z';
		//System.out.println((char)123); //a=97, z=122
		// A=65, Z=90
		
		
		System.out.println("1-5 사이의 숫자 입력");
		num = sc.nextInt();
		
		System.out.println("알파벳을 입력");
		ch = sc.next().charAt(0);
		ch += num;
		//소문자가 범위를 벗어낫을때
		if(ch>122) {
			ch -= 26;
		}
		//대문자가 범위를 벗어낫을때
		if(ch>'Z' && ch<'a') {
			ch -= 26;
			System.out.println("대문자가 범위를벗어남");
		}
		System.out.println("암호화된 알파벳 : " + ch);
		
		//Study Edition
		//Home Edition

	}

}
