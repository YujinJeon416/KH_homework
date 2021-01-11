package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		Calendar birth = new GregorianCalendar(1987, 5-1, 27);
		Calendar today = new GregorianCalendar();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 dd일 E요일", Locale.KOREA);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 dd일", Locale.KOREA);
		System.out.println("생일 : "+sdf1.format(new Date(birth.getTimeInMillis())));
		System.out.println("현재 : "+sdf2.format(new Date(today.getTimeInMillis())));
		
		long age = (today.getTimeInMillis()-birth.getTimeInMillis())/1000/60/60/24/365;//밀리초/초/분/시/일/년
		System.out.println("나이 : "+age+"세");
		
	}

}
