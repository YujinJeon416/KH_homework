package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Calculator c = new Calculator();
		double result = 0;
		
		System.out.print("정수 입력 : ");
		
		try {
			result = c.getSum(sc.nextInt());
			System.out.println("결과값 : " + result);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}	
		
		
		

	
	}

}
