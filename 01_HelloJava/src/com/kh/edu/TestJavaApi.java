package com.kh.edu;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class TestJavaApi {

	public static void main(String[] args) {
		TestJavaApi t = new TestJavaApi();
		t.test();
	}

	private void test() {
		//1. Date의 메소드 가져오기
		Date d = new Date();
		System.out.println(
				(d.getYear() + 1900) + "/" + 
				(d.getMonth() + 1) + "/" + 
				d.getDate()
			);//Deprecated

		//2. 형식객체 SimpleDateFormat 사용하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(d));
		
		//3. java.util.Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(
				cal.get(Calendar.YEAR) + "/" +
				(cal.get(Calendar.MONTH) + 1) + "/" +
				cal.get(Calendar.DATE)
			);

	}

}
