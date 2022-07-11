package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		//얕은 복사
		//실제 값 복사 X 해당값 가르키는 주소 복사 O
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		int [] nums3 = new int[3];
		for(int i=0; i<nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		//깊은 복사
		//실제 값 복사, 독립적
		nums2[0] = 9;
		System.out.println(nums1[0]);
		
		nums3 = new int [3]; //갈아엎고 빈껍데기로 초기화 (0으로 채워짐)
		System.out.println(nums3[0]);

	}

}
