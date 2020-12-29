package member.controller;

import member.model.vo.Member;

public class MemberManager {
	public static final int MAX_MEMBER = 40;
	private Member[] arr = new Member[MAX_MEMBER];
	private int idx = 0;	// 1.다음 member객체의 index 2.현재까지 입력된 member객체수
	
	public void insertMember(Member member) {
		arr[idx++] = member;
	}
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i = 0; i < idx; i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", 
							  arr[i].getName(), 
							  arr[i].getGrade(), 
							  arr[i].getPoint(), 
							  arr[i].getEjapoint());			
		}
	}
}
