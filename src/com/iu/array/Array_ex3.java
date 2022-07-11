package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적프로그램
		//1.학생 정보 입력
		// -학생 수를 입력
		// -이름,번호,국어,영어,수학 입력후 계산 총점,평균
		//2.학생 정보 조회
		// -모든 학생의 이름,번호,총점,평균 출력
		//3.학생 정보 검색
		// - 검색할 학생의 번호를 입력
		// - 입력한 번호와 일치하는 학생의 모든 정보 출력
		// - 일치하는 번호가 없으면 없는 학생이다 출력
		//4.학생 정보 삭제
		// - 삭제할 학생의 번호를 입력
		// - 입력한 번호와 일치하는 학생의 정보 삭제)배열을 한칸 삭제
		// - 일치하는 번호가 없으면 없는 학생이다 출력
		//5.학생 정보 추가
		// - 이름,번호,국어,영어,수학 입력후 계산 총점, 평균 추가
		//6.프로그램 종료

		boolean check = true;
		boolean existSearch = false;
		boolean existDelete = false;
		int state;
		int studentNum = 0; //학생 수
		String [] name = new String[0]; //이름
		int [] num = new int[0]; //번호
		int [] kor = new int[0]; //국어
		int [] eng = new int[0]; //영어
		int [] math = new int[0]; //수학
		int [] total = new int[0]; //총점
		int [] avg = new int[0]; //평균
		Scanner sc = new Scanner(System.in);
//		배열은 이름,번호,국,영,수,총점,평균 7개
		while(check) {
			System.out.println("\n1.학생 정보 입력");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.프로그램 종료");
			state=sc.nextInt();
			switch(state) {
			case 1:
				System.out.println("학생 수를 입력하세요");
				studentNum = sc.nextInt();
				name = new String[studentNum];
				num = new int[studentNum];
				kor = new int[studentNum];
				eng = new int[studentNum];
				math = new int[studentNum];
				total = new int[studentNum];
				avg = new int[studentNum];
				for(int i=0; i<studentNum; i++) {
					System.out.println("이름을 입력하세요");
					name[i] = sc.next();	
					System.out.println("번호를 입력하세요");
					num[i] = sc.nextInt();
					System.out.println("국어점수를 입력하세요");
					kor[i] = sc.nextInt();
					System.out.println("영어점수를 입력하세요");
					eng[i] = sc.nextInt();
					System.out.println("수학점수를 입력하세요");
					math[i] = sc.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i] = total[i]/3;
				}
				break;
			case 2://조회
				for(int i=0; i<studentNum; i++) {
					System.out.println("이름:"+ name[i]+" 번호:"+ num[i]+" 총점:"+ total[i]+" 평균"+avg[i] );
				}
				break;
			case 3://검색
				System.out.println("검색할 학생의 번호를 입력하세요.");
				int search = sc.nextInt();
				for(int i=0; i<studentNum; i++) {
					if (search == num[i]) {
						System.out.println("이름:"+name[i]+" 번호:"+num[i]+" 국어:"+kor[i]+"영어:"+eng[i]+
								" 수학:"+math[i]+" 총점:"+total[i]+" 평균:"+avg[i]);
						break;
					}else if (existSearch == true){
						System.out.println("존재하지 않는 학생입니다.");
					}
				}
				break;
			case 4://삭제
				System.out.println("삭제할 학생의 번호를 입력하세요.");
				search = sc.nextInt();
				for(int i=0; i<studentNum; i++) {
					if (search == num[i]) {
						System.out.println("이름:"+name[i]+" 번호:"+num[i]+" 해당 학생의 정보가 삭제되었습니다.");
						name[i]=null;num[i]=0;kor[i]=0;eng[i]=0;math[i]=0;total[i]=0;avg[i]=0;
						existDelete = true;
						break;
					}else if (existDelete == true){
						System.out.println("존재하지 않는 학생입니다.");
					}
				}
				
				break;
			case 5://추가
				System.out.println("추가할 학생의 번호를 입력하세요.");
				int input = sc.nextInt();
				System.out.println("학생번호 추가기능은 개발 진행중입니다.");
				break;
				
			default://종료
				check=false;
			}
		}
				

		

		

	}

}
