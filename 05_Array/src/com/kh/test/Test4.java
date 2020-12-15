package com.kh.test;


import java.util.Scanner;


public class Test4 {
	public static void main(String[] args){
		Test4 t = new Test4();
		t.test1();
		
		t.test2();
	}

	/*
		4)사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
	   단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	 
		힌트) 복사방법
	   - for문이용 1:1대입
	   - System.arraycopy() 매소드 이용
	   - clone() 매소드 이용
	 */
	private void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 (-)없이 입력하세요 (예시.0101234578) ==> ");
		String phNum = sc.nextLine();
		
		//char[] cArr = phNum.toCharArray();//자바는 문자열을 char[]로 변환하는 메소드를 제공한다.
		char[] cArr = new char[11];
		for (int i = 0; i < phNum.length(); i++) {
			cArr[i] = phNum.charAt(i);
		}
		
		//복제본 생성
		char[] cArrCopy = new char[11];
		//1.for문이용 깊은복사
//		for (int i = 0; i < cArr.length; i++) {
//			if (i>2 && i<7) {
//				cArrCopy[i] = '*';
//			}
//			else cArrCopy[i] = cArr[i];
//		}
		
		//2. System.arraycopy() 이용 깊은복사
		/*System.arraycopy(cArr, 0, cArrCopy, 0,11); //리턴값 없음.
		for (int i = 0; i < cArrCopy.length; i++) {
			if(ii>2 && i<7) cArrCopy[i] = '*';
		}*/
		
		//3. clone() 이용 깊은 복사
		cArrCopy = cArr.clone();
		for (int i = 0; i < cArrCopy.length; i++) {
			if(i>2 && i<7) cArrCopy[i] = '*';
		}
		
		//확인용
		//원본 cArr
		for (int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}
		System.out.println("\n----------------------");

		//복사본 cArrCopy
		for (int i = 0; i < cArrCopy.length; i++) {
			System.out.print(cArrCopy[i]);
		}
	}

	/** 
	 *  위문제를 배열복사없이 문자열차원에 가운데 4자리를 교체해보자.
	 * - java.lang.String.substring(beginIndex, endIndex) 메소드 찾아볼것!
	 * - 문자열은 직접 수정이 불가하므로, 특정자리의 문자열을 가져와 처리해야한다.
	 * 
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 (-)없이 입력하세요 (예시.0101234578) ==> ");
		String phNum = sc.nextLine();
		
		//자바에서 String은 immutable이라 변경할 수 없다.
		//phNum.charAt(3) = '*'; => 이와 같은 메소드는 없다.
		//변경된 문자열을 새로 생성해야 한다.
		//substring(beginIndex)
		//substring(beginIndex, endIndex)
		//자바에서 문자열의 일부를 가져오는 메소드는 substring이다. 
		//* beginIndex => inclusive
		//* endIndex => exclusive
		// java api확인할 것.
		String result = phNum.substring(0,3)+"****"+phNum.substring(7);
		System.out.println(result);
		
		
		//혹은 StringBuilder, StringBuffer객체를 사용하자.
		//문자단위로 값을 대입할 수 있는 setCharAt(index, char)를 지원한다.
		StringBuilder sb = new StringBuilder(phNum);
		sb.setCharAt(3, '*');
		sb.setCharAt(4, '*');
		sb.setCharAt(5, '*');
		sb.setCharAt(6, '*');
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer(phNum);
		sbf.setCharAt(3, '*');
		sbf.setCharAt(4, '*');
		sbf.setCharAt(5, '*');
		sbf.setCharAt(6, '*');
		
		System.out.println(sbf);
	}
}

