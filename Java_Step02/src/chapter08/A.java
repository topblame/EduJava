package chapter08;

public class A {
	//상속 전용 -> public 역할이있어서 같은 패키지에서 사용가능  다른패키지 에서는 상속받은 클래스 에서만 사용
	// 상속 받지않은 클래스에서는 사용할 수 없음. 즉 private 여할도 있
	protected String field;
	
	//생성자
	
	//메서드 
	protected void method() {
		System.out.println("A class");
		System.out.println(field);
	}
}
