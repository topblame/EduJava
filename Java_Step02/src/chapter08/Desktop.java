package chapter08;

import chapter09.Computer;

public class Desktop extends Computer {

	//추상 클래스를 상속 박으면 추상 메서드는 반드시 구현해서 사용.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Display()");
		
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop Typing");
	}
	
}
