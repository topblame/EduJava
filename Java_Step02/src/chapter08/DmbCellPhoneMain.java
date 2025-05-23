package chapter08;

public class DmbCellPhoneMain {
	public static void main(String[] args) {
		DmbCellPhone dmb = new DmbCellPhone(7, "Galaxy", "Black");
		
		//상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		
		//자식클래스 필드
		System.out.println("채널: " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("모시모시");
		dmb.receiveVoice("전화받았습니다.");
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.changeChannelDmb(5);
		dmb.turnOffDmb();
	}
}
