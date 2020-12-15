package kh.java.test.array;

import java.util.Scanner;

/**
 * 
 * [문제4]
- 클래스 : kh.java.test.array.Test4.java
- 메소드명 : public void test1()
    사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
     
        힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용
- 메소드명 : public void test2()
    위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
    * java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
    * 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.

 *
 */
public class Test4 {
	public static void main(String[] args) {
		Test4 t = new Test4();
		
		t.test1();
		t.test2();
}
	
	
	public void test1() {
		//1. 전화번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 11자리를 입력하세요: ");
		String str = sc.nextLine();
		
	     //2.반복문으로 char에 옮겨 담기
		char[] arr1 = new char[str.length()];
		
		for(int i=0; i<arr1.length; i++) {
	         arr1[i] = str.charAt(i);
	        }
		//3. 복사본 arr2[]만들기
		char[] arr2 = arr1.clone();
		
		//4. 가운데 4자리 교체
		arr2[3]='*';
		arr2[4]='*';
		arr2[5]='*';
		arr2[6]='*';
		
		//System.arraycopy(arr1, 3, arr2, 0, 4 );
		
		//출력
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("%c" ,arr2[i]);
		}

	}
	
	public void test2() {
		
	}
	}

