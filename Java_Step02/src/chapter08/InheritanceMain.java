package chapter08;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrawBerry obj  = new StrawBerry();
		obj.Set("Berry", "여름");
		obj.Set2("딸기", "중");
		obj.Set3("빨강",  9900);
		
		obj.Disp();
		System.out.println("-----------");
		obj.Disp2();
		System.out.println("-----------");
		obj.Disp3();
	}

}
