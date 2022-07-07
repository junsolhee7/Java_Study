package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {

				//국어,영어,수학 입력
				//총점 평균 계산
				//평균 90점 이상이면 A
				//평균 80점 이상이면 B
				//평균 70점 이상이면 C
				//평균 60점 이상이면 D
				//그외는 F
				//다중if -> switch case
				int kor, eng, math, total, avg;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("국어 점수를 입력하세요.");
				kor = sc.nextInt();
				System.out.println("영어 점수를 입력하세요.");
				eng = sc.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				math = sc.nextInt();
				total = kor + eng + math;
				avg = total / 3;
				
				switch(avg/10) {
				case 10:
					System.out.println("A입니다.");
					break;
				case 9:
					System.out.println("A입니다.");
					break;
				case 8:
					System.out.println("B입니다.");
					break;
				case 7:
					System.out.println("C입니다.");
					break;
				case 6:
					System.out.println("D입니다.");
					break;
				default:
					System.out.println("F입니다.");
				}
				

	}

}
