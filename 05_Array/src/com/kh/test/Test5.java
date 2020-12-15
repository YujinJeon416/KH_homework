package com.kh.test;

import java.util.Scanner;

/*
	주민등록번호 성별자리 이후부터 *로 가리기.  
	단, 원본 배열값은 변경 없이 배열 복사본으로 
	변경하세요
	 
	힌트) 복사방법
	   - for문이용 1:1대입
	   - System.arraycopy() 매소드 이용
	   - clone() 매소드 이용

 */
public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test();
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 (예시.990808-2123456) ==> ");
		String ju = sc.nextLine();
		
		//char[] juArr = ju.toCharArray();
		char[] juArr = new char[14];
		for (int i = 0; i < ju.length(); i++) {
			juArr[i] = ju.charAt(i);
		}
		char[] juArr_ = new char[14];
		
		System.arraycopy(juArr, 0, juArr_, 0, juArr.length);
		
		for (int i = 0; i < juArr_.length; i++) {
			if(i>7) juArr_[i] = '*';
			System.out.print(juArr_[i]);
		}
		
	}

}
