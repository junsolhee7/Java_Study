package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
//		nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아줌
		int com;
		int you;
		boolean result = false;
//		System.out.println(num);

		//0 : 가위, 1 : 바위, 2: 보
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행
		
		
		
		while(!result) {
			System.out.println("0 : 가위, 1 : 주먹, 2: 보");
			you = sc.nextInt();
			com = random.nextInt(3);
			System.out.println("You : " +you + " // Com : "+com);
			if(com == 0 && you == 2) {
				you= -1;
			}
			if(com == 2 && you ==0) {
				com = -1;
			}
			
			if(com<you) {
				System.out.println("You Win!!\n");
			}else if(com==you) {
				System.out.println("Even!!\n");
			}else {
				System.out.println("You Lose!!\n");
			}
				
			}
//			if(userNum == 0 && num == 2) {
//				System.out.println("승리하였습니다.");
//				System.out.println("컴퓨터 : " + num);
//				result = true;
//			}else if(userNum == 1 && num == 0) {
//				System.out.println("승리하였습니다.");
//				System.out.println("컴퓨터 : " + num);
//				result = true;
//			}else if(userNum == 2 && num == 1) {
//				System.out.println("승리하였습니다.");
//				System.out.println("컴퓨터 : " + num);
//				result = true;
//			}else if(userNum == num) {
//				System.out.println("비겼습니다.");
//				System.out.println("컴퓨터 : "+ num);
//			}else{
//				System.out.println("패배하였습니다.");
//				System.out.println("컴퓨터 : "+ num);	
//		}
	}

}
//home change