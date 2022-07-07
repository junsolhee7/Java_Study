package com.iu.control;

public class Control4 {

	public static void main(String[] args) {

		//
		int select = 2;
		
		switch(select) {
		case 1:
			System.out.println("1일때 진행");
			break;//반필수
			
		default:
			System.out.println("그외 나머지 진행");
			
		case 2:
			System.out.println("2일때 진행");
			break;
			//break는 써도되고 안써도됨, case,default위치는 상관없음
		}
	}

}
