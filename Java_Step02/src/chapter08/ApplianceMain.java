package chapter08;

public class ApplianceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appliance a1 = new Samsung("Samsung"); // override 찾기위함. 
		Appliance a2 = new Samsung("Galaxy");
		
		a1.turnOn();
		a2.turnOn();
		
		Appliance[] list = new Appliance[3];
		list[0] = new Samsung("Samsung");
		list[1] = new SamsungTv("Galaxy");
		list[2] = new Samsung("Samsung");
		
		for(Appliance a: list) {
			a.turnOn();
		}
	}

}
