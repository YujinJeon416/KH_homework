package com.io.test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public void fileAppend() throws IOException {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.nextLine();
		
		//파일읽어오기용 스트림생성
		BufferedReader br2 = new BufferedReader(new FileReader("test2/"+fileName));
		String data = "";
		while((data=br2.readLine())!=null)
			System.out.println(data);
		br2.close();
		
		//파일출력스트림생성.
		//파일 append여부 true 파라미터 추가.
		BufferedWriter bw = new BufferedWriter(new FileWriter("test2/"+fileName, true));
		System.out.println("파일에 추가할 내용을 입력하세요. : ");
		StringBuilder sb = new StringBuilder();
		while((data=sc.nextLine())!=null){
			if(!"exit".equals(data))
				sb.append(data+"\n");
			else 
				break;
		}
		System.out.print("저장하시겠습니까?(y/n) : ");
		String willSave = String.valueOf(sc.next().toUpperCase().charAt(0));
		
		//사용자 저장(Y)선택시, 파일쓰기.
		if("Y".equals(willSave)){
			bw.write(sb.toString());
		}	
		System.out.println(fileName+"파일이 성공적으로 변경되었습니다.");
		bw.close();
	}

	public void fileOpen() throws FileNotFoundException, IOException {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.next();
		
		//파일읽어오기용 스트림생성
		BufferedReader br2 = new BufferedReader(new FileReader("test2/"+fileName));
		String data = "";
		while((data=br2.readLine())!=null)
			System.out.println(data+"\n");
		
		//스트림반납
		br2.close();
	}

	public void fileSave() throws IOException {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		StringBuilder sb = new StringBuilder();
		String data = "";
		while((data=sc.nextLine())!=null){
			if(!"exit".equals(data))
				sb.append(data+"\n");
			else 
				break;
		}
		System.out.print("저장하시겠습니까?(y/n) : ");
		String willSave = String.valueOf(sc.next().toUpperCase().charAt(0));
		if("Y".equals(willSave)){
			System.out.print("파일명을 입력하세요 : ");

			sc.nextLine();	//enter값 날리기용 메소드
			String fileName = sc.nextLine();
			FileWriter fw = new FileWriter("test2/"+fileName);
			fw.write(sb.toString());
			System.out.println(fileName+"을 성공적으로 저장하였습니다.");
			fw.close();
		}	
	}

}
