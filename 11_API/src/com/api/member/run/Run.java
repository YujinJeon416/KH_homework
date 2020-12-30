package com.api.member.run;

import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

/**
	다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.

	    "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
	
	각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
	
	출력메소드를 통해 회원정보를 출력한다.
	
	- 회원 com.api.member.model.vo.member
	    - memberNo : int
	    - memeberName : String
	    - height : int
	    - weight : int
	    - birth : Calendar
	    + information : String
	
	- 실행클래스 com.api.member.run.Run 
 */
public class Run {

	public static void main(String[] args) {
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		
		StringTokenizer token = new StringTokenizer(str,"|");
		while(token.hasMoreTokens()){
			String memberStr =  token.nextToken();
			String[] mStr = memberStr.split(",");
			
			Member m = new Member();
			m.setMemberNo(Integer.parseInt(mStr[0]));
			m.setMemberName(mStr[1]);
			m.setHeight(Integer.parseInt(mStr[2]));
			m.setWeight(Integer.parseInt(mStr[3]));
			int yyyy = Integer.parseInt(mStr[4].substring(0,4));
			int mm = Integer.parseInt(mStr[4].substring(4,6));
			int dd = Integer.parseInt(mStr[4].substring(6));
			m.setBirth(new GregorianCalendar(yyyy,mm-1,dd));
			System.out.println(m.infromation());
		}	
	}

}
