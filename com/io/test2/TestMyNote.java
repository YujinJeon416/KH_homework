package com.io.test2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		try {
			menu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		MyNote note = new MyNote();
		
		int userNum = 0;
		String menu = "******   MyNote  *******\n"
					+ "1. 노트 새로 만들기\n"
					+ "2. 노트 열기\n"
					+ "3. 노트 수정하기\n"
					+ "4. 끝내기\n"
					+ "************************\n"
					+ "메뉴선택 : ";

		while(true){
			System.out.print(menu);
			try {
				userNum = sc.nextInt(); 				
			} catch (InputMismatchException e) {
				System.out.println("올바른 메뉴번호를 입력해주세요.");
				sc.next();
			}
			
			switch (userNum) {
				case 1: note.fileSave(); break;
				case 2: note.fileOpen(); break;
				case 3: note.fileAppend(); break;
				case 4: System.out.println("프로그램을 종료합니다.");return;
			}
		}
	}

}
