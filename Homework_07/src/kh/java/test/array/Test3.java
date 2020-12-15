package kh.java.test.array;

import java.util.Scanner;

/**
 * 
 * [문제3]
- 클래스 : kh.java.test.array.Test3.java
- 메소드명 : public void test()
    문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.

 *
 */
public class Test3 {
	
		public static void main(String[] args) {
			Test3 t = new Test3();
			
			t.test();
		}
		
		public void test() {
			//1. 문자열과 문자 입력받기
			Scanner sc = new Scanner (System.in);
			System.out.print("입력값 :");
			String str = sc.nextLine();
			
			System.out.println("검색값 :");
			char ch = sc.nextLine().charAt(0);
			
			//2. 문자열 배열에 넣기
			char[] arr = new char[str.length()]; //배열 할당
			for(int i = 0; i < arr.length; i++) {
				arr[i] = str.charAt(i); // 값을 arr[i]에 담음
			}
			
			
			//3. 검색값이 문자열에 몇개 들어있는지 갯수세기
			int count = 0; //변수 
			for(int i =0; i<arr.length; i++) {
				if(arr[i] == ch) { // 인덱스 값이 검색값과 같으면
					 //해당 인덱스 이어서 출력한다.
					count++; //그리고 count 1증가
				}
				
			}
			
			System.out.println("입력하신 문자열" + str+"에서 찾으시는 문자" + ch +"는(은)" + count + "개 입니다.");
		}

}
