package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); //일요일:1~토요일:7
		String sDay="";
		
		switch(day){
		case 1: sDay = "일요일"; break;
		case 2: sDay = "월요일"; break;
		case 3: sDay = "화요일"; break;
		case 4: sDay = "수요일"; break;
		case 5: sDay = "목요일"; break;
		case 6: sDay = "금요일"; break;
		case 7: sDay = "토요일"; break;
		}
		
		System.out.println(year+"년 "+month+"월 "+date+"일 "+sDay);
	}
}
