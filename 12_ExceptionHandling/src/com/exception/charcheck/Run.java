package com.exception.charcheck;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		new Run().test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		try {
			String s = sc.nextLine();
			
			CharacterProcess cp = new CharacterProcess();
			System.out.println(cp.countAlpha(s));
			
		} catch (CharCheckException e) {
			//에러메세지만 출력!
			System.out.println(e.getMessage());
		} 
		
		
	}

/*	public void test() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력하세요 : ");
		try {
			String s = br.readLine();
			
			CharacterProcess cp = new CharacterProcess();
			System.out.println(cp.countAlpha(s));
			
		} catch (CharCheckException e) {
			//에러메세지만 출력!
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}*/

}
