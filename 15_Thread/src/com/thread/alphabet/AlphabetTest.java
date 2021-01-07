package com.thread.alphabet;


public class AlphabetTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new UpperAlphabetThread("대문자쓰레드 "));
		Thread t2 = new Thread(new LowerAlphabetThread("소문자쓰레드"));
		t1.start();
		t2.start();
		
	}
}

class UpperAlphabetThread implements Runnable {
	private String name;

	public UpperAlphabetThread (String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 'A'; i <='Z'; i++) {
			System.out.println(name+" : "+ (char)i);
		}
	}
}

class LowerAlphabetThread implements Runnable {
	private String name;

	public LowerAlphabetThread (String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 'a'; i <='z'; i++) {
			System.out.println("\t" + name+" : "+ (char)i);
		}
	}
}

