package com.kh.test;

import java.util.Scanner;

/*
 	문자열을 하나 입력 받아 배열에 넣고 문자를 
	하나 입력 받아 입력 받은 문자가 문자열에 몇 개
	인지 개수를 출력하는 프로그램을 작성하세요.

	예) 입력값 : helloworld
		검색값 :ㅣ
		출력 : 입력하신 문자열 helloworld에서 
				찾으시는 문자 l은 3개 입니다.
*/

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();
		
	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 하나 입력하세요 ==> ");
		String str  = sc.nextLine();
		//1.반복문을 통한 문자배열 생성
//		char[] arr = new char[str.length()];
//		
//		//반복문을 통해 문자배열에 값대입
//		for(int i=0; i<str.length(); i++) {
//			arr[i] = str.charAt(i);
//		}
		
		//2.String객체의 toCharArray메소드 이용하기
		char[] arr = str.toCharArray();
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("검색할 문자를 하나 입력하세요 ==> ");
		char searchK  = sc.nextLine().charAt(0);
		
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==searchK) cnt++;
		}
		
		System.out.printf("입력값 : %s\n", str);
		System.out.printf("검색값 : %s\n", searchK);
		System.out.printf("찾으시는 문자 '%s'은(는) %d개 입니다.", searchK,cnt );		
	}

}
