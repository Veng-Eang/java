package com.vengeang.java.school.testadapterpattern;

public class RussianTranslator implements ITranslator {
	RussianTeacher t=new RussianTeacher();
	EnglishTeacher e=new EnglishTeacher();
	
	public void originalSpeech() {
		e.techEnglish();
	}
	
	@Override
	public void translate() {
		// TODO Auto-generated method stub
		System.out.println("Translating English to Khmer");
	}

}
