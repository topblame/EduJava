package chapter08;

public class Samsung extends Appliance{
	public Samsung(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		System.out.println("삼성 세탁기를 작동시킵니다. ");
	}
	
}
