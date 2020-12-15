package com.kh.test;

/*
	길이가 100인 배열을 선언하고 1부터 100까지의 값을 순서대로 배열 인덱스에 넣어 그 값을 출력하는 코드를 작성하시오.

   for문을 이용하는 방법을 한번씩 사용하여 작성하세요.

 */
public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
	}

	private void test() {
		int[] iArr = new int[100];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i+1;
		}
		
		//확인용
		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr["+i+"]="+iArr[i]);
		}
	}

}
