package com.iu.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {

		//변수 선언 공식
		//데이터타입 변수명
		//String name; 
		//Scanner sc; //sc의 데이터타입은 Scanner
		
		
		int age = 30;
		
		//배열선언
		//모을려고하는데이터타입 [] 변수명
		//nums는 int타입이 아니다
		
		int [] nums = new int[3];
		char [] names = new char[2];
		
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		names[0] = 'a';
		names[1] = '가';
		
		
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);
		System.out.println(nums[0]);
		System.out.println(nums[2]);
		System.out.println(names[0]);
		System.out.println(names[1]);
		
		

	}

}
//자바는 메모리 영역이 크게 3가지로 구분
//1.Method 메인메소드는 exe파일과 같다. 메인메소드는 stack으로 이동된다.
//2.Stack 가장먼저들어온 메인메소드가 제일 마지막에 마무리, 메소드안 지역변수 모두다
//3.Heap new로만든것들 모두다 
//모든 reference타입은 4바이트