package com.exception.number;

public class NumberProcess {

	public boolean checkDouble(int a, int b) throws NumberRangeException{
		
		//(a>0&&a<=100)&&(b>0&&b<=100)
		//a,b가 모두 1에서 100사이의 수일때 참 ==> 둘중하나가 거짓이면, 거짓
		//!(거짓) 거짓일 경우, 참이 되어 if절 실행!
		if(!((a>0&&a<=100)&&(b>0&&b<=100)))
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		
		//a가 b의 배수인 경우
		if(a%b == 0)
			return true;
		else
			return false;
	}
}
