package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import com.io.test4.model.vo.Book;

public class BookManager {
	
	public void fileSave(){
		Book[] bookArr = new Book[5];
		Calendar cal0 = Calendar.getInstance();
		cal0.set(2017, 9, 27);
		bookArr[0] = new Book("신경끄기의 기술", "마크 맨슨", 15000, cal0, 0.1);
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 7, 19);
		bookArr[1] = new Book("언어의 온도", "이기주", 14000, cal1, 0.1);
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2017, 11, 5);
		bookArr[2] = new Book("파리의 아파트", "기욤 뮈소", 13000, cal2, 0.1);
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2012, 11, 19);
		bookArr[3] = new Book("나미야 잡화점의 기적", "히가시노 게이고", 15000, cal3, 0.1);
//		Calendar cal4 = Calendar.getInstance();
//		cal4.set(2017, 11, 5);
		//[[2]] : 중복된 Calendar 인스턴스를 하나의 메소드화.
		bookArr[4] = new Book("말의 품격", "이기주", 15000, getCalenderInstance(2017, 5, 29), 0.1);
		
		try (
			FileOutputStream fos = new FileOutputStream("test4/books.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				){
			
			oos.writeObject(bookArr);
			System.out.println("books.dat에 저장완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	


	public Calendar getCalenderInstance(int year, int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, date);
		return cal;
	}



	public void fileRead(){
		Book[] bookArr = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("test4/books.dat")));){
			bookArr = (Book[])ois.readObject();
			for(int i=0; i<bookArr.length; i++){
				if(bookArr[i]!=null)
					System.out.println(bookArr[i].toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	
}
