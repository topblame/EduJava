package chapter09;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone();
		SmartPhone phone = new SmartPhone("김자바");
		System.out.println(phone.owner+ "님");
		phone.turnOn();
		phone.intersearch();
		phone.turnOff();
	}

}
