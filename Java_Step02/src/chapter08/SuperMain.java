package chapter08;

public class SuperMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paprica obj = new Paprica();
		
		obj.Set1("피망류", "여름", "노랑 파프리카"); //부모클래스
		
		obj.Set2("빨강", 8000, "빨강 파프리카"); //자식클래스
		
		obj.Disp1();
		obj.Disp2();
	}

}
