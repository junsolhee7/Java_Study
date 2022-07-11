package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {


		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//몬스터 기본 정보
		String [] monsterNames = {"고블린","오크","트롤","골렘"};
		int [] monsterHps = {5,7,10,15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		int randomMagicPower;
		
		//몬스터 파티 생성
		//몬스터 수 입력(1-4)
		//입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
		
		System.out.println("몬스터 수를 입력하세요.(1-4)");
		int count = sc.nextInt();
		String [] monsterPartyNames = new String[count];
		int [] monsterPartyHps = new int[count]; //monsterPartyNames와 같은 길이의 배열 선언
		for(int i=0; i<monsterPartyNames.length; i++) {
			int index = random.nextInt(4); //몬스터의 배열에서 무작위로 한 몬스터 선택
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
		}
		//1회성
		//0-6미만의 랜덤한 데미지로 몬스터를 공격
		//광역데미지
		for(int i=0; i<monsterPartyNames.length;i++) {
			System.out.print(monsterPartyNames[i]+ " "+ monsterPartyHps[i] +" -> ");
			randomMagicPower = random.nextInt(magicPower);
			monsterPartyHps[i] -= randomMagicPower;
			System.out.println(monsterPartyHps[i]+" (-"+ randomMagicPower + ")");
		}

		

	}

}
