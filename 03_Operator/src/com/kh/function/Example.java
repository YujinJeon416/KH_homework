package com.kh.function;

import java.util.Scanner;

public class Example {
	

	/*
		   기능제공 클래스
	      패키지 : kh.java.operator.function
	      클래스명 : Example
	      메소드 :  public void opSample1() { }              
	      내용 : 국어, 영어, 수학, 총점, 평균을 변수 
	               선언, 각 점수를 키보드로 입력 받고 합계와 
	               평균을 계산하고 세과목의 점수와 평균을 
	               가지고 합격을 처리
	
	      조건 : 각 점수가 40이상이면서 평균이 
	                60점 이상이면 합격, 나머지는 다 불합격
	
	 */
	public void opSample1(){
		Scanner sc = new Scanner(System.in);
		System.out.print("> 국어점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.print("> 영어점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.print("> 수학점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		//합계 
		int total = kor + eng + math;
		
		//평균
		int avg = total/3;
		
		//합격/불합격
		String result = kor>=40 && eng>=40 && math>=40 && avg>=60?"합격":"불합격";
		
		//출력
		System.out.println("---------------------");
		System.out.println(result+"입니다.");
		
	}

	
	/*
	 	기능제공 클래스
      패키지 : kh.java.operator.function
      클래스명 : Example
      메소드 :  public void opSample2() { }              
      내용 : 학생이름, 학년, 반, 번호, 성별(문자, M / 
                F), 성적(실수), 입력 받고 아래와 같이 출
               력
	출력 예) 
	  3학년 2반 24번 남학생 홍길동은 성적이 99.55이다.
	  
	    조건 : 성별이 M이면 남학생, F면 여학생출력
	              성적은 소수점 2자리까지 출력

	 */
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 학생이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("> 학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("> 반을 입력하세요 : ");
		int cl = sc.nextInt();
		System.out.print("> 번호를 입력하세요 : ");
		int stdtNum = sc.nextInt();
		System.out.print("> 성별을 입력하세요[M/F] : ");
		char gender = sc.next().charAt(0);
		String strGender = gender=='M'?"남":"여";
		System.out.print("> 성적를 입력하세요 : ");
		double stdtMark = sc.nextDouble();
		
		//출력
		System.out.printf("%d학년 %d반 %d번 %s %s은/는 성적이 %.2f이다.", grade, cl, stdtNum, strGender, name, stdtMark);
		
	}


	
}
