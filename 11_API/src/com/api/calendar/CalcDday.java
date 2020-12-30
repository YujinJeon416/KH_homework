package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * [문제2] 
 * 패키지 com.api.calendar.CalcDday.java
 * Calendar클래스를 이용해서 D-DAY계산기를 만드세요.
 * 사용자로 부터 D-day를 입력받고, 다음과 같이 출력하세요.
 * 
 * ->  193일 남았습니다. (D-DAY 전)
 * ->  D-DAY입니다.(D-DAY)	
 * ->  20일 지났습니다.(D-DAY가 지난 경우)
 * 
 * 
 * @author shqkel1863
 *
 */
public class CalcDday {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("D-Day를 입력하세요.\n년도(yyyy) : ");
		int yyyy = sc.nextInt();
		System.out.print("월 : ");
		int mm = sc.nextInt();
		System.out.print("일 : ");
		int dd = sc.nextInt();
		
		Calendar today = Calendar.getInstance();
		
		Calendar dday = Calendar.getInstance();
		//dday.set(yyyy, mm, dd);
		dday.set(yyyy, mm-1, dd, 0, 0, 0);
		dday.set(Calendar.MILLISECOND, 0);
		
		
		//날짜차이 계산
		double diff = (dday.getTimeInMillis()-today.getTimeInMillis());
		System.out.println(diff);
		
		diff = diff / (1000*60*60*24);
		System.out.println(diff);
				
		
		if(diff > 0)
			System.out.println((int)diff + 1 + "일 남았습니다.");
		else if(diff > -1)
			System.out.println("D-Day입니다");
		else 
			System.out.println(-(int)diff + "일 지났습니다.");
			
	}

}
