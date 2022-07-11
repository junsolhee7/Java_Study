package com.iu.array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
		//배열은 어떤 데이터타입이든 상관 X
		//모을려고하는데이터타입 [] 변수명 = new 모을려고하는데이터타입[갯수]
		
		String [] names = new String [3];
//		names[0] = "iu";
//		names[1] = "choa";
//		names[2] = "suji";
		//names[3] = ""; //컴파일시 에러는 안뜨지만 실행시 에러발생, ArrayIndexOutOfBoundsException, 에러 해석 능력 필요,
		
		int [] nums = new int[3];
		System.out.println(nums[0]);
		System.out.println(names[0]);
		Scanner [] sc = new Scanner[2];
		
		int [] nums2 = {1,4,52}; //잘 사용되지 않는 방식
		int num3 [] ; //선호되지 않는 방식, 이유는 배열 말고 int 타입으로 착각할 소지가 있음
		
		

	}

}
