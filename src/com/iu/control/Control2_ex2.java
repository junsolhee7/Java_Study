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
		
		
		System.out.println("1-5 사이의 숫자 입력");
		num = sc.nextInt();
		
		System.out.println("알파벳을 입력");
		ch = sc.next().charAt(0);
		ch += num;
		if(ch>122) {
			ch -= 26;
		}
		System.out.println("암호화된 알파벳 : " + ch);
		
		//Home Edition

	}

}
