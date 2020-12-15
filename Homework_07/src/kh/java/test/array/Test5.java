package kh.java.test.array;

import java.util.Scanner;

/**
 * [문제5]
- 클래스 : kh.java.test.array.Test5.java
- 메소드명 : public void test()
    주민등록번호 성별자리 이후부터 *로 가리기.  
    단, 원본 배열값은 변경 없이 배열 복사본으로 
    변경하세요
     
    힌트) 복사방법
       - for문이용 1:1대입
       - System.arraycopy() 매소드 이용
       - clone() 매소드 이용

 * 
 *
 */
public class Test5 {
	public static void main(String[] args) {
		Test5 t = new Test5();
		
		t.test();
	}
	
	public void test() {
	
	
	//1. 주민등록번호 문자열 입력받기
	Scanner sc = new Scanner(System.in);
	System.out.print("주민등록번호 13자리를 입력하세요: ");
	String str = sc.nextLine();
	
     //2.반복문으로 char에 옮겨 담기
	char[] arr1 = new char[str.length()];
	
	for(int i=0; i<arr1.length; i++) {
         arr1[i] = str.charAt(i);
        }
	//3. 복사본 char[]에 성별자리 이후부터 *로 바꾸기
	char[] arr2 = new char[arr1.length];
	
	for(int i =0; i<arr2.length; i++) {
		
	if(i <=6) {//7번 인덱스 이하까지는
		arr2[i] = arr1[i]; //원래 번호로 
		}else { //7번 인덱스 부터는 * 
			arr2[i] = '*';
		}
	
	//출력
	System.out.print(arr2[i]);
	}
	}
      
	}

