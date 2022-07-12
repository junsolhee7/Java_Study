package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {

		int [] ar = {4,7,1,3,9};
		
		//12,13,14,15,23,24,25,34,35,45 = 4/3/2/1
		for(int i=0; i<ar.length-1; i++) {
			//i=0, 1234
			//i=1, 234
			//i=2, 34
			//i=3, 4
			for(int j=i+1; j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int tmp = ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {	
			System.out.println(ar[i]);
		}
		//내림차순 새로운배열x 칸추가삭제x, 별찍기와 정렬 관련, 나중엔 알아서 정렬해줌, 논리력을위해 실습
		

	}

}
