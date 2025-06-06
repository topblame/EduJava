package chapter09;

public abstract class GameCharacter {
	//템플릿 메서드 : 전투게임 순서 정의
	
	public final void fight() {
		enterBattlefield(); //전투게임시작
		arrtack(); // 게임-> 하위 클래스의 구현
		useUItimate(); // 아이템 사용 - >하위클래스의 구현
		leaveBattlefield(); //전투게임 종료.
 	}
	
	// 공통메소드
	private void enterBattlefield() {
		System.out.println("[입장] 캐릭터가 전장에 입장합니다. ");
	}
	private void leaveBattlefield() {
		System.out.println("[퇴장] 캐릭터가 전장에 이탈합니다. ");
	}
	
	// 하위 클래스가 반드시 구현해야하는  추상메서드
	
	protected abstract void arrtack();
	protected abstract void useUItimate();
	
}
