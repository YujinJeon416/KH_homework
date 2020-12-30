package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * [문제1] 
 * 패키지 com.api.calendar.CalcYourDays.java
 * 사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요.
 * @author shqkel1863
 *
 */
public class CalcYourDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("생일을 입력하세요.\n년도(yyyy) : ");
		int yyyy = sc.nextInt();
		System.out.print("월 : ");
		int mm = sc.nextInt();
		System.out.print("일 : ");
		int dd = sc.nextInt();
		
		//today위치에 주의하자.
		//시분초단위입력을 안하고, today를 사용자 입력이전에 위치시키면, 시간차가 줄어들어서 하루가 줄어든다.
		//1일차인 86400초보다 적다면, 하루가 줄어든다.
		Calendar today = Calendar.getInstance(); 

		
		Calendar birth = Calendar.getInstance();
		birth.set(yyyy, mm-1, dd);	
		//날짜차이 계산
		long diff = (today.getTimeInMillis()-birth.getTimeInMillis())/1000;
		
		System.out.println(diff);
		diff = diff/(60*60*24);
		System.out.println("오늘은 "+(diff+1)+"번째날입니다."); //태어난 날이 0이 아닌 1번째 날이므로 +1을 해준다.
		
		
	}

}
