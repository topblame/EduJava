package chapter10.Interface;

public class SmartTelevision_03 {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(10);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println();
		
		//Remote 클래스에 정의되어 있는 메서드만 오버라이딩 된 메소드
		Remote rc= tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		
		System.out.println();
		
		Searchable sc = tv;
		sc.search("www.daum.net");
	}
}
