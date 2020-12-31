package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		new Run().test();
	}		

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
		int b = sc.nextInt();
		
		try {
			boolean bool = new NumberProcess().checkDouble(a, b);
			
			if(bool) System.out.println(a+"는 "+b+"의 배수입니다.");
			else System.out.println(a+"는 "+b+"의 배수가 아닙니다.");
			
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
