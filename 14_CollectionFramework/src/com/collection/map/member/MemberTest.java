package com.collection.map.member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 회원 Map은 필드로 지정하고, MemberTest 생성자에서 map에 요소 추가할 것.
 * 
 *
 */
public class MemberTest {

	private Map<String, Member> map = new HashMap<>();
	
	public MemberTest() {
		//map에 요소를 추가
		map.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		map.put("sinsa", new Member("sinsa", "1234", "신사임당", 50, "01012341234"));
		map.put("leess", new Member("leess", "1234", "이순신", 43, "01012341234"));
		map.put("yooon", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		map.put("jangbg", new Member("jangbg", "1234", "장보고", 29, "01012341234"));
	}
	
	public static void main(String[] args) {
		MemberTest m = new MemberTest();
		
		m.test1();
		m.test2();
		m.test3();
		m.test4();
	}
	

	/**
	 * 1. map의 모든 member객체 정보 출력
	 */
	private void test1() {
		System.out.println("=========================================================================");
		System.out.println();
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%n", "id","password","name","age","phone");
		System.out.println("-------------------------------------------------------------------------");
		
		Collection<Member> members = map.values();
		for(Member m : members) {
			System.out.printf("%-15s%-15s%-15s%-15d%-15s%n", m.getUserId(), m.getUserPwd(), m.getUserName(), m.getAge(), m.getPhoneNumber());
		}
		
		System.out.println("-------------------------------------------------------------------------");

	}

	public boolean isUserExist(String userId) {
		return false;
	}
	

	/**
	 * 2. Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	 */
	private void test2() {
		System.out.println(map.containsKey("jangbg"));
		System.out.println(map.containsKey("sejong"));
	}
	
	/**
	 * 3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
	 * 
	 * 	- 비밀번호 : 5678
	 *	- 이름 : 윤동주
	 *	- 나이 : 27
	 * 	- 전화번호 : 01034563456
	 * 
	 */
	private void test3() {
		Member member = map.get("yooon");
		member.setUserPwd("5678");
		member.setUserName("윤동주");
		member.setAge(27);
		member.setPhoneNumber("01034563456");
		
		System.out.println(member);
	}
	
	/**
	 * 4. sinsa 아이디 회원을 삭제하세요.
	 */
	private void test4() {

		map.remove("sinsa");
		System.out.println(map.containsKey("sinsa"));
	}

	

}
