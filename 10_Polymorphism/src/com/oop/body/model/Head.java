package com.oop.body.model;

public class Head  extends Body{
	private String hairColor;

	public Head(){}
	
	public Head(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public void headBanging(){
		System.out.println(hairColor+"색 머리를 힘차게 돌립니다.");
	}
	
}
 